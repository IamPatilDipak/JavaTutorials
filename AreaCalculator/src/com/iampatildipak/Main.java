package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // Examples of input/output:
        //
        //* area(5.0); should return 78.53975
        //
        //* area(-1);  should return -1 since the parameter is negative
        //
        //* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
        //
        //* area(-1.0, 4.0);  should return -1 since first the parameter is negative

        double result = AreaCalculator.area(5.0);
        System.out.println(result);

        result = AreaCalculator.area(-1);
        System.out.println(result);

        result = AreaCalculator.area(5.0, 4.0);
        System.out.println(result);

        result = AreaCalculator.area(-1.0, 4.0);
        System.out.println(result);
    }
}