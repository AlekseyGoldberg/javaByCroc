package Homework1.task16;

import java.io.*;
import java.util.*;

public class main {
    static List<String> input = new ArrayList<>();
//    static int[] ageLimits = new int[]{18, 25, 35, 45, 60, 80, 100};

    static List<Set<Human>> groups = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int[] ageLimits = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        inputPeople(); //считываем людей из файла
        createGroups(ageLimits);// создаем возрастные группы
        sortingByGroups(input, ageLimits); //сортируем людей по возрасту
        printGroups(groups, ageLimits);// выводим группы в файл
    }

    public static void sortingByGroups(List<String> input, int[] ageLimits) {
        for (String str : input) {
            String[] massOnString = str.split(",");
            Human human = new Human(massOnString[0], Integer.parseInt(massOnString[1]));
            for (int i = 0; i < ageLimits.length; i++) {
                if (human.getAge() >= ageLimits[ageLimits.length - 1]) {
                    groups.get(7).add(human);
                    break;
                }
                if (human.getAge() <= ageLimits[i]) {
                    groups.get(i).add(human);
                    break;
                }
            }
        }
    }

    public static void inputPeople() throws IOException {
        FileReader file = new FileReader("/Users/alekseyzhizhin/Documents/GitHub/javaByCroc/java/src/Homework1/task16/input");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        while (!(line.toLowerCase().equals("end"))) {
            input.add(line);
            line = reader.readLine();
        }
        file.close();
    }

    public static void createGroups(int[] ageLimits) {
        for (int i = 0; i <= ageLimits.length; i++) {
            groups.add(new TreeSet<>(new HumanComparator()));
        }
    }

    public static void printGroups(List<Set<Human>> input, int[] ageLimits) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/alekseyzhizhin/Documents/GitHub/javaByCroc/java/src/Homework1/task16/output");
        for (int i = input.size() - 1; i >= 0; i--) {
            if (groups.get(i).isEmpty()) continue;
            StringBuilder text = new StringBuilder();
            if (i == 0) {
                text.append("0-");
                text.append(ageLimits[i]);
                text.append(": ");
                text.append(groups.get(i));
            } else if (i == input.size() - 1) {
                text.append(ageLimits[i - 1]);
                text.append("+: ");
                text.append(groups.get(i));
            } else {
                text.append(ageLimits[i - 1]);
                text.append("-");
                text.append(ageLimits[i]);
                text.append(": ");
                text.append(groups.get(i));
            }
            text.append("\n");
            fileWriter.write(text.toString());
            fileWriter.flush();
        }
        fileWriter.close();
    }
}
