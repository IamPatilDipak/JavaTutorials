package com.iampatildipak;

import java.util.ArrayList;

public class GearBox {
    private int count = 10;

    ArrayList<Gear> gears = new ArrayList<>();

    public void print() {
        System.out.println("This is gear box print method");
    }

    /**
     * Inner class
     **/
    class Gear {

        public void print() {
            System.out.println("This is gear print method");

            Shaft shaft = new Shaft();
            shaft.print();

            System.out.println("Total number of gears " + count);
        }
    }

    /**
     * Private Inner class
     **/
    private class Shaft {
        public void print() {
            System.out.println("This is shaft print method");

            /*Method-local Inner Class**/
            class Pulley {
                public String test;
                //public static String test2; Inner classes cannot have static declarations

                public void print() {
                    System.out.println("This is pulley print method");
                }
            }

            Pulley pulley = new Pulley();
            pulley.print();
        }
    }
}