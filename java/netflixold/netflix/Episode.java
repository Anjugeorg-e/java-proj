package netflix;

import java.util.ArrayList;

public class Episode extends Tvshow {

    private String episodeTitle;
    private int episodeNumber;
    private double duration;
    ArrayList<Double> episodeRatingList = new ArrayList<>();

    public Episode(String title, String genre, int releaseYear, double duration, String episodeTitle, int episodeNumber,
            double duration2) {
        super(title, genre, releaseYear, duration);
        this.episodeTitle = episodeTitle;
        this.episodeNumber = episodeNumber;
        duration = duration2;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public double getDuration() {
        return duration;
    }

    public ArrayList<Double> getEpisodeRatingList() {
        return episodeRatingList;
    }

    @Override
    public String toString() {
        return "Episode [episodeTitle=" + episodeTitle + ", episodeNumber=" + episodeNumber + ", duration=" + duration
                + "]";
    }

    
    

}
