package com.iampatildipak;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int KILO_BYTE_RATE = 1024;
        int megabytes = kiloBytes / KILO_BYTE_RATE;
        int remainingKiloBytes = (kiloBytes % KILO_BYTE_RATE);

        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
    }
}