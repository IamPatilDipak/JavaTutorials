package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // Example input/output:
        //
        //* sumOdd(1, 100); → should return 2500
        //
        //* sumOdd(-1, 100); →  should return -1
        //
        //* sumOdd(100, 100); → should return 0
        //
        //* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
        //
        //* sumOdd(100, -100); → should return -1
        //
        //* sumOdd(100, 1000); → should return 247500

        int sum = SumOddRange.sumOdd(1, 100);
        System.out.println(sum);

        sum = SumOddRange.sumOdd(-1, 100);
        System.out.println(sum);

        sum = SumOddRange.sumOdd(100, 100);
        System.out.println(sum);

        sum = SumOddRange.sumOdd(13, 13);
        System.out.println(sum);

        sum = SumOddRange.sumOdd(100, -100);
        System.out.println(sum);

        sum = SumOddRange.sumOdd(100, 1000);
        System.out.println(sum);
    }
}