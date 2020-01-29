package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // Example Input/Output - getDigitCount method
        //* getDigitCount(0); should return 1 since there is only 1 digit/
        //* getDigitCount(123); should return 3
        //* getDigitCount(-12); should return -1 since the parameter is negative
        //* getDigitCount(5200); should return 4 since there are 4 digits in the number
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));

        //Example Input/Output - reverse method
        //* reverse(-121); should  return -121
        //* reverse(1212); should return  2121
        //* reverse(1234); should return 4321
        //* reverse(100); should return 1
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(1000));

        //Example Input/Output - numberToWords method
        //* numberToWords(123); should print "One Two Three".
        //* numberToWords(1010); should print "One Zero One Zero".
        //* numberToWords(1000); should print "One Zero Zero Zero".
        //* numberToWords(-12); should print "Invalid Value" since the parameter is negative.

        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }
}
