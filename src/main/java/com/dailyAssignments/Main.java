package com.dailyAssignments;

public class Main {
    public static void main(String[] args) {
        CoffeMug coffee = new CoffeMug(10);
        GasTank gasTank = new GasTank(500);

        coffee.fill(11);

        gasTank.fill();
        gasTank.empty(2);
        gasTank.empty(500);
    }
}