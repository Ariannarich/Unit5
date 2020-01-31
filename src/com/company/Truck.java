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
    public void setMpg(double miles)
    {
        mpg = miles;
    }
    public double getMpg()
    {
        return mpg;
    }
    public String getTruckID()
    {
        return truckID;
    }

    public boolean enoughFuel(double miles)
{
    double distance = fuel * mpg;
    if( miles > distance )
        return false;
    else
        return true;
}
public String drive(double miles2) {

    String blank = "";
    if (!enoughFuel(miles2))
        blank += "Truck " + truckID + " does not have enough fuel to drive " + miles2 + " miles.";
    else {
        blank += "Success";
        odometer += miles2;

        double fuelUsed = miles2 / mpg;

        fuel -= fuelUsed;

    }
    return blank;
}
public void fill()
{
    totalFuel = fuel;
    while (fuel < CAPACITY)
    {
        fuel++;
    }
    totalFuel += fuel;
}
public String fill(double gal) {
    String blank = "";
    if (gal > CAPACITY)
            blank += "Truck " + truckID + ": Gallons exceeds tank capacity";
    return blank;
}

public static double getTotalFuel()
{
    return totalFuel;
}
public String toString()
{
    return "Truck: " + truckID + "\n" + "Odometer: " + odometer+ "\n"+ "Miles Per Gallon: " + mpg + "\n" + "Fuel: " + fuel;
}
}