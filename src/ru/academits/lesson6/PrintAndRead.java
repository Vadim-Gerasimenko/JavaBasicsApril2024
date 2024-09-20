package ru.academits.lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String inputPrompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(inputPrompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int number1 = printAndRead("Введите целое число: ");
        System.out.println("Введённое число при первом вызове функции = " + number1);

        int number2 = printAndRead("Введите число из диапазона integer: ");
        System.out.println("Введённое число при втором вызове функции = " + number2);

        int number3 = printAndRead("Введите ещё одно целое число: ");
        System.out.println("Введённое число при третьем вызове функции = " + number3);
    }
}