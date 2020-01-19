package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // EXAMPLE INPUT/OUTPUT:
        //
        //* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        //
        //* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        //
        //* getEvenDigitSum(-22); → should return -1 since the number is negative

        int result = EvenDigitSum.getEvenDigitSum(123456789);
        System.out.println(result);

        result = EvenDigitSum.getEvenDigitSum(252);
        System.out.println(result);

        result = EvenDigitSum.getEvenDigitSum(121);
        System.out.println(result);

        result = EvenDigitSum.getEvenDigitSum(-22);
        System.out.println(result);
    }
}