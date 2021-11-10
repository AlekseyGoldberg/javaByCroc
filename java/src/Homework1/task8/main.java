package Homework1.task8;

import java.io.*;

public class main {
    public static void main(String[] args) {
        FileInputStream file = null;
        int b;
        int countWord = 0;
        boolean k = true;
        try {
            file = new FileInputStream(args[0]);
            while ((b = file.read()) != -1) {
                char symbol = (char) b;
                if (symbol == ' ' || symbol == '\n'||symbol==','||symbol=='.'||symbol=='!'||symbol=='?'||symbol==':'||symbol==';') {
                    k = true;
                } else {
                    if (k == true) {
                        countWord++;
                        k = false;
                    }

                }
            }
            System.out.println(countWord);
        } catch (FileNotFoundException exception) {
            System.out.println("Такого файла нет в каталоге");
        } catch (IOException exception) {
            System.out.println("Не удалось прочитать файл");

        }
    }
}
