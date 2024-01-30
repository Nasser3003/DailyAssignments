package com.dailyAssignments;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pathToRead = "src/main/java/com/dailyAssignments/data/words_alpha.txt";
        String pathToWrite = "src/main/java/com/dailyAssignments/data/long_words.txt";

        Reader reader = new Reader();
        Writer writer = new Writer();

        System.out.println(reader.findLongestWordAmazing(pathToRead));
        System.out.println(reader.findLongestWordRegular(pathToRead));

        List<String> OverNumberLetters = reader.findWordsOverNLetters(pathToRead, 24);
        writer.writeIntoFile(pathToWrite, OverNumberLetters);

        reader.printAllWords(pathToWrite);
        reader.printAllWordsTheLazyWay(pathToWrite);
        reader.printAllWordsTheCoolWay(pathToWrite);



    }
}
