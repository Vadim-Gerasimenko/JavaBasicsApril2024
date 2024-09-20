package ru.academits.lesson4;

public class While {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 9) {
            sum += i;
            ++i;
        }

        System.out.println("Sum = " + sum);

        i = 3;
        sum = 0;

        while (i <= 21) {
            sum += i;
            ++i;
        }

        i = 0;
        int evenNumbersAmount = 0;
        sum = 0;


        while (i <= 21) {
            sum += i;
            i += 2;

            evenNumbersAmount++;
        }

        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Amount of even numbers: " + evenNumbersAmount);
    }
}
