package academits.lesson11;

import java.util.Arrays;

public class BubbleSortRepeat {
    public static void sort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
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
        int[] array = {0, 1, -1, 2, 2, 3, 2};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        sort(array);
        System.out.println("Bubble sorted array: " + Arrays.toString(array));
    }
}