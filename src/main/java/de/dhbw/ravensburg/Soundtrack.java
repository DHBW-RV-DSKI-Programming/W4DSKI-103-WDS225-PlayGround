package main.java.de.dhbw.ravensburg;

import java.util.Objects;

public class Soundtrack {

    private String title;
    private String artist;
    private int duration;

    public Soundtrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return String.format("Soundtrack{title='%s', artist='%s', duration=%d:%02d}",
                             title, artist, minutes, seconds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Soundtrack that = (Soundtrack) obj;
        return duration == that.duration &&
               Objects.equals(title, that.title) &&
               Objects.equals(artist, that.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, duration);
    }

}
