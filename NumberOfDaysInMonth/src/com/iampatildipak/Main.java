package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // Examples of input/output:
        //
        //* isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
        //
        //* isLeapYear(1600); → should return true since 1600 is a leap year
        //
        //* isLeapYear(2017); → should return false since 2017 is not a leap year
        //
        //* isLeapYear(2000); → should return true because 2000 is a leap year

        boolean result = NumberOfDaysInMonth.isLeapYear(-1600);
        System.out.println(result);

        result = NumberOfDaysInMonth.isLeapYear(1600);
        System.out.println(result);

        result = NumberOfDaysInMonth.isLeapYear(2017);
        System.out.println(result);

        result = NumberOfDaysInMonth.isLeapYear(2000);
        System.out.println(result);

        //Examples of input/output:
        //
        //* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
        //
        //* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        //
        //* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        //
        //* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
        //
        //* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

        int numberOfDays = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        System.out.println(numberOfDays);

        numberOfDays = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        System.out.println(numberOfDays);

        numberOfDays = NumberOfDaysInMonth.getDaysInMonth(2, 2018);
        System.out.println(numberOfDays);

        numberOfDays = NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
        System.out.println(numberOfDays);

        numberOfDays = NumberOfDaysInMonth.getDaysInMonth(-1, -2020);
        System.out.println(numberOfDays);
    }
}