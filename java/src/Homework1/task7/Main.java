package Homework1.task7;

public class Main {
    public static void main(String[] args) throws IllegalPositionException, IllegalMoveException {
        //Переменная, в которой описаны все возможные ходы коня буквой "Г", для тестирования программы
        //String[] mass = {"d1", "c3", "d1", "e3", "d1", "b2", "d1", "f2", "d1"};

        //переменная, в которой описана неверная последовательность хода коня
        String[] mass = {"g8", "e7", "e6"};
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
        if (result != 1) {
            System.out.println("OK");
        }
    }

    public static void moveHorse(ChessPossition chessPossition, String[] chessPossitionOnMotion) throws IllegalPositionException, IllegalMoveException {
        //проверяем может ли конь ходить 1 раз влево, 2 раза вверх
        if ((chessPossition.getX() - 1 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() + 2) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 1 раз вправо, 2 раза вверх
        else if ((chessPossition.getX() + 1 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() + 2) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 1 раз вправо, 2 раза вниз
        else if ((chessPossition.getX() + 1 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() - 2) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 1 раз влево, 2 раза вниз
        else if ((chessPossition.getX() - 1 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() - 2) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 2 раз влево, 1 раз вверх
        else if ((chessPossition.getX() - 2 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() + 1) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 2 раз влево, 1 раз вниз
        else if ((chessPossition.getX() - 2 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() - 1) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 2 раз вправо, 1 раз вниз
        else if ((chessPossition.getX() + 2 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() - 1) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //проверяем может ли конь ходить 2 раз вправо, 1 раз вверх
        else if ((chessPossition.getX() + 2 == chessPossitionOnMotion[0].hashCode() - 97) &&
                (chessPossition.getY() + 1) == Integer.parseInt(chessPossitionOnMotion[1]) - 1) {
            chessPossition.setX(chessPossitionOnMotion[0].hashCode() - 97);
            chessPossition.setY(Integer.parseInt(chessPossitionOnMotion[1]) - 1);
        }
        //если конь не может ходить, выбрасываем исключение
        else {
            throw new IllegalMoveException();
        }

    }
}
