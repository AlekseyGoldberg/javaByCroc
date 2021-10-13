package Homework1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, чтобы узнать его размер: ");

        printBytes(scanner.nextDouble());
    }

    public static void printBytes(double number) {
        if (0 < number && number < Math.pow(2, 10)) {
            System.out.println(String.format("%.1f B", number));
        } else if (Math.pow(2, 10) <= number && number < Math.pow(2, 20)) {
            System.out.println(String.format("%.1f KB", number / Math.pow(2, 10)));
        } else if (Math.pow(2, 20) <= number && number < Math.pow(2, 30)) {
            System.out.println(String.format("%.1f MB", number / Math.pow(2, 20)));
        } else if (Math.pow(2, 30) <= number && number < Math.pow(2, 40)) {
            System.out.println(String.format("%.1f GB", number / Math.pow(2, 30)));
        } else if (Math.pow(2, 40) <= number && number < Math.pow(2, 50)) {
            System.out.println(String.format("%.1f TB", number / Math.pow(2, 40)));
        } else {
            System.out.println("Мега большое число");
        }


    }
}
