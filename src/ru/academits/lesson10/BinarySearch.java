package ru.academits.lesson10;

public class BinarySearch {
    private static int binarySearchRecursive(int[] array, int number, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (array[middle] < number) {
            return binarySearchRecursive(array, number, middle + 1, right);
        }

        if (array[middle] > number) {
            return binarySearchRecursive(array, number, left, middle - 1);
        }

        return middle;
    }

    public static int binarySearchRecursive(int[] array, int number) {
        return binarySearchRecursive(array, number, 0, array.length - 1);
    }

    public static int binarySearchNonRecursive(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] < number) {
                left = middle + 1;
            } else if (array[middle] > number) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 4, 4, 4, 7, 7, 8, 9, 12};
        int number = 8;

        System.out.println("Результат бинарного поиска с помощью рекурсии:");

        int numberIndexRecursive = binarySearchRecursive(array, number);

        if (numberIndexRecursive == -1) {
            System.out.println("Указанное число отсутствует.");
        } else {
            System.out.println("Индекс искомого числа = " + numberIndexRecursive);
        }

        System.out.println();
        System.out.println("Результат бинарного поиска без рекурсии:");

        int numberIndexNonRecursive = binarySearchNonRecursive(array, number);

        if (numberIndexNonRecursive == -1) {
            System.out.println("Указанное число отсутствует.");
            return;
        }

        System.out.println("Индекс искомого числа = " + numberIndexNonRecursive);
    }
}