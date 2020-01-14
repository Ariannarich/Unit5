package com.company;

import java.util.Scanner;

public class SquareDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        Square s = new Square(num);
        System.out.println(s.calculateArea());
        System.out.println(s);
    }


}

