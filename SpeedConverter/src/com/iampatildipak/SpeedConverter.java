package com.iampatildipak;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = -1;
        double milesConversionConstant = 1.609d;//0.621371d;

        if(kilometersPerHour < 0 )
        {
            return milesPerHour;
        }
        else{
            milesPerHour = Math.round(kilometersPerHour/milesConversionConstant);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour +" mi/h");
    }
}
