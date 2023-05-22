package netflix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tvshow extends Playlist {

    ArrayList<Episode> episodesList = new ArrayList<>();
    HashMap<User, Double>ratingList = new HashMap<User, Double>();

    public Tvshow(String title, String genre, int releaseYear, double duration) {
        super(title, genre, releaseYear, duration);
    }


    public double findAverageRatingOfTvshow() {
        double sum = 0;
        double avg;
        for(Map.Entry<User, Double> entry : this.ratingList.entrySet()){
            sum += entry.getValue();
        }
        avg = sum / this.ratingList.size();
        return avg;
    }

    public void addEpisodeToList(Episode episode) {
        this.episodesList.add(episode);
    }

    

    // @Override
    // public String toString() {
    // return "Tvshow [title=" + title + ", genre=" + genre + ", releaseYear=" +
    // releaseYear + ", duration=" + duration
    // + "]";
    // }

}
