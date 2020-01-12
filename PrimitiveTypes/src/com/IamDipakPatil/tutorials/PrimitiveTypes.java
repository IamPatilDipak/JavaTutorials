package com.IamDipakPatil.tutorials;

public class PrimitiveTypes {
    public static void main(String args[]) {
        //There are Eight Primitive Types in Java.
        //boolean
        //byte
        //char
        //short
        //int
        //long
        //float
        //double

        //integerTypes();
        //byteTypes();
        //shortTypes();
        longTypes();
    }

    private static void integerTypes() {
        int myValue = 2147483647;
        //int myValue1 = 2147483648; //Error integer number too long
        int myMinInt = Integer.MIN_VALUE; //Integer is a wrapper class
        int myMaxInt = Integer.MAX_VALUE;

        System.out.println("Integer value = " + myValue);

        System.out.println("Integer minimum value = " + myMinInt);
        System.out.println("Integer maximum value = " + myMaxInt);

        System.out.println("Busted MIN value = " + (myMinInt-1));
        System.out.println("Busted MAX value = " + (myMaxInt+1));

    }

    private static void byteTypes() {
        byte myValue = 127;
        //byte myValue1 = 128; //Incompatible Type
        byte myMinValue = Byte.MIN_VALUE; //Byte is a wrapper class MIN = -128
        byte myMaxValue = Byte.MAX_VALUE; //                        MAX =  127

        System.out.println("Byte value = " + myValue);

        System.out.println("Byte minimum value = " + myMinValue);
        System.out.println("Byte maximum value = " + myMaxValue);

        System.out.println("Busted MIN value = " + (byte)(myMinValue-1));
        System.out.println("Busted MAX value = " + (byte)(myMaxValue+1));

    }

    private static void shortTypes() {
        short myValue = 32767;
        //short myValue1 = 32768; //Incompatible Type
        short myMinValue = Short.MIN_VALUE; //Short is a wrapper class MIN = -32768
        short myMaxValue = Short.MAX_VALUE; //                         MAX =  32767

        System.out.println("Short value = " + myValue);

        System.out.println("Short minimum value = " + myMinValue);
        System.out.println("Short maximum value = " + myMaxValue);

        System.out.println("Busted MIN value = " + (short)(myMinValue-1));
        System.out.println("Busted MAX value = " + (short)(myMaxValue+1));
    }

    private static void longTypes() {
        long myValue = 9223372036854775807L;
        //long myValue = 9223372036854775808L; //Incompatible Type
        long myMinValue = Long.MIN_VALUE; //Short is a wrapper class MIN = -32768
        long myMaxValue = Long.MAX_VALUE; //                         MAX =  32767

        System.out.println("Long value = " + myValue);

        System.out.println("Long minimum value = " + myMinValue);
        System.out.println("Long maximum value = " + myMaxValue);

        System.out.println("Busted MIN value = " + (myMinValue-1));
        System.out.println("Busted MAX value = " + (myMaxValue+1));
    }

    private static void casting(){

        int myValue = 2147483647;

        int myTotal=(myValue/2);

        byte myNewByteValue= (1288/2);
    }
}