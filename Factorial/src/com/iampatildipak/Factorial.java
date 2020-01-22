package com.iampatildipak;

public class Factorial {
    public static long factorial(int number) {
        if (number == 0)
            return 0;
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long factorialRecursive(int number) {
        if (number == 0)
            return 1;

        return number * factorialRecursive((number - 1));
    }
}
