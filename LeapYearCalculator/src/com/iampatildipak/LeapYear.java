package com.iampatildipak;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year <= 0 || year > 9999) {
            leapYear = false;
        }else if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                    leapYear = true;
        } else {
                leapYear = false;
        }
        
        return leapYear;
    }
    /*public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year <= 0 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        return leapYear;
    }*/
}
