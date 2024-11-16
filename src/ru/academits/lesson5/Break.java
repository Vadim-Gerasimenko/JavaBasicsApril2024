package academits.lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String hiddenLine = "Break";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Попробуйте угадать загаданную строку: ");
            String enteredLine = scanner.nextLine();

            if (enteredLine.equals(hiddenLine)) {
                break;
            }

            System.out.println("Вы не угадали, попробуйте ещё раз.");
        }

        System.out.print("Вы угадали загаданную строку.");
    }
}