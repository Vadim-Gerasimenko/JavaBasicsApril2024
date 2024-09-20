package ru.academits.lesson2;

public class Circle {
    public static void main(String[] args) {
        double radius = 5;
        System.out.println("Задача 1. Радиус окружности = " + radius + " м:");

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Площадь круга = " + area + " м^2");
        System.out.println("Длина окружности = " + circumference + " м");
        System.out.println();

        area = 50.26548245743669;
        System.out.println("Задача 2. Площадь круга = " + area + " м:");

        radius = Math.sqrt(area / Math.PI);
        System.out.println("Радиус окружности = " + radius + " м");
        System.out.println();

        radius = 3;
        double angle = 30;
        System.out.print("Задача 3. Радиус окружности = " + radius + " м, ");
        System.out.println("угол = " + angle + " градусов:");

        double sectorArea = Math.PI * radius * radius * angle / 360;
        System.out.print("Площадь сектора = " + sectorArea + " м^2");
    }
}
