package com.dailyAssignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Athlete> athletes = new ArrayList<>(8);
        athletes.add(new Athlete("Jack Nicklaus", 75, 595));
        athletes.add(new Athlete("Lindsey Vonn", 82, 395));
        athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
        athletes.add(new Athlete("Novak Djokovic", 92, 280));
        athletes.add(new Athlete("Rafael Nadal", 92, 304));
        athletes.add(new Athlete("Roger Federer", 103, 367));
        athletes.add(new Athlete("Serena Williams", 73, 240));
        athletes.add(new Athlete("Tiger Woods", 82, 395));
        athletes.sort(Athlete::compareTo);
        athletes.forEach(System.out::println);

        System.out.println("--------------------------");

        List<Athlete2> athletes2 = new ArrayList<>(8);
        athletes2.add(new Athlete2("Jack Nicklaus", 75, 595));
        athletes2.add(new Athlete2("Lindsey Vonn", 82, 395));
        athletes2.add(new Athlete2("Mikaela Shiffrin", 82, 232));
        athletes2.add(new Athlete2("Novak Djokovic", 92, 280));
        athletes2.add(new Athlete2("Rafael Nadal", 92, 304));
        athletes2.add(new Athlete2("Roger Federer", 103, 367));
        athletes2.add(new Athlete2("Serena Williams", 73, 240));
        athletes2.add(new Athlete2("Tiger Woods", 82, 395));
        athletes2.sort(new Athlete2WinRateComparator());
        athletes2.forEach(System.out::println);

        System.out.println("--------------------------");

        List<Athlete> bonus1 = new ArrayList<>(2);
        bonus1.add(new Athlete("Sean Carter", 1, 2));
        bonus1.add(new Athlete("Mikaela Shiffrin", 82, 232));
        Collections.sort(bonus1);
        bonus1.forEach(System.out::println);

        System.out.println("--------------------------");

        List<Athlete2> bonus2 = new ArrayList<>(2);
        bonus2.add(new Athlete2("Sean Carter", 1, 2));
        bonus2.add(new Athlete2("Mikaela Shiffrin", 82, 232));
        bonus2.sort(new Athlete2WinRateComparator());
        bonus2.forEach(System.out::println);
    }
}