package academits.lesson3;

import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " чётное.");
        } else {
            System.out.println("Число " + number + " нечётное.");
        }

        if (number % 5 == 0) {
            System.out.println("Число " + number + " кратно 5.");
        } else {
            System.out.println("Число " + number + " не кратно 5.");
        }
    }
}