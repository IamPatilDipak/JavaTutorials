package com.iampatildipak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Dipak");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i)); //Autoboxing
        }

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + "-->" + integerArrayList.get(i).intValue());//Unboxing
        }

        Integer myIntValue = 56; //Autoboxing
        int myInt = myIntValue.intValue(); //UnBoxing
    }
}