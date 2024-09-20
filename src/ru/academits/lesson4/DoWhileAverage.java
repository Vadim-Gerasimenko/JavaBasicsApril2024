package ru.academits.lesson4;

import java.util.Scanner;

public class DoWhileAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number that is the start of the range of numbers to calculate the average: ");
        int rangeStart = scanner.nextInt();

        System.out.print("Enter a number that is the end of this range: ");
        int rangeEnd = scanner.nextInt();

        System.out.println();

        if (rangeStart > rangeEnd) {
            int temp = rangeEnd;
            rangeEnd = rangeStart;
            rangeStart = temp;
        }

        int numbersSum = 0;
        int numbersCount = 0;

        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        int i = rangeStart;

        do {
            numbersSum += i;
            numbersCount++;

            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            i++;
        } while (i <= rangeEnd);

        double numbersAverage = (double) numbersSum / numbersCount;
        System.out.println("The average of numbers in this range = " + numbersAverage);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("The average of even numbers in this range = " + evenNumbersAverage);
    }
}