package ru.academits.lesson6;

import java.util.Scanner;

public class TemperatureConversion {
    public static double getKelvin(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }

    public static double getFahrenheit(double celsiusDegrees) {
        return celsiusDegrees * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsiusDegrees = scanner.nextDouble();

        System.out.println("Температура в градусах Кельвина: " + getKelvin(celsiusDegrees));
        System.out.println("Температура в градусах Фаренгейта: " + getFahrenheit(celsiusDegrees));
    }
}