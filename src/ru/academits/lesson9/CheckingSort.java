package academits.lesson9;

public class CheckingSort {
    public static boolean isAscendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDescendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 5, 4, 3, 3, 2, 0, -4, -7, -7};

        System.out.println("Массив:");
        printArray(array);

        System.out.println();

        if (isAscendingSort(array)) {
            System.out.println("Массив отсортирован по возрастанию.");
        } else if (isDescendingSort(array)) {
            System.out.println("Массив отсортирован по убыванию.");
        } else {
            System.out.println("Массив не отсортирован.");
        }
    }
}