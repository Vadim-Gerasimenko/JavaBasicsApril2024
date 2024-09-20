package ru.academits.lesson2;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество этажей: ");
        int floorsQuantity = scanner.nextInt();

        System.out.print("Введите количество подъездов: ");
        int entrancesQuantity = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        System.out.println();

        int floorApartmentsQuantity = 4;
        int apartmentsQuantity = floorApartmentsQuantity * floorsQuantity * entrancesQuantity;

        if (apartmentNumber < 1 || apartmentNumber > apartmentsQuantity) {
            System.out.print("Квартиры с таким номером нет в доме.");
        } else {
            int entranceNumber = (int) Math.ceil((double) apartmentNumber / (floorApartmentsQuantity * floorsQuantity));
            System.out.println("Подъезд: " + entranceNumber);

            int floorNumber = (int) Math.ceil((double) (apartmentNumber - (entranceNumber - 1) * (floorApartmentsQuantity * floorsQuantity)) / floorApartmentsQuantity);
            System.out.println("Этаж: " + floorNumber);

            System.out.print("Положение квартиры на лестничной площадке: ");

            switch (apartmentNumber % floorApartmentsQuantity) {
                case 1:
                    System.out.print("ближняя слева");
                    break;
                case 2:
                    System.out.print("дальняя слева");
                    break;
                case 3:
                    System.out.print("дальняя справа");
                    break;
                default:
                    System.out.print("ближняя справа");
            }
        }
    }
}
