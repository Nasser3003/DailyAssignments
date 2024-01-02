package com.dailyAssignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Hello World!"));
        System.out.println(isBalanced("((((((()))))"));
        System.out.println(isBalanced("(((())))"));
    }
    public static String reverse(String str) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return String.valueOf(output);
    }
    public static boolean isBalanced(String str) {
        // assuming () doesn't have to be back to back.
        List<Character> openParanthesisList = new LinkedList<>();
        List<Character> closedParanthesisList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openParanthesisList.add(str.charAt(i));
                continue;
            }
            if (str.charAt(i) == ')') {
                closedParanthesisList.add(str.charAt(i));
            }
        }
        return openParanthesisList.size() == closedParanthesisList.size();
    }
}
