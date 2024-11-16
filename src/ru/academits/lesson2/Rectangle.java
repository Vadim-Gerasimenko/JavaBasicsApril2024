package academits.lesson2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника (м): ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника (м): ");
        double width = scanner.nextDouble(); // TODO: посчитать площадь и периметр

        System.out.println();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Данный прямоугольник имеет следующие характеристики:");
        System.out.printf("Длина = %.2f м%nШирина = %.2f м%nПлощадь = %.2f м^2%nПериметр = %.2f м", length, width, area, perimeter);
        // Вывод характеристик реализован в одну строку в связи с условием задачи
    }
}