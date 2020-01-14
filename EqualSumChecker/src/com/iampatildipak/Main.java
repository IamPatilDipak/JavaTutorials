package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // EXAMPLES OF INPUT/OUTPUT:
        //
        //* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
        //
        //* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
        //
        //* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0

        boolean result = EqualSumChecker.hasEqualSum(1, 1, 1);

        System.out.println(result);
    }
}
