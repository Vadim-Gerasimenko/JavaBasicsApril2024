package ru.academits.lesson5;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                continue;
            }

            if (i % 3 == 0) {
                continue;
            }

            if (i >= 60 && i <= 80) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;

        while (i <= 100) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                i++;
                continue;
            }

            System.out.print(i + " ");
            i++;
        }
    }
}