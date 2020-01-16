package com.company;

public class Hardware {
    public static void main(String[] args) {
        Item one = new Item("4343", "Circular Saw", 122.5);
        Item two = new Item("9876", "Hammer", 19.75);
        Item three = new Item("1239", "Level", 12.99);


        System.out.println(one.getTotalPrice(2));
        System.out.println(two.getTotalPrice(5));
        System.out.println(three.getTotalPrice(12));

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}

