package academits.lesson3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты первой точки на плоскости (x1, y1) через пробел: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты второй точки на плоскости (x2, y2) через пробел: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты третьей точки на плоскости (x3, y3) через пробел: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double epsilon = 1E-10;

        // Проверка расположения точек на одной прямой с помощью уравнения прямой.
        if (Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) <= epsilon) {
            System.out.print("Данные точки лежат на одной прямой.");
        } else {
            // Вычисляем стороны треугольника как расстояние между двумя точками на плоскости.
            double triangleSide1Length = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
            double triangleSide2Length = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
            double triangleSide3Length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

            double semiPerimeter = (triangleSide1Length + triangleSide2Length + triangleSide3Length) / 2;

            // Вычисляем площадь треугольника по формуле Герона.
            double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - triangleSide1Length) * (semiPerimeter - triangleSide2Length) * (semiPerimeter - triangleSide3Length));
            System.out.print("Площадь треугольника с указанными координатами = " + triangleArea + " м^2.");
        }
    }
}