package academits.lesson7;

public class Range {
    private double from;
    private double to;

    private static final double EPSILON = 1e-10;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return (number - from > -EPSILON) && (to - number > -EPSILON);
    }

    public void printNumberPresence(double number) {
        if (isInside(number)) {
            System.out.println("Число входит в указанный диапазон.");
        } else {
            System.out.println("Число не входит в указанный диапазон.");
        }
    }
}