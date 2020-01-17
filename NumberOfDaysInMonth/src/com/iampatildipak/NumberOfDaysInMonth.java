package com.iampatildipak;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year <= 0 || year > 9999) {
            leapYear = false;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999))
            return -1;

        int numberOfDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year))
                    numberOfDays = 29;
                else
                    numberOfDays = 28;
                break;
            default:
                numberOfDays = 30;
                break;
        }
        return numberOfDays;
    }
}