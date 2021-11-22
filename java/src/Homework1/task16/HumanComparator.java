package Homework1.task16;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if (o2.getAge() == o1.getAge()) {
            return o1.getFIO().compareTo(o2.getFIO());
        } else {
            return Integer.parseInt(
                    String.valueOf(Integer.toString(o2.getAge()).compareTo(Integer.toString(o1.getAge())))
            );
        }
    }
}
