package com.iampatildipak;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1 || number < 6)
            return false;

        int sum = 1;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number)
            return true;

        return false;
    }
}