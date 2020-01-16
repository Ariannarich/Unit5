package com.company;

public class Item {
    private String number;
    private String description;
    private double price;

   Item(String n, String d, double p)
    {
        number = n;
        description = d;
         price = p;
if(p <= 0)
    price = 0;
    }
    public double getTotalPrice(int quantity)
    {if(quantity<=0)
        quantity = 0;
    double totalP = quantity * price;

return totalP;
    }
    public String toString()
    {
        return "Item: " + number + "\n Price: " + "$" + price + "\n Description: " + description + "\n";
    }

}
