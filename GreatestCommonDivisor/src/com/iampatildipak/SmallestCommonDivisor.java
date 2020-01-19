package com.iampatildipak;

public class SmallestCommonDivisor {
    public static int getSmallestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        while (first != 0) {
            if (second > first)
                second = second - first;
            else
                first = first - second;
        }
        return second;
    }

    public static int SCD(int first, int second) {
        if (first == 0)
            return second;
        return SCD(second % first, first);
    }
}