package academits.lesson5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Я загадал случайное число от 1 до 100 (включительно), попробуй его угадать: ");
        int enteredNumber = scanner.nextInt();

        int attemptsCount = 1;

        while (enteredNumber != hiddenNumber) {
            if (enteredNumber < hiddenNumber) {
                System.out.print("Загаданное число больше. ");
            } else {
                System.out.print("Загаданное число меньше. ");
            }

            System.out.print("Попробуй ещё раз: ");
            enteredNumber = scanner.nextInt();

            attemptsCount++;
        }

        System.out.printf("Вы угадали число %d! Количество попыток: %d", hiddenNumber, attemptsCount);
    }
}