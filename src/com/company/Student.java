package com.company;// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
private String name;
private double score1;
private double score2;

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String n)
    {
        name = n;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter " + name+ "'s score for test one.");
      score1 = input.nextDouble();
        System.out.println("Enter " + name+ "'s score for test two.");
        score2 = input.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
public String getAverage()
{
    double avg = (score1 + score2)/2;
    return "The average score for " + name + " is " + avg;
}

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
public String getName()
{
    return name;
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
    public String toString()
    {
        return "\n Name: " + name + "\n Test one: " + score1 + "\n Test two: " + score2 + "\n";
    }


}
