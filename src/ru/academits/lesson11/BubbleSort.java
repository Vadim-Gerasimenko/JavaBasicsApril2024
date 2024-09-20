package ru.academits.lesson11;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        int arrayLength = array.length;
        int adjacentPairsCount = arrayLength - 1;

        for (int i = 0; i < adjacentPairsCount; i++) {
            boolean isSorted = true;

            for (int j = 1; j < arrayLength - i; j++) {
                if (array[j] < array[j - 1]) {
                    isSorted = false;

                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

            if (isSorted) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 1, 2, -1, 2, 2, 16, 3, 3, 4, 5, 6, 7, 8};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        sort(array);
        System.out.println("Bubble sorted array: " + Arrays.toString(array));
    }
}