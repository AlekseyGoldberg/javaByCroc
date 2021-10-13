package Homework1.task1;

import Homework1.task1.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты X вершины №1: ");
        x = scanner.nextDouble();
        System.out.print("Введите координаты Y вершины №1: ");
        y = scanner.nextDouble();
        Point a = new Point(x, y);
        System.out.print("Введите координаты X вершины №2: ");
        x = scanner.nextDouble();
        System.out.print("Введите координаты Y вершины №2: ");
        y = scanner.nextDouble();
        Point b = new Point(x, y);
        System.out.print("Введите координаты X вершины №3: ");
        x = scanner.nextDouble();
        System.out.print("Введите координаты Y вершины №3: ");
        y = scanner.nextDouble();
        Point c = new Point(x, y);
        System.out.println("площадь треугольника: " + areaTriangle(a, b, c));
    }

    public static double areaTriangle(Point a, Point b, Point c) {
        return 0.5 * (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY()));
    }
}
