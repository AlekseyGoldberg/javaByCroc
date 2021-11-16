package Homework1.task11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lot {
    private int cost;
    private String name;
    Instant time;

    public Lot(int cost,Instant time) {
        this.cost = cost;
        this.time = time;
    }

    public void bet(int cost, String name,Instant time) throws InterruptedException {
        synchronized (new Object()) {
            if (cost > this.cost && time.compareTo(this.time)<0 ) {
                this.cost = cost;
                this.name = name;
            }
        }
    }

    public String getWinner() throws AuctionExeption {
        if (name==null){return "Информация о торгах отсутствует";}
        if (Instant.now().compareTo(this.time)<0){
            throw new AuctionExeption();
        }else {
        return name + " " + cost;
        }
    }
}
