package com.company;

public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;


    public Account(String first, String last, double balance) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        this.acctNum = (int) (Math.random() * 999) + 1;
    }
    public Account() {
        this("", "", 0.0);
    }
    public Account(Account acct2) {
        this(acct2.first, acct2.last, acct2.balance);
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void deposit(double dep) {
        balance += dep;
    }
    public boolean withdrawal(double with)
    {
        balance-=with;
        if ( balance < 0) {
            balance += with;
            return false;
        }
        else
            return true;

    }
    public String  toString(){
        return "Customer Name: " + first+" "+ last + "\nAccount #: " + acctNum + "\nCurrent Balance: $" + balance;
    }
}
