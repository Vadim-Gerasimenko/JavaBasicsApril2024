package academits.lesson9;

import java.util.Scanner;

public class MultiplicationTableArray {
    public static int[][] createMultiplicationTable(int rowsCount, int columnsCount) {
        int[][] multiplicationTable = new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            int rowNumber = i + 1;

            for (int j = 0; j < columnsCount; j++) {
                int columnNumber = j + 1;

                multiplicationTable[i][j] = rowNumber * columnNumber;
            }
        }

        return multiplicationTable;
    }

    public static void printMultiplicationTable(int[][] multiplicationTable) {
        int rowsCount = multiplicationTable.length;
        int columnsCount = multiplicationTable[0].length;

        for (int i = 0; i <= columnsCount; i++) {
            System.out.print("-----");
        }

        System.out.println();
        System.out.print("|   |");

        for (int i = 1; i <= columnsCount; i++) {
            System.out.printf("%4d|", i);
        }

        System.out.println();

        for (int i = 0; i <= columnsCount; i++) {
            System.out.print("-----");
        }

        System.out.println();

        for (int i = 0; i < rowsCount; i++) {
            int rowNumber = i + 1;
            System.out.printf("|%3d|", rowNumber);

            for (int j = 0; j < columnsCount; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);

                if (j == columnsCount - 1) {
                    System.out.print("|");
                    break;
                }

                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i <= columnsCount; i++) {
            System.out.print("-----");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в таблице умножения: ");
        int rowsCount = scanner.nextInt();

        System.out.print("Введите количество столбцов в таблице умножения: ");
        int columnsCount = scanner.nextInt();

        int[][] multiplicationTable = createMultiplicationTable(rowsCount, columnsCount);
        printMultiplicationTable(multiplicationTable);
    }
}