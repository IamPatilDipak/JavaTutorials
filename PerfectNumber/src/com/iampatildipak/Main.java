package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // EXAMPLE INPUT/OUTPUT:
        //
        //* isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        //
        //* isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        //
        //* isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
        //
        //* isPerfectNumber(-1); should return false since the number is < 1

        boolean result = PerfectNumber.isPerfectNumber(6);
        System.out.println(result);

        result = PerfectNumber.isPerfectNumber(28);
        System.out.println(result);

        result = PerfectNumber.isPerfectNumber(5);
        System.out.println(result);

        result = PerfectNumber.isPerfectNumber(-1);
        System.out.println(result);
    }
}
