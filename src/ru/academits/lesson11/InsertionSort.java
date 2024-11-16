package academits.lesson11;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        int arrayLength = array.length;

        for (int i = 1; i < arrayLength; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 7, 3, 0, -6, 6, 7, 3, -1};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        sort(array);
        System.out.println("Insertion sorted array: " + Arrays.toString(array));
    }
}