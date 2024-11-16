package academits.lesson3;

public class NumbersInLine10 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            System.out.printf("%3d ", i);

            if (i % 10 == 0) {
                System.out.println();
            }

            i++;
        }
    }
}