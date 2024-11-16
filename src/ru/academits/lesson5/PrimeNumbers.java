package academits.lesson5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Нет простых чисел меньше или равного введённому числу.");
            return;
        }

        System.out.println("Простые числа, не превышающие введенное число:");

        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;
            double numberSquareRoot = Math.sqrt(i);

            for (int j = 2; j <= numberSquareRoot; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}