package main.java.de.dhbw.ravensburg;

import java.util.Scanner;

public class TaskSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1
        System.out.println("Bitte ein Getränk auswählen");
        System.out.print("> ");
        int drinkNumber = sc.nextInt();

        switch (drinkNumber) {
            case 1 -> System.out.println("Wasser");
            case 2 -> System.out.println("Kaffee");
            case 3 -> System.out.println("Tee");
            case 4 -> System.out.println("Limonade");
            default -> System.out.println("Bitte eine gültige Zahl eingeben!");
        }

        // Part 2
        System.out.println("Bitte Schulnote eingeben");
        System.out.print("> ");
        int gradeNumber = sc.nextInt();

        switch (gradeNumber) {
            case 1:
            case 2:
                System.out.println("Eine gute Note");
                break;
            case 3:
                System.out.println("Akzeptabel");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
            case 6:
                System.out.println("Nicht ausreichend");
                break;
            default:
                System.out.println("Bitte eine gültige Zahl eingeben!");
        }
    }

}
