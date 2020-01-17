package com.iampatildipak;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int numberToCheck = Math.abs(number);
        while (numberToCheck > 0) {
            int lastDigit = numberToCheck % 10;

            reverse = reverse * 10;

            reverse += lastDigit;

            numberToCheck = numberToCheck / 10;
        }

        if (reverse == Math.abs(number)) {
            return true;
        }
        return false;
    }
}