package ru.academits.lesson8;

import java.util.Scanner;

public class MaxSubstring {
    public static int getMaxSubstringLength(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        int currentSubstringLength = 1;
        int maxSubstringLength = 1;

        for (int i = 1; i < string.length(); i++) {
            char previousCharacter = Character.toLowerCase(string.charAt(i - 1));
            char currentCharacter = Character.toLowerCase(string.charAt(i));

            if (currentCharacter == previousCharacter) {
                currentSubstringLength++;
            } else {
                currentSubstringLength = 1;
            }

            maxSubstringLength = Math.max(maxSubstringLength, currentSubstringLength);
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        System.out.println("Максимальная длина подстроки одинаковых символов: " + getMaxSubstringLength(string));
    }
}