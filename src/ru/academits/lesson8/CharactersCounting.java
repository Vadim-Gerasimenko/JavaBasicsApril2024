package ru.academits.lesson8;

import java.util.Scanner;

public class CharactersCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int remainingSymbolsCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (Character.isLetter(character)) {
                lettersCount++;
            } else if (Character.isDigit(character)) {
                digitsCount++;
            } else if (Character.isWhitespace(character)) {
                whitespacesCount++;
            } else {
                remainingSymbolsCount++;
            }
        }

        System.out.println("Количество букв в введённой строке: " + lettersCount);
        System.out.println("Количество цифр в введённой строке: " + digitsCount);
        System.out.println("Количество пробельных символов в введённой строке: " + whitespacesCount);
        System.out.println("Количество остальных символов в введённой строке: " + remainingSymbolsCount);
    }
}