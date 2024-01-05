package com.dailyAssignments.comparatorExample;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentTor> {
    public int compare(StudentTor o1, StudentTor o2) {
        return o1.getName().compareTo(o2.getName());
    }
}