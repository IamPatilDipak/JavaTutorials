package com.iampatildipak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);

        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }


    }
}
