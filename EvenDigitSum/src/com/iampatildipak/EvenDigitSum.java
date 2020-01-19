package com.iampatildipak;

public class EvenDigitSum {
    public static boolean isEven(int number) {
        if (number < 0 || number % 2 == 0)
            return true;

        return false;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (isEven(lastDigit)) {
                sum += lastDigit;
            }
            number = number / 10;

        }
        return sum;
    }
}