package Homework1.task4;

public class Annotation {
    private Figure figure;
    private String signature;
    public Annotation(Figure figure, String signature) {
        this.figure = figure;
        this.signature = signature;
    }

    public Figure getFigure() {return figure;}

    public String getSignature() {return signature;}

    public String toString(){
        return figure+" <"+signature+">";
    }
}
