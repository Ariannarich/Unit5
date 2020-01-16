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


        //input grades for Mary
       student1.inputGrades();
        //print Mary
       student1.getName();
        //use getAverage to calculate & print average for Mary
        student1.getAverage();


        //input grades for Mike
        //print Mike
        //use getAverage to calculate & print average for Mike

    }
}

