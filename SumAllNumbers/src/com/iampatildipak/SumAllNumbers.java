package com.iampatildipak;

public class SumAllNumbers {
    public static int nSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int nSum1(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
