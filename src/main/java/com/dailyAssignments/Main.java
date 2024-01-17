package com.dailyAssignments;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        Appointment appointment = new Appointment(ZonedDateTime.of(2024, 1, 17, 14, 30, 0, 0, ZoneId.systemDefault()), Duration.ofMinutes(90));
        Person person0 = new Person("Nasser", LocalDate.of(1997,10,25));
        Person person1 = new Person("Rod", LocalDate.of(1997,10,25));
        Person person2 = new Person("Josh", LocalDate.of(1997,10,1));
        Person person3 = new Person("Hunter", LocalDate.of(1997,10,27));

        appointment.alert();

        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(person0, person1));
        System.out.println(ageComparator.compare(person1, person2));
        System.out.println(ageComparator.compare(person1, person3));
    }
}
