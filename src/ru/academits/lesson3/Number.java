package academits.lesson3;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число " + number + " отрицательное.");
        } else if (number > 0) {
            System.out.println("Число " + number + " положительное.");
        } else {
            System.out.println("Число равно 0");
        }
    }
}