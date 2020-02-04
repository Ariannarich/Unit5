package com.company;

public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account() {
        this.first = "";
        this.last = "";
        this.balance = 0;
    }

    public Account(String first, String last, double balance, int acctNum) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        this.acctNum = (int) (Math.random() * 999) + 1;
    }

    public Account(String first, String last, double balance) {
        this.first = first;
        this.last = last;
        this.balance = balance;
    }

    public String getFirstName() {
        return first;
    }

    public void setFirstName(String first) {
        this.first = first;
    }

    public String getLastName() {
        return last;
    }

    public void setLastName(String last) {
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
        return "Customer Name: " + first + last + "\n Account #: " + acctNum + "\n Current Balance: " + balance;
    }
}
