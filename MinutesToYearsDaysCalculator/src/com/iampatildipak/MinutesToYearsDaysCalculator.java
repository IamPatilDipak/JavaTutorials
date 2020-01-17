package com.iampatildipak;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;

        long days = hours / 24;

        long years = days / 365;

        days = days % 365;

        System.out.println(String.format("%d min = %d y and %d d", minutes, years, days));
    }
}