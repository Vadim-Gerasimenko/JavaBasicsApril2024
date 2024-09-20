package ru.academits.lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы умножения (от 1 до 316): ");
        int multiplicationTableSize = scanner.nextInt();

        while (multiplicationTableSize < 1 || multiplicationTableSize > 316) {
            System.out.println("Недопустимый размер таблицы.");

            System.out.print("Введите размер таблицы умножения (от 1 до 316): ");
            multiplicationTableSize = scanner.nextInt();
        }

        System.out.println();
        System.out.print("-");

        for (int i = 0; i <= multiplicationTableSize; i++) {
            System.out.print("------");
        }

        System.out.println();
        System.out.print("|     |");

        for (int i = 1; i <= multiplicationTableSize; i++) {
            System.out.printf("%5d|", i);
        }

        System.out.println();
        System.out.print("-");

        for (int i = 0; i <= multiplicationTableSize; i++) {
            System.out.print("------");
        }

        System.out.println();

        for (int i = 1; i <= multiplicationTableSize; i++) {
            System.out.printf("|%5d|", i);

            for (int j = 1; j <= multiplicationTableSize; j++) {
                int multiplicationTableElement = i * j;
                System.out.printf("%5d", multiplicationTableElement);

                if (j < multiplicationTableSize) {
                    System.out.print(" ");
                }
            }

            System.out.println("|");
        }

        System.out.print("-");

        for (int i = 0; i <= multiplicationTableSize; i++) {
            System.out.print("------");
        }
    }
}