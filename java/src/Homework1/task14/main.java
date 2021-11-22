package Homework1.task14;

import java.io.*;
import java.util.*;

public class main {
    static List<String> films = new ArrayList<>();
    static List<List<Integer>> historyFilms = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        readFilms(films);
        readHistory(historyFilms);

        //printFilms(films);
        //printHistoryFilms(historyFilms);

        System.out.print("Введите номера фильмов, которые вы смотрели(Вводите через запятую: 2,2,4): ");
        String[] historyViewing = scanner.nextLine().split(",");
        System.out.println("Рекомендуем вам посмотреть фильм: " + recommendedFilm(historyViewing));
    }


    public static String recommendedFilm(String[] historyViewing) {
        Integer[] mass = convertStringMassInIntMass(historyViewing);
        //преобразования списка фильмов пользователя в сет, чтобы проверить посмотрел ли пользователь фильм с помощью contains
        Set<Integer> setViewingUsers = new HashSet<>(Arrays.asList(mass));
        List<Integer> listFilms = new ArrayList<>();
        //проходимся в цикле по истории просмотров по каждому пользователю и сравниваем смотрел ли текущий пользователь
        // фильмы из списка фильмов переданного пользователя
        for (int i = 0; i < historyFilms.size(); i++) {
            int count = 0;
            for (int j = 0; j < historyFilms.get(i).size(); j++) {
            // Если больше, то список пользователя с сервиса скинуть в общий список фильмов
                if (setViewingUsers.contains(historyFilms.get(i).get(j))) {
                    count++;
                }
            }
            //проверка: пользователь сервиса посмотрел больше половины фильмов или нет
            if (count >= historyFilms.size() / 2) {
                listFilms.addAll(historyFilms.get(i));
            }
        }
        for (int i = 0; i < listFilms.size(); i++) {
            if (setViewingUsers.contains(listFilms.get(i))) {
                //удаление просмотренных фильмов из полного списка
                listFilms.remove(i);
                i--;
            }
        }
        //рейтинг фильмов
        int[] ratingMass = new int[films.size()];
        //перебор по всей истории просмотров, подсчет рейтинга фильмов, которые пользователь еще не смотрел
        Set<Integer>setOfSortedViews=new HashSet<>(Arrays.asList(listFilms.toArray(new Integer[0])));
        Integer [] arrayOfSortedViews=setOfSortedViews.toArray(new Integer[0]);
        for (int i=0;i<historyFilms.size();i++){
            for (int j=0;j<historyFilms.get(i).size();j++){
                for (int k=0;k<arrayOfSortedViews.length;k++){
                    if (arrayOfSortedViews[k]==historyFilms.get(i).get(j)){
                        ratingMass[arrayOfSortedViews[k]-1]++;
                    }
                }
            }
        }
        int indexMaxRating = 0;
        for (int i = 0; i < ratingMass.length; i++) {
            if (ratingMass[i] > ratingMass[indexMaxRating]) {
                indexMaxRating = i;
            }
        }
        return films.get(indexMaxRating);
    }

    //метод нужен, чтобы можно было представить массив строк в виде массива Integer, для создания HashSet
    public static Integer[] convertStringMassInIntMass(String[] mass) {
        Integer[] intMass = new Integer[mass.length];
        for (int i = 0; i < intMass.length; i++) {
            intMass[i] = Integer.parseInt(mass[i]);
        }
        return intMass;
    }


    public static void readFilms(List<String> films) throws IOException {
        FileReader file = new FileReader("/Users/alekseyzhizhin/Documents/GitHub/javaByCroc/java/src/Homework1/task14/Films");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        while (line != null) {
            String[] mass = line.split(",");
            films.add(mass[1]);
            line = reader.readLine();
        }
        reader.close();
    }

    public static void readHistory(List<List<Integer>> historyFilms) throws IOException {
        FileReader file = new FileReader("/Users/alekseyzhizhin/Documents/GitHub/javaByCroc/java/src/Homework1/task14/HistoryFilms");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        int k = 0;
        while (line != null) {
            String[] mass = line.split(",");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < mass.length; i++) {
                list.add(Integer.parseInt(mass[i]));
            }
            historyFilms.add(list);
            k++;
            line = reader.readLine();
        }
        reader.close();
    }

    public static void printFilms(List<String> films) {
        for (int i = 0; i < films.size(); i++) {
            System.out.println((i + 1) + ". " + films.get(i));
        }
    }

    public static void printHistoryFilms(List<List<Integer>> historyFilms) {
        for (int i = 0; i < historyFilms.size(); i++) {
            System.out.println((i + 1) + ". " + historyFilms.get(i));
        }
    }

}
