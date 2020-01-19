package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // EXAMPLE INPUT/OUTPUT:
        //
        //* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
        //
        //* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
        //
        //* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

        boolean result = SharedDigit.hasSharedDigit(12, 23);
        System.out.println(result);

        result = SharedDigit.hasSharedDigit(9, 99);
        System.out.println(result);

        result = SharedDigit.hasSharedDigit(15, 55);
        System.out.println(result);

        result = SharedDigit.hasSharedDigit(44, 14);
        System.out.println(result);

        result = SharedDigit.hasSharedDigit(100, 10);
        System.out.println(result);
    }
}