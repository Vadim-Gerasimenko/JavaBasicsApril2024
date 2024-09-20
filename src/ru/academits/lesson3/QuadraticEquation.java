package ru.academits.lesson3D;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициент 'a' квадратного уравнения ax^2 + bx + c: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффициент 'b' квадратного уравнения ax^2 + bx + c: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэффициент 'c' квадратного уравнения ax^2 + bx + c: ");
        double c = scanner.nextDouble();

        double epsilon = 1E-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) <= epsilon) {
                if (Math.abs(c) <= epsilon) {
                    System.out.print("x принадлежит от -бесконечности до +бесконечности.");
                } else {
                    System.out.print("Нет корней.");
                }
            } else {
                if (Math.abs(c) <= epsilon) {
                    double x = 0;
                    System.out.printf("Корень линейного уравнения %fx = 0: x = %f.", b, x);
                } else {
                    double x = -c / b;
                    System.out.printf("Корень линейного уравнения %fx + %f = 0: x = %f.", b, c, x);
                }
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.printf("Корень квадратного уравнения %fx^2 + %fx + %f = 0: x = %f.", a, b, c, x);
            } else if (discriminant > epsilon) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корни квадратного уравнения %fx^2 + %fx + %f = 0: x1 = %f, x2 = %f.", a, b, c, x1, x2);
            } else {
                System.out.printf("Квадратное уравнение %fx^2 + %fx + %f = 0 не имеет действительных решений.", a, b, c);
            }
        }
    }
}