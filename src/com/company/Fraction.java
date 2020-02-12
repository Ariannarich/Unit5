package com.company;

/**
 * @author Arianna Richardson
 * @since February 5th, 2020.
 * This program calculates the values of two different fractions using arithmetic equations.
 */

/**
 * Start code:
 * Declares the numerator and denominator variables
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Constructor for Fraction object.
     * @param numerator numerator of fraction
     * @param denominator denominator of fraction
     * Also, simplifies fractions using the greatest common divisor,
     * and switches negative sign from the denominator to the numerator.
     */
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;

        int gcd = Math.abs(reduce(this.numerator, this.denominator));
        if(this.denominator < 0 )
        {this.denominator = Math.abs(this.denominator);
            this.numerator = -this.numerator;
        }
        this.numerator/=gcd;
        this.denominator/=gcd;
         }

    /**
     * Constructor for a default Fraction object.
     */
        public Fraction()
        { this(1,1);
    }

    /**
     * Finds the greatest common divisor (GCD) of two values to reduce fractions with.
     * @param m value 1
     * @param n value 2
     * @return returns GCD
     */
   private int reduce ( int m, int n){
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }


    /** method adds two fractions together and returns new Fraction object.
     * @param f1 Fraction object 1
     * @param f2 Fraction object 2
     *
     * @return returns sum as a new Fraction object.
     */
    public static Fraction add(Fraction f1, Fraction f2)
    {

        int newDen = f1.denominator * f2.denominator;
        int num1 = f1.numerator * f2.denominator;
        int num2 = f2.numerator * f1.denominator;
        int newNum = num1 + num2;
        return new Fraction(newNum, newDen);
    }

    /**
     * method subtracts two fractions from each other
     * @param f1 Fraction object 1
     * @param f2 Fraction object 2
     *
     * @return returns difference as a new Fraction object.
     */
    public static Fraction subtract(Fraction f1, Fraction f2)
    {
        int newDen = f1.denominator * f2.denominator;
        int num1 = f1.numerator * f2.denominator;
        int num2 = f2.numerator * f1.denominator;
        int newNum = num1 - num2;
       return new Fraction(newNum, newDen);
    }
    /**
     * method multiplies two fractions together and returns new Fraction object.
     * @param f1 Fraction object 1
     * @param f2 Fraction object 2
     *
     * @return returns product as a new Fraction object.
     */
    public static Fraction multiply(Fraction f1, Fraction f2)
    {
        int newDen = f1.denominator * f2.denominator;
        int newNum = f1.numerator * f2.numerator;
        return new Fraction(newNum, newDen);
    }
    /**
     * method divides two fractions and returns new Fraction object.
     * @param f1 Fraction object 1
     * @param f2 Fraction object 2
     *
     * @return returns quotient as a new Fraction object.
     */
    public static Fraction divide(Fraction f1, Fraction f2)
    {
        int newDen = f1.denominator * f2.numerator;
        int newNum = f1.numerator * f2.denominator;
        return new Fraction(newNum, newDen);
    }


    /**
     * String method that prints fraction answer from equations
     * @return returns fraction as string
     */
    public String toString(){
        return numerator+"/"+denominator;
}
}
