package Homework1.task13;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;
import java.util.logging.Filter;

public class main {
    static List<String> comments=new ArrayList<>();
    static Set<String> blackWords=new HashSet<>();
    public static void main(String[] args) {
        RemoveBlackComments filter=new RemoveBlackComments();
        competitionBlackWords(blackWords);
        competitionComments(comments);

        printComments(comments);

        filter.filterComments(comments,blackWords);

        System.out.println("\n\n\n");
        printComments(comments);


    }

    public static void printComments(List<String>comments){
        for (String comment:comments){
            System.out.println(comment);
        }
    }

    public static void competitionBlackWords(Set<String> blackWords){
        blackWords.add("плохой");
        blackWords.add("ужасно");
        blackWords.add("отстой");
        blackWords.add("фу");
    }
    public static void competitionComments(List<String> comments){
        comments.add("Плохой ");
        comments.add("Фу мне вообще не нравится ");
        comments.add("Сервер плохой. можно было бы и получше сделать!!!");
        comments.add("Хорошая работа. Разработчики молодцы.");
        comments.add("Видно, что небольшой стартап. У них все получится.");
        comments.add("Отстой?");
        comments.add("Я думаю: \"Это отстой\"; Кто так делает");
        comments.add("Супер!\nмне очень нравится");
        comments.add("Ужасно работает!");
    }
}
