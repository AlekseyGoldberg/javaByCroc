package Homework1.task11;

public class Game  implements Runnable {
    private Lot lot;
    private int cost;
    private String name;


    public Game(Lot lot,int cost, String name) {
        this.cost=cost;
        this.lot= lot;
        this.name = name;
    }

    public void run() {
            try {
                lot.bet(cost,name);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
