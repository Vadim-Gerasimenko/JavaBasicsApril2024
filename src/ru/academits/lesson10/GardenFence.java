package academits.lesson10;

import java.util.Scanner;

public class GardenFence {
    private static final double EPSILON = 1E-10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int treesCount = scanner.nextInt();
        int fencePerimeter = scanner.nextInt();

        for (int i = 0; i < treesCount; i++) {
            int treeRadius = scanner.nextInt();

            double fenceArea = (double) treeRadius * fencePerimeter / 2;
            double treeArea = treeRadius * treeRadius * Math.PI;

            if (treeArea - fenceArea > EPSILON) {
                System.out.println(-1);
                continue;
            }

            System.out.println("nice");
        }
    }
}