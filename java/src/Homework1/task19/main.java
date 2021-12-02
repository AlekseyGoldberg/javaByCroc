package Homework1.task19;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("/Users/alekseyzhizhin/Documents/GitHub/javaByCroc/java/src/Homework1/task19/output");
        try {
            fileWriter.write("Hello, World!");
            fileWriter.flush();
        }catch (FileNotFoundException exception){
            System.out.println("Такого файла нет!");
        }finally {
            fileWriter.close();

        }

    }
}
