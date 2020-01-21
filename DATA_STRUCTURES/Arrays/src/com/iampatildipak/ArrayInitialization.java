package com.iampatildipak;

import java.util.Scanner;

public class ArrayInitialization {
    private static Scanner scanner = new Scanner(System.in);

    public static void test() {
        // First way to initialize array
        int[] myArrayFirstWay = new int[10]; //int myArrayFirstWay [] = new int [10]; also allowed.
        myArrayFirstWay[0] = 45;
        myArrayFirstWay[5] = 50;
        myArrayFirstWay[9] = 55;
        System.out.println(myArrayFirstWay.length);

        // Second way to initialize array
        int[] myArraySecondWay = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myArraySecondWay.length);

        // Third way to initialize array
        int[] myArrayThirdWay = new int[10];
        for (int i = 0; i < 10; i++) {
            myArrayThirdWay[i] = i * 10;
        }
        printArray(myArrayThirdWay);

        int[] values = getIntegers(5);
        printArray(values);
        System.out.println(getAverage(values));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\n" +
                "");
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}