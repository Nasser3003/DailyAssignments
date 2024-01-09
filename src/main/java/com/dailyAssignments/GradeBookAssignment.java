package com.dailyAssignments;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class GradeBookAssignment {
    private Map<Student, List<Assignment>> map = new HashMap<>();

    public double calculateAverageGrade(Student student) {
        List<Assignment> studentAssingments = map.get(student);
        double studentScores = 0;
        for (Assignment s : studentAssingments) {
            studentScores += s.getScore();
        }
        return studentScores / studentAssingments.size();
    }
    public void addStudentGrade(Student student, List<Assignment> assignment) {
        map.put(student, assignment);
    }

    public Student findTopStudent() {
        Set<Student> allStudents = map.keySet();
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
