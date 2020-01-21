package com.iampatildipak;

public class DescendingOrderArray {

    public static void sort() {

        int[] numbers = ArrayInitialization.getIntegers(5);
        int[] sortedNumbers = sortArray(numbers);
        ArrayInitialization.printArray(sortedNumbers);
    }

    public static int[] sortArray(int[] numbers) {

        int[] sortedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            sortedArray[i] = numbers[i];
        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}