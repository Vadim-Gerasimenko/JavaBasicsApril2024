package academits.lesson10;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число для поиска НОД: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число для поиска НОД: ");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Для данных чисел нельзя найти НОД.");
            return;
        }

        System.out.printf("Для чисел %d и %d НОД = %d", number1, number2, getGreatestCommonDivisor(number1, number2));
    }
}