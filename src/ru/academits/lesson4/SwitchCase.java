package academits.lesson4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.print("Enter the string: ");
                String string = scanner.nextLine();

                System.out.println("Entered string is \"" + string + "\"");
                break;
            case "sum":
                System.out.print("Enter the first real number: ");
                double realNumber1 = scanner.nextDouble();

                System.out.print("Enter the first real number: ");
                double realNumber2 = scanner.nextDouble();

                double sum = realNumber1 + realNumber2;
                System.out.println("The sum of these numbers = " + sum);

                break;
            default:
                System.out.println("Entered unknown command.");
        }
    }
}
