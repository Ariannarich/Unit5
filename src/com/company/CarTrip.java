package com.company;

public class CarTrip {
    private double getMyStartOdometer;
    private double getMyEndOdometer;
    private double getMyTime;
    private double getMyGallonsUsed;

    public CarTrip(double start, double end, double time, double gallons)
    {
        getMyStartOdometer=start;
        getMyEndOdometer = end;
        getMyTime=time;
        getMyGallonsUsed=gallons;
    }

   public CarTrip()
    {
        getMyStartOdometer = 0;
        getMyEndOdometer = 0;
        getMyTime = 0;
        getMyGallonsUsed = 0;
    }
   public double getTripDistance()
   {
    return getMyEndOdometer - getMyStartOdometer;
   }
    public double getAverageSpeed()
    {
  return getMyTime * (getTripDistance());
    }
    public double getGasMileage()
    {

    return getTripDistance()/ getMyGallonsUsed;

    }
    public double getTotalGasPrice(double pricePerGallon)
    {
    return getMyGallonsUsed * pricePerGallon;
    }
    public String toString()
    {
      return "Distance traveled: " + getTripDistance() + " miles.";

    }

}
