package academits.lesson10;

import java.util.Scanner;

public class Exponentiation {
    public static int getPowerRecursive(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return getPowerRecursive(number, power - 1) * number;
    }

    public static int getPowerNonRecursive(int number, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень: ");
        int power = scanner.nextInt();

        System.out.println("Возведение в степень с помощью рекурсии: " + getPowerRecursive(number, power));
        System.out.println("Возведение в степень без рекурсии: " + getPowerNonRecursive(number, power));
    }
}