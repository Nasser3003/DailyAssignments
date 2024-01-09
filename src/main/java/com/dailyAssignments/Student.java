package com.dailyAssignments;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Student {
    private static int numberOfStudents;
    private String firstName;
    private String lastName;

    public Student() {
        this.id = numberOfStudents;
    }

    public Student(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Setter(AccessLevel.NONE)
    private long id;

}
