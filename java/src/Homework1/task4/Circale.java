package Homework1.task4;

public class Circale extends Figure {
    private int X;
    private int Y;
    private int R;

    public Circale(int x, int y, int r) {
        X = x;
        Y = y;
        R = r;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getR() {
        return R;
    }

    public String toString() {
        return "C " + "(<" + X + ">," + "<" + Y + ">, <" + R + ">";
    }


    @Override
    public void move(int dx, int dy) {
        X+=dx;
        Y+=dy;
    }
}
