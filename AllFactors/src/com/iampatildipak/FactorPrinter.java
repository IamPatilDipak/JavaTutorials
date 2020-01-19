package com.iampatildipak;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int start = 1; start <= number; start++) {
            if (number % start == 0)
                System.out.println(start);
        }
    }
}
