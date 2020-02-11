package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (this.denominator < 0 && this.numerator > 0)
        { this.denominator = Math.abs(this.denominator);
            this.numerator = 0- this.numerator;
        }
        else if(this.denominator < 0 && this.numerator > 0)
        {this.denominator = Math.abs(this.denominator);
            this.numerator = 0-this.numerator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        int gcd = reduce(this.numerator, this.denominator);
        this.numerator/=gcd;
        this.denominator/=gcd;
         }

        public Fraction()
        { this(1,1);
    }

    private int reduce ( int m, int n){
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }





/*
public static void reduce(Fraction f1, Fraction f2) {
    for (int i = 0; i < denominator; i++) {
        if (numerator % i == 0 && denominator % i == 0) {
            numerator %= i;
            denominator %= i;
        }
    }
}
*/



    public static Fraction add(Fraction f1, Fraction f2)
    {

    simplify(f1,f2);
        int newDen = f1.denominator * f2.denominator;
        int num1 = f1.numerator * f2.denominator;
        int num2 = f2.numerator * f1.denominator;
        int newNum = num1 + num2;
        return new Fraction(newNum, newDen);
    }

    public static Fraction subtract(Fraction f1, Fraction f2)
    {
        simplify(f1,f2);
        int newDen = f1.denominator * f2.denominator;
        int num1 = f1.numerator * f2.denominator;
        int num2 = f2.numerator * f1.denominator;
        int newNum = num1 - num2;
       return new Fraction(newNum, newDen);
    }
    public static Fraction multiply(Fraction f1, Fraction f2)
    {
        simplify(f1,f2);
        int newDen = f1.denominator * f2.denominator;
        int newNum = f1.numerator * f2.numerator;
        return new Fraction(newNum, newDen);
    }
    public static Fraction divide(Fraction f1, Fraction f2)
    {
        simplify(f1,f2);
        int newDen = f1.denominator * f2.numerator;
        int newNum = f1.numerator * f2.denominator;
        return new Fraction(newNum, newDen);
    }

    public static void simplify(Fraction f1, Fraction f2) {



        }

public String toString(){
        return numerator+"/"+denominator;
}
}
