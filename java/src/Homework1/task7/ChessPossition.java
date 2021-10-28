package Homework1.task7;

public class ChessPossition {
    private int x;
    private int y;



    public ChessPossition(int x, int y) throws IllegalPositionException {
        if ((0<=x&&x<8)&&(0<=y&&y<8)){
            this.x = x;
            this.y = y;
        }else {
            throw new IllegalPositionException("Неверно введены данные");
        }
    }
    public void setX(int x) throws IllegalPositionException,IllegalMoveException {
        if (0<=x&&x<8){
        this.x = x;
        }else {
            throw new IllegalPositionException("Неверно задана координата Х");
        }
    }

    public void setY(int y) throws IllegalPositionException,IllegalMoveException {
        if (0<=y&&y<8){
            this.y = y;
        }else {
            throw new IllegalPositionException("Неверно задана координата У");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return (x > -1 && x < 8 ? String.valueOf((char)(x + 97)) : null) +""+(y+1);
    }
}
