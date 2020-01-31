package com.company;

public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private double CAPACITY = 20.0;
    private static double totalFuel;

public Truck(String id)
{
    truckID = id;
}
public Truck(String id, double od, double m, double f)
{ truckID =id;
    odometer=od;
    mpg = m;
    fuel = f;

}
public double getOdometer()
{
    return odometer;
}
public double getFuel()
    {
        return fuel;
    }
    public void setMpg()
    {
        mpg = fuel/ odometer;
    }
    public double getMpg(double m)
    {
        return mpg = m;
    }
    public String getTruckID()
    {
        return truckID;
    }
public boolean enoughFuel()
{
    if(fuel >= CAPACITY  || fuel< mpg)
        return false;
    else
        return true;
}
public String drive(double miles) {

    odometer += miles;

    String blank = "";
    if (enoughFuel() == false)
        blank += "Truck" + truckID + " does not have enough fuel to drive " + odometer + "miles.";
    else{
        blank += "Success";
    for (double i = odometer; i >= mpg; i/=mpg );
    fuel--;
}
    return blank;

}
public void fill()
{
    while(fuel < CAPACITY)
    {
        fuel++;
    }

}

public void fill(double gal)
    {
        if (gal > totalFuel)
            System.out.println("Gallons exceed tank capacity.");
       fuel += gal;
    }
public static double getTotalFuel()
{
    return totalFuel;
}
public String toString()
{
    return "Truck: " + truckID + "\n " + "Odometer: " + odometer+ "\n "+ "Miles Per Gallon: " + mpg + "\n " + "Fuel: " + fuel;
}
}
