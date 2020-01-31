package com.company;

public class TruckTest {
    public static void main(String[] args) {
        Truck t1 = new Truck("123AB");
        Truck t2 = new Truck("456DEF", 45500.0, 18.0, 10.0);

        t1.setMpg(15);
        t1.fill();
        t1.drive(150);
        System.out.println(t1.toString());
        t1.drive(60);
        System.out.println(t1.toString());

        System.out.println(t2.drive(500));
        System.out.println(t2.fill(30));
        t2.fill();
        t2.drive(300);
       System.out.println(t2.toString());
        System.out.println("Total fuel used is " + Truck.getTotalFuel()  + " gallons.");
}
}