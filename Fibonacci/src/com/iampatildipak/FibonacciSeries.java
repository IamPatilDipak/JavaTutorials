package com.iampatildipak;

public class FibonacciSeries {
    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        int prev1 = 1;
        int prev2 = 0;
        int fib = 1;
        for (int i = 1; i < n; i++) {
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;

        }
        return fib;
    }

    public static int FibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return FibonacciRecursive(n - 2) + FibonacciRecursive(n - 1);
    }
}
