package netflix;

import java.util.ArrayList;
import java.util.HashMap;

public class Tvshow {
    private String title;
    private String genre;
    private int releaseYear;
    private double duration;
    ArrayList<Episode> episodesList = new ArrayList<>();
    ArrayList<Double> ratingList = new ArrayList<>();

    public Tvshow(String title, String genre, int releaseYear, double duration) {

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

    public ArrayList<Double> getRatingList() {
        return ratingList;
    }

    public void setRatingList(ArrayList<Double> ratingList) {
        this.ratingList = ratingList;
    }

    public double findAverageRatingOfTvshow() {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < this.ratingList.size(); i++) {
            sum += this.ratingList.get(i);
        }
        avg = sum / this.ratingList.size();
        return avg;
    }

    public void addEpisodeToList(Episode episode) {
        this.episodesList.add(episode);
    }

    @Override
    public String toString() {
        return "Tvshow [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + ", duration=" + duration
                + ", ratingList=" + ratingList + "]";
    }

    // @Override
    // public String toString() {
    // return "Tvshow [title=" + title + ", genre=" + genre + ", releaseYear=" +
    // releaseYear + ", duration=" + duration
    // + "]";
    // }

}
