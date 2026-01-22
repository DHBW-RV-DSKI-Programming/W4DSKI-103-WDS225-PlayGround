package main.java.de.dhbw.ravensburg;

import java.util.Scanner;

public class TaskIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1
        System.out.println("> Bitte eine Nummer eingeben");
        int num1 = scanner.nextInt();

        if (num1 == 0) {
            System.out.println("Gleich 0");
        } else if (num1 < 0) {
            System.out.println("Kleiner 0");
        } else {
            System.out.println("Größer 0");
        }

        // Part 2
        System.out.println("> Note eingeben");
        int grade = scanner.nextInt();

        if (grade == 1) {
            System.out.println("A");
        } else if (grade == 2) {
            System.out.println("B");
        } else if (grade == 3) {
            System.out.println("C");
        } else if (grade == 4) {
            System.out.println("D");
        } else if (grade == 5) {
            System.out.println("E");
        } else if (grade == 6) {
            System.out.println("F");
        }

        // Part 3
        int a = 25;
        int b = 42;
        int c = 12;

        int max;

        if (a >= b) {
            if (a >= c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b >= c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println("Die maximale Zahl ist: " + max);

        // Part 4
        int numberEvenOdd = 1;
        boolean result = numberEvenOdd % 2 == 0 ? true : false;
        System.out.println("Die Zahl ist gerade: " + result);
    }

}
