package netflix;

import java.util.ArrayList;
import java.util.HashMap;

public class Episode extends Playlist {

    private String episodeTitle;
    private int episodeNumber;
    private double episodeDuration;
    HashMap<User, Double>episodeRatingLIst = new HashMap<User, Double>();

    public Episode(String title, String genre, int releaseYear, double duration, String episodeTitle,
            int episodeNumber, double episodeDuration) {
        super(title, genre, releaseYear, duration);
        this.episodeTitle = episodeTitle;
        this.episodeNumber = episodeNumber;
        this.episodeDuration = episodeDuration;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }


    public HashMap<User, Double> getEpisodeRatingLIst() {
        return episodeRatingLIst;
    }

    public void setEpisodeRatingLIst(HashMap<User, Double> episodeRatingLIst) {
        this.episodeRatingLIst = episodeRatingLIst;
    }

    @Override
    public String toString() {
        return "Episode [episodeTitle=" + episodeTitle + ", episodeNumber=" + episodeNumber + ", episodeDuration="
                + episodeDuration + "]";
    }

}
