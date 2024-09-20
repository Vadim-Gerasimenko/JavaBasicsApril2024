package ru.academits.lesson6;

public class Functions {
    public static double get3XPlus4Y(double number1, double number2) {
        return 3 * number1 + 4 * number2;
    }

    public static double getNumbersAverage(int beginNumber, int endNumber) {
        return (double) (beginNumber + endNumber) / 2;
    }

    public static int getMin(int number1, int number2) {
        return number1 < number2 ? number1 : number2;
    }

    public static int getMax(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    public static void main(String[] args) {
        double result1 = get3XPlus4Y(1, 2);
        System.out.println("Result1 = " + result1);

        double result2 = get3XPlus4Y(2.7, 3.14);
        System.out.println("Result2 = " + result2);

        double result3 = get3XPlus4Y(1e-3, 3e-3);
        System.out.println("Result3 = " + result3);

        double numbersAverage = getNumbersAverage(5, 17);
        System.out.println("Numbers average = " + numbersAverage);

        int minimumNumber = getMin(2, 5);
        System.out.println("Minimum number = " + minimumNumber);

        int maximumNumber = getMax(2, 5);
        System.out.println("Maximum number = " + maximumNumber);
    }
}