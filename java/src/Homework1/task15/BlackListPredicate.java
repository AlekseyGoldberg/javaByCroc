package Homework1.task15;

import java.util.List;
import java.util.function.Predicate;

public class BlackListPredicate implements Predicate<String> {
    private List<String> blackList;
    public BlackListPredicate(List<String> blackList){
        this.blackList=blackList;
    }
    @Override
    public boolean test(String s) {
        for (String str : blackList) {
            if (s.toLowerCase().contains(str.toLowerCase()))return true;
        }
        return false;
    }
}
