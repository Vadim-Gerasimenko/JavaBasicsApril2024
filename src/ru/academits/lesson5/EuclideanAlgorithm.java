package academits.lesson5;

import java.util.Scanner;

public class EuclideanAlgorithm {
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

        int operand1 = number1;
        int operand2 = number2;

        while (operand2 != 0) {
            int temp = operand2;
            operand2 = operand1 % operand2;
            operand1 = temp;
        }

        System.out.printf("Для чисел %d и %d НОД = %d", number1, number2, operand1);
    }
}