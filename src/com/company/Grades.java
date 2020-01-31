package com.company;

// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");



        student1.inputGrades();
        student1.getName();
        double avg = student1.getAverage();
        System.out.println(avg);
        System.out.println(student1);


        student2.getName();
        student2.inputGrades();
        double avg2 = student2.getAverage();
        System.out.println(avg2);
        System.out.println(student2);

    }
}

