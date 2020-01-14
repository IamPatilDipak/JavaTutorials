package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        //Examples of input/output:
        //* toMilesPerHour(1.5); → should return value 1
        //* toMilesPerHour(10.25); → should return value 6
        //* toMilesPerHour(-5.6); → should return value -1
        //* toMilesPerHour(25.42); → should return value 16
        //* toMilesPerHour(75.114); → should return value 47

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}
