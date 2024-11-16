package academits.lesson9;

public class UpperCaseStringsArray {
    public static void convertToUpperCase(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Hello,", "what's", "your", "name?"};
        convertToUpperCase(strings);

        System.out.println("Строки в верхнем регистре:");

        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}