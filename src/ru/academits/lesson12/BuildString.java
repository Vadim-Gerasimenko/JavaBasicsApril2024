package ru.academits.lesson12;

public class BuildString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }

        int separatorLastIndex = stringBuilder.lastIndexOf(", ");

        stringBuilder.delete(separatorLastIndex, separatorLastIndex + 2);

        System.out.println(stringBuilder);
    }
}