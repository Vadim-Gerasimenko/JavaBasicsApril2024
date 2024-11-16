package academits.lesson9;

public class ArrayReverse {
    public static void reverseArray(int[] array) {
        int arrayLastIndex = array.length - 1;
        int arrayHalfLength = array.length / 2;

        for (int i = 0; i < arrayHalfLength; i++) {
            int temp = array[i];
            array[i] = array[arrayLastIndex - i];
            array[arrayLastIndex - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Элементы указанного массива:");
        printArray(array);

        System.out.println();

        reverseArray(array);

        System.out.println("Элементы массива в обратном порядке:");
        printArray(array);
    }
}