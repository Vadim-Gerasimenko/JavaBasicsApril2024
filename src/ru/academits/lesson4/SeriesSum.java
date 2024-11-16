package academits.lesson4;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the last member of the series: ");
        int seriesLastNumber = scanner.nextInt();

        if (seriesLastNumber < 0) {
            System.out.println("Series number must be a positive integer number.");
            return;
        }

        int i = 1;
        int seriesSum = 0;

        while (i <= seriesLastNumber) {
            seriesSum += i * i * (int) Math.pow(-1, i - 1);
            i++;
        }

        System.out.printf("Sum of series up to %d terms = %d", seriesLastNumber, seriesSum);
    }
}