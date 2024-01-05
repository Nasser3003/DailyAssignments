package com.dailyAssignments.comparatorExample;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentTor> {
    public AgeComparator() {
    }

    @Override
    public int compare(StudentTor o1, StudentTor o2) {
        return o1.getAge() - o2.getAge();
    }
}