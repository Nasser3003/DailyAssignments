package com.dailyAssignments;

public class Main {
    public static void main(String[] args) {

        Runner car = new Runner("Car", 100, 2.5);
        Runner scooter = new Runner("scooter", 100, 1.5);

        Thread thread1 = new Thread(car);
        Thread thread2 = new Thread(scooter);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("winner is: " + Runner.winner);
    }
}
