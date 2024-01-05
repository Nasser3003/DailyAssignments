package com.dailyAssignments;


import com.dailyAssignments.comparableExample.StudentAble;
import com.dailyAssignments.comparatorExample.AgeComparator;
import com.dailyAssignments.comparatorExample.NameComparator;
import com.dailyAssignments.comparatorExample.StudentTor;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        StudentAble studentAbleComparable = new StudentAble("name1", 21);
        StudentAble studentAbleComparable2 = new StudentAble("name2", 11);
        StudentAble studentAbleComparable3 = new StudentAble("name3", 31);
        StudentAble studentAbleComparable4 = new StudentAble("name4", 5);
        StudentAble studentAbleComparable5 = new StudentAble("name5", 261);
        PriorityQueue<StudentAble> pqAble = new PriorityQueue<>(StudentAble::compareTo);
        pqAble.offer(studentAbleComparable);
        pqAble.offer(studentAbleComparable2);
        pqAble.offer(studentAbleComparable3);
        pqAble.offer(studentAbleComparable4);
        pqAble.offer(studentAbleComparable5);
        while (!pqAble.isEmpty()) {
            System.out.println(pqAble.poll());
        }
        System.out.println("-----------------------------------");
        StudentTor studentTorComparator = new StudentTor("name6", 21);
        StudentTor studentTorComparator2 = new StudentTor("name2", 12);
        StudentTor studentTorComparator3 = new StudentTor("name3", 24);
        StudentTor studentTorComparator4 = new StudentTor("name4", 50);
        StudentTor studentTorComparator5 = new StudentTor("name5", 60);


        PriorityQueue<StudentTor> pqTor = new PriorityQueue<>(new NameComparator());
        pqTor.offer(studentTorComparator);
        pqTor.offer(studentTorComparator2);
        pqTor.offer(studentTorComparator3);
        pqTor.offer(studentTorComparator4);
        pqTor.offer(studentTorComparator5);

        while (!pqTor.isEmpty()) {
            System.out.println(pqTor.poll());
        }


    }
}
