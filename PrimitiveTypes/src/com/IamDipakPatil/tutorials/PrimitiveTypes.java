package com.IamDipakPatil.tutorials;

public class PrimitiveTypes {
    public static void main(String args[]) {
        //There are 8 Primitive Types in Java.
        //boolean
        //byte
        //char
        //short
        //int
        //long
        //float
        //double

        integerTypes();
        byteTypes();
        shortTypes();
        longTypes();
        casting();
        floatAndDouble();
        charType();
        booleanType();
    }

    private static void booleanType() {
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println(myFalseBooleanValue);
        System.out.println(myTrueBooleanValue);
    }

    private static void charType() {
        //Character is 2 byte, 1 byte is reserved for unicode symbol,
        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println("My char= " + myChar);
        System.out.println("My unicode char= " + myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
    }

    private static void floatAndDouble() {
        //Float is Single precision 32 bit type. Precisions are 7 digits
        //Double is double precision 64 bit type. Precisions are 16 digits
        float floatValue = 2.5f;
        //float floatValue1 = 2.5; //Gives incompatible type error
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("Float value= " + floatValue);
        System.out.println("Float minimum value= " + minFloatValue);
        System.out.println("Float maximum value= " + maxFloatValue);


        double doubleValue = 2.5d;
        //double doubleValue1 = 2.5; //No incompatible type error
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double value= " + doubleValue);
        System.out.println("Double minimum value= " + minDoubleValue);
        System.out.println("Double maximum value= " + maxDoubleValue);
    }

    private static void integerTypes() {
        int myValue = 2147483647;
        //int myValue1 = 2147483648; //Error integer number too long
        int myMinInt = Integer.MIN_VALUE; //Integer is a wrapper class
        int myMaxInt = Integer.MAX_VALUE;

        System.out.println("Integer value = " + myValue);

        System.out.println("Integer minimum value = " + myMinInt);
        System.out.println("Integer maximum value = " + myMaxInt);

        System.out.println("Busted MIN value = " + (myMinInt - 1));
        System.out.println("Busted MAX value = " + (myMaxInt + 1));
    }

    private static void byteTypes() {
        byte myValue = 127;
        //byte myValue1 = 128; //Incompatible Type
        byte myMinValue = Byte.MIN_VALUE; //Byte is a wrapper class MIN = -128
        byte myMaxValue = Byte.MAX_VALUE; //                        MAX =  127

        System.out.println("Byte value = " + myValue);

        System.out.println("Byte minimum value = " + myMinValue);
        System.out.println("Byte maximum value = " + myMaxValue);

        System.out.println("Busted MIN value = " + (byte) (myMinValue - 1));
        System.out.println("Busted MAX value = " + (byte) (myMaxValue + 1));

    }

    private static void shortTypes() {
        short myValue = 32767;
        //short myValue1 = 32768; //Incompatible Type
        short myMinValue = Short.MIN_VALUE; //Short is a wrapper class MIN = -32768
        short myMaxValue = Short.MAX_VALUE; //                         MAX =  32767

        System.out.println("Short value = " + myValue);

        System.out.println("Short minimum value = " + myMinValue);
        System.out.println("Short maximum value = " + myMaxValue);

        System.out.println("Busted MIN value = " + (short) (myMinValue - 1));
        System.out.println("Busted MAX value = " + (short) (myMaxValue + 1));
    }

    private static void longTypes() {
        long myValue = 9223372036854775807L;
        //long myValue = 9223372036854775808L; //Incompatible Type
        long myMinValue = Long.MIN_VALUE; //Short is a wrapper class MIN = -32768
        long myMaxValue = Long.MAX_VALUE; //                         MAX =  32767

        System.out.println("Long value = " + myValue);

        System.out.println("Long minimum value = " + myMinValue);
        System.out.println("Long maximum value = " + myMaxValue);

        System.out.println("Busted MIN value = " + (myMinValue - 1));
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
    }

    private static void casting() {

        int myValue = 2147483647;

        int myTotal = (2147483647 / 2);

        byte myNewByteValue = (128 / 2);
    }
}