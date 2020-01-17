package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // Example Input/Output
        //
        //isPalindrome(-1221); → should return true
        //
        //isPalindrome(707); → should return true
        //
        //isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

        boolean result = NumberPalindrome.isPalindrome(-1221);
        System.out.println(result);

        result = NumberPalindrome.isPalindrome(707);
        System.out.println(result);

        result = NumberPalindrome.isPalindrome(11212);
        System.out.println(result);

        result = NumberPalindrome.isPalindrome(9);
        System.out.println(result);
    }
}