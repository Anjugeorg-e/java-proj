package netflix;

import java.util.ArrayList;

public class Playlist {
    
    private String title;
    private String genre;
    private int releaseYear;
    private double duration;

    public Playlist(String title, String genre, int releaseYear, double duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Playlist [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + ", duration="
                + duration + "]";
    }

    

    
}
