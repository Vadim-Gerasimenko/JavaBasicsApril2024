package ru.academits.lesson4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the serial number of the number from the Fibonacci sequence: ");
        int fibonacciSerialNumber = scanner.nextInt();

        if (fibonacciSerialNumber < 0) {
            System.out.println("The sequence number can't be negative.");
            return;
        }

        int currentFibonacciNumber = 0;
        int previousFibonacciNumber = 1;

        int i = 0;

        while (i < fibonacciSerialNumber) {
            int temp = currentFibonacciNumber;
            currentFibonacciNumber += previousFibonacciNumber;
            previousFibonacciNumber = temp;

            i++;
        }

        System.out.printf("Fibonacci_%d = %d", fibonacciSerialNumber, currentFibonacciNumber);
    }
}