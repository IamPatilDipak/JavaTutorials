package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // EXAMPLES OF INPUT/OUTPUT:
        //
        //* hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
        //
        //* hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
        //
        //* hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

        boolean result = TeenNumberChecker.hasTeen(9, 99, 19);

        System.out.println(result);
    }
}
