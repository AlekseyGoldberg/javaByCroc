package Homework1.task4;

public class Circale extends Figure {
    private double X;
    private double Y;
    private double R;

    public Circale(double x, double y, double r) {
        X = x;
        Y = y;
        R = r;
    }

    public String toString() {
        return "C " + "(<" + X + ">," + "<" + Y + ">, <" + R + ">";
    }


}
