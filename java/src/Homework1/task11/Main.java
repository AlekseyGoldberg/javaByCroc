package Homework1.task11;

import javax.swing.plaf.TableHeaderUI;
import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] mass = {5, 3, 6, 2};
        String[] massName = {"Леша", "Гриша", "Вова", "Ваня"};
        Lot lot = new Lot(2);

        for (int i = 0; i < mass.length / 2; i++) {

            Thread t1 = new Thread(new Game(lot, mass[i], massName[i]));
            t1.start();
            Thread t2 = new Thread(new Game(lot, mass[i + mass.length / 2], massName[i + mass.length/2]));
            t2.start();
        }
        System.out.println(lot.getWinner());
    }
}
