package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // The first 10 factorials are: 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.

        for (int i = 0; i <= 10; i++) {
            System.out.println(Factorial.factorial(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(Factorial.factorialRecursive(i));
        }
    }
}
