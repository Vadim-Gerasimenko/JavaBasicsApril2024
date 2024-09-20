package ru.academits.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesCount {
    public static int getOccurrencesCount(String line, String occurrenceText) {
        int occurrencesCount = 0;

        int lineLength = line.length();
        int occurrenceTextLength = occurrenceText.length();

        int i = 0;

        while (i < lineLength) {
            int occurrenceTextIndex = line.indexOf(occurrenceText, i);

            if (occurrenceTextIndex == -1) {
                break;
            }

            occurrencesCount++;
            i = occurrenceTextIndex + occurrenceTextLength;
        }

        return occurrencesCount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.print("Введите текст, количество вхождений которого нужно посчитать в файле: ");
        String occurrenceText = consoleScanner.nextLine().toLowerCase();

        int occurrencesCount = 0;

        try (Scanner fileScanner = new Scanner(new FileInputStream("input.txt"))) {
            while (fileScanner.hasNextLine()) {
                occurrencesCount += getOccurrencesCount(fileScanner.nextLine().toLowerCase(), occurrenceText);
            }
        }

        System.out.println("Количество вхождений = " + occurrencesCount);
    }
}