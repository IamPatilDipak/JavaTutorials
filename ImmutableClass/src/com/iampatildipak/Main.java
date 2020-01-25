package com.iampatildipak;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("Inter", 32, 2.5, 500);
        System.out.println(computer.getProcessor());
        System.out.println(computer.getMemory());

        // Below line causes error
        // computer.processor = "AMD";
    }
}