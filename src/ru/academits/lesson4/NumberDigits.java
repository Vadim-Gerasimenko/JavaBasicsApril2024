package ru.academits.lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        int numberRemainingDigits = number;

        while (numberRemainingDigits != 0) {
            int lastDigit = numberRemainingDigits % 10;
            digitsSum += lastDigit;

            if (lastDigit % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }

            numberRemainingDigits /= 10;
        }

        System.out.printf("Sum of digits of the number '%d' = %d%n", number, digitsSum);
        System.out.printf("Sum of odd digits of the number '%d' = %d%n", number, oddDigitsSum);
        System.out.printf("Maximum digit of the entered number '%d' = %d%n", number, maxDigit);
    }
}