package com.dailyAssignments;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Wednesday {

    private static final HashMap<Character, String> alphabet;
    static {
        alphabet = new HashMap<>();

        alphabet.put('A', "Alpha");
        alphabet.put('B', "Bravo");
        alphabet.put('C', "Charlie");
        alphabet.put('D', "Delta");
        alphabet.put('E', "Echo");
        alphabet.put('F', "Foxtrot");
        alphabet.put('G', "Golf");
        alphabet.put('H', "Hotel");
        alphabet.put('I', "India");
        alphabet.put('J', "Juliet");
        alphabet.put('K', "Kilo");
        alphabet.put('L', "Lima");
        alphabet.put('M', "Mike");
        alphabet.put('N', "November");
        alphabet.put('O', "Oscar");
        alphabet.put('P', "Papa");
        alphabet.put('Q', "Quebec");
        alphabet.put('R', "Romeo");
        alphabet.put('S', "Sierra");
        alphabet.put('T', "Tango");
        alphabet.put('U', "Uniform");
        alphabet.put('V', "Victor");
        alphabet.put('W', "Whiskey");
        alphabet.put('X', "X-ray");
        alphabet.put('Y', "Yankee");
        alphabet.put('Z', "Zulu");
    }

    public static void spellName(String spellName) {
        char[] charArray = spellName.toUpperCase().toCharArray();

        for (Character c : charArray) {
            System.out.println(c + " as in " + alphabet.get(c));
        }
    }
    public static void spellNameList(String spellName) {
        List<Character> charList = spellName.toUpperCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        charList.forEach(c -> System.out.println(c + " as in " + alphabet.get(c)));
    }
}