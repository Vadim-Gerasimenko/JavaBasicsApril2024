package academits.lesson11;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array) {
        int arrayLength = array.length;
        int adjacentPairsCount = arrayLength - 1;

        for (int i = 0; i < adjacentPairsCount; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 3, -5, 3, 17, 0, -4, 4, 22, 2, 1, -1, 3, 4, 5, 6, 7, 8};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        sort(array);
        System.out.println("Selection sorted array: " + Arrays.toString(array));
    }
}