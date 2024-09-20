package ru.academits.lesson8;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        int leftCharacterIndex = 0;
        int rightCharacterIndex = string.length() - 1;

        while (leftCharacterIndex < rightCharacterIndex) {
            char leftCharacter = string.charAt(leftCharacterIndex);

            if (!Character.isLetter(leftCharacter)) {
                leftCharacterIndex++;
                continue;
            }

            char rightCharacter = string.charAt(rightCharacterIndex);

            if (!Character.isLetter(rightCharacter)) {
                rightCharacterIndex--;
                continue;
            }

            if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                return false;
            }

            leftCharacterIndex++;
            rightCharacterIndex--;
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "\"Пустите!\" - Летит супу миска Максиму. - \"Пустите, летит суп!\"";

        if (isPalindrome(string)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}