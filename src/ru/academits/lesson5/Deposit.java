package academits.lesson5;

import java.util.Scanner;

public class Deposit {
    private static final double EPSILON = 1e-10;

    public static String getMonthWordForm(int monthNumber) {
        int monthNumberLast2Digits = monthNumber % 100;

        if (monthNumberLast2Digits > 10 && monthNumberLast2Digits < 15) {
            return "месяцев";
        }

        int monthNumberLastDigit = monthNumber % 10;

        if (monthNumberLastDigit == 1) {
            return "месяц";
        }

        if (monthNumberLastDigit > 1 && monthNumberLastDigit < 5) {
            return "месяца";
        }

        return "месяцев";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер вклада в рублях: ");
        double initialDepositAmount = scanner.nextDouble();

        while (initialDepositAmount <= EPSILON) {
            System.out.println("Сумма на вкладе должна быть больше нуля!");
            System.out.println();

            System.out.print("Введите размер вклада в рублях: ");
            initialDepositAmount = scanner.nextDouble();
        }

        System.out.print("Введите годовой процент по вкладу: ");
        double depositInterest = scanner.nextDouble();

        while (depositInterest <= EPSILON) {
            System.out.println("Процент по вкладу должен быть больше нуля!");
            System.out.println();

            System.out.print("Введите годовой процент по вкладу: ");
            depositInterest = scanner.nextInt();
        }

        System.out.print("Введите количество месяцев: ");
        int monthsCount = scanner.nextInt();

        while (monthsCount <= 0) {
            System.out.println("Количество месяцев должно быть больше нуля!");
            System.out.println();

            System.out.print("Введите количество месяцев: ");
            monthsCount = scanner.nextInt();
        }

        System.out.println();

        int monthsPerYearCount = 12;
        int percentToCoefficientRatio = 100;

        double depositMonthlyMultiplier = 1 + depositInterest / (monthsPerYearCount * percentToCoefficientRatio);

        double currentDepositAmount = initialDepositAmount;

        for (int monthNumber = 1; monthNumber <= monthsCount; monthNumber++) {
            String monthWordForm = getMonthWordForm(monthNumber);

            currentDepositAmount *= depositMonthlyMultiplier;
            System.out.printf("Сумма на вкладе через %d %s: %.2f%n", monthNumber, monthWordForm, currentDepositAmount);

            double depositProfit = currentDepositAmount - initialDepositAmount;
            System.out.printf("Прибыль по вкладу через %d %s: %.2f%n", monthNumber, monthWordForm, depositProfit);

            if (monthNumber < monthsCount) {
                System.out.println();
            }
        }
    }
}