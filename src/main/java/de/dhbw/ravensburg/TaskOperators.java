package main.java.de.dhbw.ravensburg;

public class TaskOperators {

    public static void main(String[] args) {
        // Part 1
        int num1 = 2;
        int num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        double num3 = 10.0;
        double num4 = 2.0;

        num3 += num4;
        num3 -= num4;
        num3 *= num4;
        num3 /= num4;

        System.out.println(num3);

        // Part 2
        int numero1 = 4;
        int numero2 = 6;

        System.out.println(numero1 > numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 == numero2);

        // Part 3
        boolean bool1 = false;
        boolean bool2 = true;
        boolean bool3 = true;

        System.out.println((bool1 || bool2) && (bool2 || bool3) && (bool1 || bool3));

        // Part 4
        int incDec = 0;
        System.out.println(incDec++);
        System.out.println(--incDec);
    }

}
