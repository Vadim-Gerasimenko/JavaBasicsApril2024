package academits.lesson11;

import java.util.Arrays;

public class HeapSort {
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void sift(int[] array, int arrayLength, int index) {
        int currentIndex = index;

        while (currentIndex < arrayLength / 2) {
            int leftChildIndex = 2 * currentIndex + 1;

            if (leftChildIndex == arrayLength - 1) {
                if (array[leftChildIndex] > array[currentIndex]) {
                    swap(array, currentIndex, leftChildIndex);
                }

                return;
            }

            int rightChildIndex = 2 * currentIndex + 2;
            int maxChildIndex = array[leftChildIndex] > array[rightChildIndex] ? leftChildIndex : rightChildIndex;

            if (array[maxChildIndex] <= array[currentIndex]) {
                return;
            }

            swap(array, currentIndex, maxChildIndex);
            currentIndex = maxChildIndex;
        }
    }

    public static void sort(int[] array) {
        int arrayLength = array.length;

        for (int i = arrayLength / 2 - 1; i >= 0; i--) {
            sift(array, arrayLength, i);
        }

        for (int i = arrayLength - 1; i > 0; i--) {
            swap(array, 0, i);
            sift(array, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = {-4, -3, 10, -5, -3, 4, 2, 6, 12, 77, 11, 2, 33, -5, 0, 0, 4, 22, 18, -10};

        sort(array);
        System.out.println(Arrays.toString(array));
    }
}