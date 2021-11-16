package Homework1.task11;

import javax.swing.text.html.HTMLDocument;
import java.time.Instant;
import java.time.LocalDateTime;

public class Game  implements Runnable {
    private Lot lot;
    private int cost;
    private String name;
    private Instant time;

    public Game(Lot lot,int cost, String name,Instant time) {
        this.cost=cost;
        this.lot= lot;
        this.name = name;
        this.time=time;
    }

    public void run() {
            try {
                lot.bet(cost,name,time);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
