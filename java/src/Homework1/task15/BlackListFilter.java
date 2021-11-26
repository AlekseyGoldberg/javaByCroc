package Homework1.task15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public interface BlackListFilter {
    /**
     * From the given list of comments removes ones
     * that contain words from the black list.
     *
     * @param comments  list of comments; every comment
     *                  is a sequence of words, separated
     *                  by spaces, punctuation or line breaks
     * @param blackList list of words that should not
     *                  be present in a comment
     */
    default <T> ArrayList<T> filterComments(Predicate<T> blackList, Iterable<T> comments)
    {
        ArrayList<T> newList=new ArrayList<>();
        Iterator <T> iterator= comments.iterator();
        while (iterator.hasNext()){
            T comment=iterator.next();
            if (!blackList.test(comment))
                newList.add(comment);
        }
        return newList;
    }
}