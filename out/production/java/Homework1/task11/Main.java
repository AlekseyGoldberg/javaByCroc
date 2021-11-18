package Homework1.task11;

import javax.swing.plaf.TableHeaderUI;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws AuctionExeption {
        String dateInString = "2020-11-18T18:00:00Z";

        int[] mass = {5, 3, 6, 2};
        String[] massName = {"Леша", "Гриша", "Вова", "Ваня"};
        Lot lot = new Lot(2, Instant.parse(dateInString));

        for (int i = 0; i < mass.length / 2; i++) {
            Thread t1 = new Thread(new Game(lot, mass[i], massName[i],Instant.now()));
            t1.start();
            Thread t2 = new Thread(new Game(lot, mass[i + mass.length / 2], massName[i + mass.length/2],Instant.now()));
            t2.start();
        }
        try {
        System.out.println(lot.getWinner());
        }catch (AuctionExeption exeption){
            System.out.println("Торги еще ведутся");
        }
    }
}
