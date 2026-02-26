package main.java.de.dhbw.ravensburg;

public class App4 {

    public static void main(String[] args) {
        int age = 21;
        displayStudentInformation(age, "SAP");
        age++;
        displayStudentInformation(age, "Microsoft");
    }

    static void displayStudentInformation(int age, String companyName) {
        System.out.println("Age: " + age);
        System.out.println("Company: " + companyName);
    }

}
