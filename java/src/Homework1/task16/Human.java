package Homework1.task16;

public class Human {
    private String FIO;
    private int age;

    Human(String FIO, int age) {
        this.FIO = FIO;
        this.age = age;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getAge() {
        return this.age;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Human.class)) return false;
        Human alt = (Human) obj;
        return this.FIO.equals(alt.FIO);
    }

    public int hashCode() {
        return FIO.hashCode();
    }

    public String toString() {
        return FIO + "(" + age + ")";
    }
}
