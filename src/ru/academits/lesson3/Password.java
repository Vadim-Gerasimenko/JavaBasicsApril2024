package academits.lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "Hello";

        System.out.print("Введите пароль: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.length() < correctPassword.length()) {
            System.out.print("Неверный пароль: строка слишком короткая.");
        } else if (enteredPassword.length() > correctPassword.length()) {
            System.out.print("Неверный пароль: строка слишком длинная.");
        } else if (enteredPassword.equals(correctPassword)) {
            System.out.print("Верный пароль.");
        } else {
            System.out.print("Неверный пароль.");
        }
    }
}