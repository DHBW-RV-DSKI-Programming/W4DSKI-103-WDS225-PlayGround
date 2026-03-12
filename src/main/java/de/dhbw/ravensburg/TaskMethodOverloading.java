package main.java.de.dhbw.ravensburg;

class AppDate {

    public void showDate(int day, int month, int year) {
        System.out.println(day + "-" + month + "-" + year);
    }

    public void showDate(String month, int day, int year) {
        System.out.println(month + "-" + day + "-" + year);
    }

    public String showDate(String day, String month, int year) {
        return String.format("%s-%s-%d", day, month, year);
    }
}

public class TaskMethodOverloading {

    public static void main(String[] args) {
        AppDate date = new AppDate();

        date.showDate(12, 3, 2026);
        date.showDate("March", 12, 2026);
        System.out.println(date.showDate("01", "March", 2026));
    }

}
