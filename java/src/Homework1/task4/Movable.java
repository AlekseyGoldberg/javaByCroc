package Homework1.task4;

public interface Movable {
    //метод move смещает нашу фигуру относительно каждой точки на какую-то дельту, в данном случае это dx, xy.
    //У круга мы должны сместить координату X на dx и координату Y на dy.
    //У прямоугольника каждую координату должны сместить X1 и X2 на dx и Y1 и Y2 на dy
    void move(int dx,int dy);
}
