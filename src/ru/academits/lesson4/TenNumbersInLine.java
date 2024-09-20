package ru.academits.lesson4;

import java.util.Scanner;

public class TenNumbersInLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the number range: ");
        int rangeStart = scanner.nextInt();

        System.out.print("Enter the start of the number range: ");
        int rangeEnd = scanner.nextInt();

        System.out.print("Enter count of numbers in the line: ");
        int numbersInLineCount = scanner.nextInt();

        int printedNumbersCount = 0;
        int i = rangeStart;

        while (i <= rangeEnd) {
            System.out.printf("%4d ", i);

            printedNumbersCount++;

            if (printedNumbersCount % numbersInLineCount == 0) {
                System.out.println();
            }

            i++;
        }
    }
}