package academits.lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter the second operand: ");
        double operand2 = scanner.nextDouble();

        System.out.println("Enter the number of the operation you want to perform on the operands:");
        System.out.println("1. Addition operation");
        System.out.println("2. Subtraction operation");
        System.out.println("3. Multiplication operation");
        System.out.println("4. Division operation");
        int command = scanner.nextInt();

        double result;

        switch (command) {
            case 1:
                result = operand1 + operand2;
                break;
            case 2:
                result = operand1 - operand2;
                break;
            case 3:
                result = operand1 * operand2;
                break;
            case 4:
                result = operand1 / operand2;
                break;
            default:
                System.out.println("You have entered an unknown operation.");
                return;
        }

        System.out.println("The result of the operation = " + result);
    }
}