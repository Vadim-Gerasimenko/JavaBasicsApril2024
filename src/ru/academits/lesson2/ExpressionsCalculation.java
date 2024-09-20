package ru.academits.lesson2;

public class ExpressionsCalculation {
    public static void main(String[] args) {
        int x = 3 - (56 - 12) / 44 * 4 / 2;
        System.out.println("x = " + x);

        double y = (double) 2 * x / (33 - x);
        System.out.println("y = " + y);

        double z = -x / (2 * y);
        System.out.print("z = " + z);
    }
}