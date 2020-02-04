package com.company;

public class AccTest {
    public static void main(String[] args) {
        Account acc = new Account("Ari", " R ", 10.0, 0);
     acc.deposit(5.0);
        System.out.print(acc);
    }
}