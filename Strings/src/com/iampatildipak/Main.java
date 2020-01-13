package com.iampatildipak;

public class Main {

    public static void main(String[] args) {
        //String is a data type in Java, which is not a primitive data type.
        //It is actually a class.
        //String is a sequence of characters
        //Technically it is limited by memory or the MAX_VALUE of an int which is 2.14 billion

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        //Strings in java are Immutable
    }
}