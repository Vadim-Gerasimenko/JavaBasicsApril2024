package academits.lesson9;

public class SearchForMax {
    public static double getMax(double[] array) {
        double maxNumber = array[0];

        for (double number : array) {
            maxNumber = Math.max(maxNumber, number);
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {1.33, 3, 7.23, 5.12, 4.1};

        System.out.println("Максимум = " + getMax(array));
    }
}