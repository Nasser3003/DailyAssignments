package com.dailyAssignments;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        if (o1.getDateOfBirth().isAfter(o2.getDateOfBirth()))
            return -1;
        else if (o1.getDateOfBirth().isBefore(o2.getDateOfBirth()))
            return 1;
        return 0;
    }
}
