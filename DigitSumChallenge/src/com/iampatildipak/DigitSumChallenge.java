package com.iampatildipak;

public class DigitSumChallenge {
    public static int sumDigits(int number) {
        if (number < 10)
            return -1;

        int sum = 0;

        while (number > 0) {
            //extract least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number = number / 10;
        }
        return sum;
    }
}
