package Homework1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[]{28, 5, 11, 1, 44, 17, 8};
        printMass(mass);
        int indexMax = 0;
        int indexmin = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[indexMax]) {
                indexMax = i;
            }
            if (mass[i] < mass[indexmin]) {
                indexmin = i;
            }
        }
        int tmp = mass[0];
        mass[0] = mass[indexmin];
        mass[indexmin] = tmp;
        tmp = mass[mass.length - 1];
        mass[mass.length - 1] = mass[indexMax];
        mass[indexMax] = tmp;
        printMass(mass);
    }

    public static void printMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "\t");
        }
        System.out.println("\n");
    }
}
