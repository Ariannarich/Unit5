package com.company;

public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip (double start, double end, double time, double gallons)
    {
        myStartOdometer = start;
        myEndOdometer = end;
        myTime = time;
        myGallonsUsed=gallons;
    }

   public CarTrip()
    {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0;
        myGallonsUsed = 0;
    }
   public double getTripDistance()
   {
    return myEndOdometer - myStartOdometer;
   }
  public double getMyGallonsUsed()
    {
 return myGallonsUsed;
    }
    public double getMyTime()
    {
return myTime;
    }
    public double getMyStartOdometer() {
        return myStartOdometer;
    }
    public double getMyEndOdometer() {
        return myEndOdometer;
    }
    public double getAverageSpeed()
    {
    if (myTime == 0)
{
    return 0;
}
  return  getTripDistance()/ myTime;
    }

    public double getGasMileage() {
        if (myGallonsUsed == 0)
        {
            return 0;
        }

    return getTripDistance() / myGallonsUsed;
    }
    public double getTotalGasPrice(double pricePerGallon)
    {
    return myGallonsUsed * pricePerGallon;
    }

    public void setGallon(double setMyGallonsUsed)
    {
        myGallonsUsed = setMyGallonsUsed;
    }
    public void setEnd(double end)
    {
        myEndOdometer = end;
    }
    public void setStart(double start)
    {
        myStartOdometer = start;
    }
    public void setTime(double time)
    {
        myTime = time;
    }
    public String toString()
    {
      return "Distance traveled: " + getTripDistance() + " miles";

    }


}
