package com.dailyAssignments;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class GradeBook {
    private Map<Student, List<Double>> map = new HashMap<>();

    public double calculateAverageGrade(Student student) {
        List<Double> studentGrades = map.get(student);
        double totalGrades = studentGrades.stream().reduce(0.0, Double::sum);
        return totalGrades / studentGrades.size();
    }
    public void addStudentGrade(Student student, List<Double> grades) {
        map.put(student, grades);
    }

    public Student findTopStudent() {
        Set<Student> allStudents =map.keySet();
        Student highestStudent = null;
        double highestStudentGrades = 0;

        for (Student s : allStudents) {
            double studentGrades = calculateAverageGrade(s);
            if (studentGrades > highestStudentGrades) {
                highestStudentGrades = studentGrades;
                highestStudent = s;
            }
        }
        return highestStudent;
    }
    public double calculateClassAverage() {
        Set<Student> allStudents = map.keySet();
        int numberOfStudents = map.size();
        double gradeOfAllStudents = 0;

        for (Student s : allStudents) {
            gradeOfAllStudents += calculateAverageGrade(s);
        }
        return numberOfStudents == 0 ? 0 : gradeOfAllStudents / numberOfStudents;
    }
}
