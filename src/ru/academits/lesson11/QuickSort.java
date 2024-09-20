package ru.academits.lesson11;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array) {
        int arrayLength = array.length;

        if (arrayLength == 0) {
            return;
        }

        sort(array, 0, arrayLength - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (right - left == 0) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }

        int pivot = array[left];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (i < right) {
            sort(array, i, right);
        }

        if (j > left) {
            sort(array, left, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {-1, -4, 2, 4, -5, 7, 17, 20, 18, -5, 0, 17, 0, 0, 0};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        sort(array);
        System.out.println("Quick sorted array: " + Arrays.toString(array));
    }
}