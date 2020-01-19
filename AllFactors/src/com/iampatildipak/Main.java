package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        // EXAMPLE INPUT/OUTPUT:
        //
        //* printFactors(6); → should print 1 2 3 6
        //
        //* printFactors(32); → should print 1 2 4 8 16 32
        //
        //* printFactors(10); → should print 1 2 5 10
        //
        //* printFactors(-1); → should print "Invalid Value" since number is < 1

        FactorPrinter.printFactors(6);
        System.out.println("-----------------------");
        FactorPrinter.printFactors(32);
        System.out.println("-----------------------");
        FactorPrinter.printFactors(10);
        System.out.println("-----------------------");
        FactorPrinter.printFactors(-1);
    }
}
