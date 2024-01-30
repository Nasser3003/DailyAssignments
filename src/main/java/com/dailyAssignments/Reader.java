package com.dailyAssignments;

import lombok.AllArgsConstructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
public class Reader {

    public List<String> findWordsOverNLetters(String pathToRead, int moreThanNumberOfLetters) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToRead))) {
            List<String> output = new ArrayList<>();
            reader.lines().forEach(line -> {
                String[] words = line.split(" ");
                for (String w : words)
                    if (w.length() > moreThanNumberOfLetters)
                        output.add(w);
            });
            return output;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printAllWords(String pathToRead) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToRead))) {
            reader.lines().forEach(line -> {
                String[] words = line.split(" ");
                for (String w : words)
                    System.out.println(w);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        intellij said implicit call and suggested this... makes sense call to String in all instead of individuall everytime
           ME         reader.lines().forEach(l -> output.append(l.split("\\s+")));
           INTELLIJ   reader.lines().forEach(l -> output.append(Arrays.toString(l.split("\\s+"))));
     */

    // replaces the spaces in LINES not WORDS
    public void printAllWordsTheCoolWay(String pathToRead) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToRead))) {
            StringBuilder output = new StringBuilder();
            reader.lines().forEach(l -> output.append(l.replace(" ", "\n")));
            System.out.println(output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void printAllWordsTheLazyWay(String pathToRead) {
        findWordsOverNLetters(pathToRead, 0).forEach(System.out::println);
    }

    public String findLongestWordAmazing(String pathToRead) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToRead))) {
            return reader.lines()
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .max(Comparator.comparingInt(String::length))
                    .orElse(null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        there was a compilation error when using
        String longestWord = "";
        intellij mentioned that variables used in lambda expressions must be final or effectively final
         and recommended me this fix

         I tried using the final keyword didn't solve it. must be an array, because there is 2 lambdas nested
     */
    public String findLongestWordRegular(String pathToRead) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToRead))) {
            final String[] longestWord = {""};
            reader.lines().forEach(line -> {
                String[] words = line.split(" ");
                for (String word : words)
                    if (word.length() > longestWord[0].length())
                        longestWord[0] = word;
            });
            return longestWord[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
