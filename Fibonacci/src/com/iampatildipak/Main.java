package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // The first 10 fibonacci numbers are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

        for (int i = 0; i <= 10; i++) {
            int fib = FibonacciSeries.Fibonacci(i);
            System.out.println(fib);
        }

        for (int i = 0; i <= 10; i++) {
            int fib = FibonacciSeries.FibonacciRecursive(i);
            System.out.println(fib);
        }
    }
}