package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        //Examples of input/output:
        //* isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
        //* isLeapYear(1600); → should return true since 1600 is a leap year
        //* isLeapYear(2017); → should return false since 2017 is not a leap year
        //* isLeapYear(2000);  → should return true because 2000 is a leap year

        boolean isLeapYear = LeapYear.isLeapYear(0);
        if (isLeapYear) {
            System.out.println("Year is leap year!");
        } else {
            System.out.println("Year is not leap year!");
        }
    }
}
