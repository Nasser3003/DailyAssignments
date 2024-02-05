package com.dailyAssignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Reader implements Runnable {
    private final ExecutorService executor = Executors.newFixedThreadPool(12);
    private final String path;
    private final String word;
    private final AtomicLong totalOccurrences = new AtomicLong();

    public Reader(String path, String word) {
        this.path = path;
        this.word = word;
    }

    @Override
    public void run() {
        List<long[]> indexes = divideTextIndexes();
        indexes.forEach(index -> executor.execute(() -> numberOfOccurrences(index)));
        executor.shutdown();
        try {
            if (executor.awaitTermination(1, TimeUnit.SECONDS))
                System.out.println(totalOccurrences);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void numberOfOccurrences(long[] indexes) {
        long occurrences = 0;
        String[] words = getWords(indexes);
        for (String w : words) {
            if (w.equals(word)) {
                occurrences++;
            }
        }
        totalOccurrences.addAndGet(occurrences);
    }
    private String[] getWords(long[] indexes) {
        long startIndex = indexes[0];
        long endIndex = indexes[1];
        StringBuilder allLines = new StringBuilder();

        long currLine = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (currLine >= startIndex && currLine <= endIndex)
                    allLines.append(line);
                currLine++;
            }
            return allLines.toString().split("\\s+");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private List<long[]> divideTextIndexes() {
        long numberLines = CountingWhales.numberOfLines(path);
        int numberOfChunks = 6;
        long linesPerChunks = numberLines / numberOfChunks;
        List<long[]> startAndEndIndexes = new ArrayList<>();
        for (int i = 0; i < numberOfChunks; i++) {
            long startIndex = i * linesPerChunks;
            long endIndex = startIndex + linesPerChunks - 1; // to make all end indexes inclusive
            if (i == numberOfChunks - 1) endIndex = numberLines - 1; // last index should max the array since it might not be symmetrical
            startAndEndIndexes.add(new long[]{startIndex, endIndex});
        }
        return startAndEndIndexes;
    }
}
