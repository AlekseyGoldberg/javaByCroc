package Homework1.task11;

import java.time.LocalDateTime;

public class Lot {
    private int cost;
    private String name;
    private int time;
    private static final Object lock = new Object();

    public Lot(int cost) {
        if (cost > this.cost) {
            this.cost = cost;
        }
        this.time = 10;
    }

    public void bet(int cost, String name) throws InterruptedException {
        synchronized (lock) {
            if (cost > this.cost&&time>0) {
                this.cost = cost;
                this.name = name;
                this.time=10;
            }
        }
    }

    public String getWinner() {
        return name + " " + cost;
    }
}
