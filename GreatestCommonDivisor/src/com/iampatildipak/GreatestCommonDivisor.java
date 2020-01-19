package com.iampatildipak;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        while (second != 0) {
            if (first > second)
                first = first - second;
            else
                second = second - first;
        }
        return first;
    }


    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}
