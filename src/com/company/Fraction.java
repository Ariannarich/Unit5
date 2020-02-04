package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator < 0) {
            denominator = Math.abs(denominator);
            numerator -= numerator * 2;
        }
    }
        public Fraction()
        { this(1,1);
    }
public void reduce() {
    for (int i = 0; i < denominator; i++) {
        if (numerator % i == 0 && denominator % i == 0) {
            numerator %= i;
            denominator %= i;
        }
    }
}
    public static void addPositive(Fraction f1, Fraction f2)
            {
             int  newDen =  f1.denominator * f2.denominator;
                int num1 = f1.numerator * f2.denominator;
                int num2 = f2.numerator * f1.denominator;
                int newNum = num1 + num2;
                return new Fraction() Fraction(newNum, newDen);
            }


          /*  if (numerator % 2 == 0 && denominator % 2 == 0) {
                numerator %= 2;
                denominator %= 0;
            }
        if (numerator % 2 == 0 && denominator % 2 == 0) {
            numerator %= 2;
            denominator %= 0;
        }
        if (numerator % 2 == 0 && denominator % 2 == 0) {
            numerator %= 2;
            denominator %= 0;
        }

           */
        }
