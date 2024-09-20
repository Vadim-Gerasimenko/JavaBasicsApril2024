package ru.academits.lesson6;

import java.util.Scanner;

public class OrderCost {
    private static final double EPSILON = 1e-10;
    private static final double HUNDRED_PERCENT = 100;

    private static final int MIN_QUANTITY_FOR_DISCOUNT = 10;
    private static final int QUANTITY_DISCOUNT = 5;

    private static final int MIN_COST_FOR_DISCOUNT = 1000;
    private static final int COST_DISCOUNT = 5;

    private static final int QUANTITY_AND_COST_DISCOUNT = 10;

    public static double getDiscountedCost(double product1Price, int products1Quantity, double product2Price, int products2Quantity) {
        int totalProductsQuantity = products1Quantity + products2Quantity;
        double totalCost = product1Price * products1Quantity + product2Price * products2Quantity;

        if (totalProductsQuantity >= MIN_QUANTITY_FOR_DISCOUNT && totalCost - MIN_COST_FOR_DISCOUNT > -EPSILON) {
            return totalCost - (totalCost * QUANTITY_AND_COST_DISCOUNT) / HUNDRED_PERCENT;
        }

        if (totalProductsQuantity >= MIN_QUANTITY_FOR_DISCOUNT) {
            return totalCost - (totalCost * QUANTITY_DISCOUNT) / HUNDRED_PERCENT;
        }

        if (totalCost - MIN_COST_FOR_DISCOUNT > -EPSILON) {
            return totalCost - (totalCost * COST_DISCOUNT) / HUNDRED_PERCENT;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену первого товара (в рублях): ");
        double product1Price = scanner.nextDouble();

        System.out.print("Введите количество первого товара: ");
        int products1Quantity = scanner.nextInt();

        System.out.print("Введите цену второго товара (в рублях): ");
        double product2Price = scanner.nextDouble();

        System.out.print("Введите количество второго товара: ");
        int products2Quantity = scanner.nextInt();

        double discountedCost = getDiscountedCost(product1Price, products1Quantity, product2Price, products2Quantity);
        System.out.println("Итоговая стоимость с учётом всех скидок = " + discountedCost + " рублей.");
    }
}