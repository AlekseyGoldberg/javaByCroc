package Homework1.task4;

public class Rectangle extends Figure {
    private int X1;
    private int X2;
    private int Y1;
    private int Y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        X1 = x1;
        X2 = x2;
        Y1 = y1;
        Y2 = y2;
    }


    public String toString() {
        return "R " + "(<" + X1 + ">," + "<" + Y1 + ">)," + "(<" + X2 + ">," + "<" + Y2 + ">)";
    }

    @Override
    double getX() {
        return X1;
    }

    @Override
    double getY() {
        return Y1;
    }

    @Override
    public void move(int dx, int dy) {
        X1+=dx;
        X2+=dx;
        Y1+=dy;
        Y2+=dy;
    }
}
