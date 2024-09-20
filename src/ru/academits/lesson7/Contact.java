package ru.academits.lesson7;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Герасим", "Герасименко", "+79831328160");
        System.out.println("Имя первого контакта: " + contact1.getFirstName());
        System.out.println("Фамилия первого контакта: " + contact1.getLastName());
        System.out.println("Номер телефона первого контакта: " + contact1.getPhoneNumber());

        System.out.println();

        contact1.setFirstName("Вадим");
        System.out.println("Имя первого контакта: " + contact1.getFirstName());
        System.out.println("Фамилия первого контакта: " + contact1.getLastName());
        System.out.println("Номер телефона первого контакта: " + contact1.getPhoneNumber());

        System.out.println();

        Contact contact2 = new Contact("Иван", "Иванов", "+79131111111");
        System.out.println("Фамилия второго контакта: " + contact2.getLastName());

        System.out.println();

        contact2.setLastName("Смирнов");
        System.out.println("Фамилия второго контакта: " + contact2.getLastName());

        System.out.println();

        Contact contact3 = new Contact("Дарья", "Дарина", "+79139998877");
        System.out.println("Номер телефона третьего контакта: " + contact3.getPhoneNumber());

        System.out.println();

        contact3.setPhoneNumber("+79831513322");
        System.out.println("Номер телефона третьего контакта: " + contact3.getPhoneNumber());
    }
}