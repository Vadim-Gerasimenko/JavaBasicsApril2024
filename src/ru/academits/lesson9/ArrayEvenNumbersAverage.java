package academits.lesson9;

public class ArrayEvenNumbersAverage {
    public static double getEvenNumbersAverage(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                evenNumbersSum += number;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 4, 5, 6, 7, 13, 10};

        System.out.println("Среднее значение чётных элементов массива = " + getEvenNumbersAverage(array));
    }
}