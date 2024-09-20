package ru.academits.lesson3D;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int minAge = 1;
        int maxAge = 112;

        int lastAgeDigit = age % 10;
        int last2AgeDigits = age % 100;

        if (age < minAge) {
            System.out.println("Вы слишком малы.");
        } else if (age > maxAge) {
            System.out.println("Вы слишком малы.");
        } else if (last2AgeDigits > 10 && last2AgeDigits < 15) {
            System.out.println("Вам " + age + " лет.");
        } else if (lastAgeDigit == 1) {
            System.out.println("Вам " + age + " год.");
        } else if (lastAgeDigit > 1 && lastAgeDigit < 5) {
            System.out.println("Вам " + age + " года.");
        } else {
            System.out.println("Вам " + age + " лет.");
        }
    }
}