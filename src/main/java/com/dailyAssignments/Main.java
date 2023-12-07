package com.dailyAssignments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();

        try {
            Circle circle = new Circle(userInput);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
