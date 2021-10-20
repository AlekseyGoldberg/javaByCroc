package Homework1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[]{44, 5, 11, 1, 28, 17, 8};
        printMass(mass);
        int indexMax = 0;
        int indexMin = 0;
        int max=mass[indexMax];
        int min=mass[indexMin];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > mass[indexMax]) {
                indexMax = i;
                max=mass[i];
            }
            if (mass[i] < mass[indexMin]) {
                indexMin = i;
                min=mass[i];
            }
        }
        int tmp=mass[0];
        mass[0]=min;
        mass[indexMin]=tmp;
        tmp=mass[mass.length-1];
        mass[mass.length-1]=max;
        mass[indexMin]=tmp;
        printMass(mass);
    }

    public static void printMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "\t");
        }
        System.out.println("\n");
    }
}
