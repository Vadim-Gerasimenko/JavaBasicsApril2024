package ru.academits.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOpen {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            double[] numbers = new double[10];

            int i = 0;

            while (scanner.hasNextDouble()) {
                numbers[i] = scanner.nextDouble();
                i++;
            }

            double[] resultNumbers = new double[i];

            for (int j = 0; j < i; j++) {
                resultNumbers[j] = numbers[j];
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(resultNumbers));
        }
    }
}