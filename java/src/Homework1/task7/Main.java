package Homework1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalPositionException, IllegalMoveException {
        //Переменная, в которой описаны все возможные ходы коня буквой "Г", для тестирования программы
        //String[] mass = {"d1", "c3", "d1", "e3", "d1", "b2", "d1", "f2", "d1"};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите последовательность ходов коня через пробел(Например: b1 c3 b1):");
        String[] mass=scanner.nextLine().toLowerCase().split(" ");

        //переменная, в которой описана неверная последовательность хода коня
        //String[] mass = {"g8", "e7", "e6"};
        parse(mass);
    }

    public static void parse(String[] positions) throws IllegalPositionException, IllegalMoveException {
        //Эта переменная нужна, чтобы проверить было выброшено исключение или нет
        int result = 0;
        String[] firstChessPosition = positions[0].split("");
        ChessPossition chessPossition = new ChessPossition(
                firstChessPosition[0].hashCode() - 97,
                Integer.parseInt(firstChessPosition[1]) - 1);
        for (int i = 1; i < positions.length; i++) {
            String[] chessPossitionOnMotion = positions[i].split("");
            try {
                moveHorse(chessPossition, chessPossitionOnMotion);
            } catch (IllegalMoveException exception) {
                System.out.println("Конь так не ходит: " +
                        (String.valueOf((char) (chessPossition.getX() + 97)) + Integer.toString(chessPossition.getY() + 1)) +
                        "->" + (chessPossitionOnMotion[0] + chessPossitionOnMotion[1]));
                result++;
            }
        }
        //если исключение было обработано, то этот блок кода игнорируем, если исключение не было обработано, то выводим "ОК"
        if (result == 0) {
            System.out.println("OK");
        }
    }



    public static void moveHorse(ChessPossition chessPossition, String[] chessPossitionOnMotion) throws IllegalPositionException, IllegalMoveException {
        if ((Math.abs((chessPossitionOnMotion[0].hashCode() - 97) - chessPossition.getX()) == 1)
                && Math.abs((Integer.parseInt(chessPossitionOnMotion[1]) - 1) - chessPossition.getY()) == 2) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        } else if ((Math.abs((chessPossitionOnMotion[0].hashCode() - 97) - chessPossition.getX()) == 2)
                && (Math.abs((Integer.parseInt(chessPossitionOnMotion[1]) - 1) - chessPossition.getY())) == 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }//если конь не может ходить, выбрасываем исключение
        else {
            throw new IllegalMoveException();
        }
    }
}
