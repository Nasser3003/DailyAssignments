package com.dailyAssignments.comparableExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class StudentAble implements Comparable<StudentAble>{
    private String name;
    private int age;

    @Override
    public int compareTo(StudentAble o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
