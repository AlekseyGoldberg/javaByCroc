package Homework1.task7;

public class IllegalMoveException extends Exception{
    public IllegalMoveException(){

    }
//    public IllegalMoveException(ChessPossition chessPossition,String[]chessPossitionOnMotion){
//        System.out.println("Конь так не ходит: " +
//                (String.valueOf((char)(chessPossition.getX()+97)) + Integer.toString(chessPossition.getY()+1)) +
//                "->" + (chessPossitionOnMotion[0] + chessPossitionOnMotion[1]));
//    }
}
