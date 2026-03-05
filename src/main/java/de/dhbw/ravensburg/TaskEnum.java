package main.java.de.dhbw.ravensburg;


enum SongGenre {

     POP(10),
     ROCK(5),
     METAL(5000);

     private int popularity;

     SongGenre(int popularity) {
         this.popularity = popularity;
     }

     int getPopularity() {
         return this.popularity;
     }

}

enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class TaskEnum {

    public static void main(String[] args) {
        System.out.println(SongGenre.POP.getPopularity());

        Weekday weekday = Weekday.valueOf(args[0]);
        switch (weekday) {
            case MONDAY, TUESDAY, WEDNESDAY -> System.out.println("Beginn");
            case THURSDAY, FRIDAY -> System.out.println("Richtung Wochenende");
            case SATURDAY, SUNDAY -> System.out.println("Wochenende");
        }
    }

}
