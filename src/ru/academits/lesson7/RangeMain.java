package ru.academits.lesson7;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, являющееся началом непрерывного диапазона из вещественных чисел: ");
        double rangeFrom = scanner.nextDouble();

        System.out.print("Введите число, являющееся концом непрерывного диапазона из вещественных чисел: ");
        double rangeTo = scanner.nextDouble();

        Range range = new Range(rangeFrom, rangeTo);

        System.out.println("Начало диапазона: " + range.getFrom());
        System.out.println("Конец диапазона: " + range.getTo());

        double rangeLength = range.getLength();
        System.out.println("Длина указанного диапазона = " + rangeLength);

        System.out.print("Введите число для проверки на его присутствие в указанном диапазоне: ");
        double number = scanner.nextDouble();

        range.printNumberPresence(number);

        System.out.println();

        System.out.print("Введите новое начало диапазона: ");
        double newRangeFrom = scanner.nextDouble();

        System.out.print("Введите новый конец диапазона: ");
        double newRangeTo = scanner.nextDouble();

        range.setFrom(newRangeFrom);
        range.setTo(newRangeTo);

        System.out.println("Новое начало диапазона: " + range.getFrom());
        System.out.println("Новый конец диапазона: " + range.getTo());

        double newRangeLength = range.getLength();
        System.out.println("Новая длина диапазона = " + newRangeLength);

        System.out.print("Введите число для проверки его присутствия в новом диапазоне: ");
        double newNumber = scanner.nextDouble();

        range.printNumberPresence(newNumber);
    }
}