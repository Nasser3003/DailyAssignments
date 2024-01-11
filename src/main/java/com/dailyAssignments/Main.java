package com.dailyAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> charOccurrencesTracker = new HashMap<>();
        String sentence = "The quick brown fox jumps over the lazy dog.";
//        String sentence = "Testing 1 2 3 4 ... testing 1 2 3 4";

        String englishCharactersRegex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(englishCharactersRegex);

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            Matcher matcher = pattern.matcher(String.valueOf(currentChar));
            if (matcher.matches())
                charOccurrencesTracker.put(currentChar, charOccurrencesTracker.getOrDefault(currentChar, 0) + 1);
        }
        System.out.println(charOccurrencesTracker);
    }
}
