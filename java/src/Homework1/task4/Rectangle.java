package Homework1.task4;

public class Rectangle extends Figure{
    private double X1;
    private double X2;
    private double Y1;
    private double Y2;

    public Rectangle(double x1, double x2, double y1, double y2) {
        X1 = x1;
        X2 = x2;
        Y1 = y1;
        Y2 = y2;
    }

    public String toString(){
        return "R "+"(<"+X1+">,"+"<"+Y1+">),"+"(<"+X2+">,"+"<"+Y2+">)";
    }
}
