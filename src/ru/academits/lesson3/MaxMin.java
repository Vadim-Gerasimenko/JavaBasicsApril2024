package ru.academits.lesson3;

import java.util.Scanner;

public class MaxMin {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.println("Сравнение чисел при помощи конструкции if-else:");

        if (number1 < number2) {
            System.out.println("Наименьшее число: " + number1);
            System.out.println("Наибольшее число: " + number2);
        } else {
            System.out.println("Наименьшее число: " + number2);
            System.out.println("Наибольшее число: " + number1);
        }

        System.out.println("Сравнение чисел при помощи тернарного оператора:");

        int minNumber = number1 < number2 ? number1 : number2;
        int maxNumber = number1 < number2 ? number2 : number1;

        System.out.println("Наименьшее число: " + minNumber);
        System.out.print("Наибольшее число: " + maxNumber);
    }
}