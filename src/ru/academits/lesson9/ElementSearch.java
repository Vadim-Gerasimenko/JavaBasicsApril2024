package ru.academits.lesson9;

public class ElementSearch {
    public static int getElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int element = 8;

        int elementIndex = getElementIndex(array, element);

        if (elementIndex == -1) {
            System.out.println("Элемент не найден.");
            return;
        }

        System.out.println("Индекс элемента = " + elementIndex);
    }
}