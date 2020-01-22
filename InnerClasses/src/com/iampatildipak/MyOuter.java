package com.iampatildipak;

public class MyOuter {
    static class Nested_Demo {
        public void my_method() {
            System.out.println("This is my nested class");
        }
    }

    public static void main(String[] args) {
        MyOuter.Nested_Demo nested = new MyOuter.Nested_Demo();
        nested.my_method();
    }
}