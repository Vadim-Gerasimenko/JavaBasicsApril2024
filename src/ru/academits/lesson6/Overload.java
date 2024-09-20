package ru.academits.lesson6;

public class Overload {
    public static int getTypeSize(byte number) {
        return 1;
    }

    public static int getTypeSize(short number) {
        return 2;
    }

    public static int getTypeSize(int number) {
        return 4;
    }

    public static int getTypeSize(long number) {
        return 8;
    }

    public static int getTypeSize(float number) {
        return 4;
    }

    public static int getTypeSize(double number) {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println("Количество байт, необходимое для хранения переменной указанного типа:");

        byte byteNumber = 127;
        System.out.println("byte: " + getTypeSize(byteNumber));

        short shortNumber = 128;
        System.out.println("short: " + getTypeSize(shortNumber));

        int intNumber = -2123123;
        System.out.println("int: " + getTypeSize(intNumber));

        long longNumber = 12321312312L;
        System.out.println("long: " + getTypeSize(longNumber));

        float floatNumber = 0;
        System.out.println("float: " + getTypeSize(floatNumber));

        double doubleNumber = 3.14;
        System.out.println("double: " + getTypeSize(doubleNumber));
    }
}