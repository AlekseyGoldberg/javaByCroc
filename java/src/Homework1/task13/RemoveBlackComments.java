package Homework1.task13;

import java.util.List;
import java.util.Set;

public class RemoveBlackComments implements BlackListFilter {
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        //придумать как плюсовать i потому что он удаляет строку и прибалвяет ожну забивая на одну строку
        for (int i = 0; i < comments.size();i++) {
            String[] mass = comments.get(i).split("");
            StringBuilder word = new StringBuilder();
            for (int k = 0; k < mass.length; k++) {
                if (!(mass[k].equals(" ") || mass[k].equals(".") || mass[k].equals(",") || mass[k].equals("!") ||
                        mass[k].equals("?") || mass[k].equals(":") || mass[k].equals(";")|| mass[k].equals("\n")||
                        mass[k].equals("\""))) {
                    word.append(mass[k]);
                } else {
//                    System.out.println(word);
                    if (blackList.contains(word.toString().toLowerCase())) {
                        comments.remove(i);
                        i--;
                        break;
                    }
                    word.delete(0, word.length());
                }
            }
        }
    }
}
