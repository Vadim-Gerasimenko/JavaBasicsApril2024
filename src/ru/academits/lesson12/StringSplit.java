package ru.academits.lesson12;

public class StringSplit {
    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 5";

        String[] numbersAsStrings = string.split(", ");

        int numbersSum = 0;

        for (String numberAsString : numbersAsStrings) {
            numbersSum += Integer.parseInt(numberAsString);
        }

        System.out.println("Сумма чисел в строке = " + numbersSum);
    }
}