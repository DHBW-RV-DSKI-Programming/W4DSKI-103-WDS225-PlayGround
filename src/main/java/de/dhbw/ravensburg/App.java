package main.java.de.dhbw.ravensburg;

public class App {

    public static void main(String[] args) {
        byte b = 4;
        short s = 2;
        int i = 232904239;
        long l = 23290423;
        long l2 = 2;

        float f = 2.0f;
        double d = 2.0;

        char c = 'c';
        char c2 = 97;
        System.out.println(c2);

        boolean bool = false;
        System.out.println(bool);

        String str = "diAbEtes";
        System.out.println(str.toUpperCase());

        int num1 = 1;
        int num2 = 5;
        System.out.println(num1 == num2 ^ num2 == num1);

        num1 += num2;
        System.out.println(num1);

        // num2 = 5
        --num2;
        System.out.println(num2);

        int student1Grade = 1;
        int student2Grade = ++student1Grade;
        int student3Grade = student1Grade--;
        System.out.println(student1Grade + student2Grade + student3Grade);
    }

}