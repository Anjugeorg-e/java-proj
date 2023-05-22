package netflix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Movie extends Playlist {
  
    HashMap<User, Double>ratingList = new HashMap<User, Double>();
    
    public Movie(String title, String genre, int releaseYear, double duration) {
        super(title, genre, releaseYear, duration);
      
    }

    public double findAverageRatingOfMovie() {
        double sum = 0;
        double avg;
        for(Map.Entry<User, Double> entry : ratingList.entrySet()){
            sum += entry.getValue();
        }
        avg = sum / this.ratingList.size();
        return avg;
    }

   

    // @Override
    // public String toString() {
    //     return "Movie []";
    // }


    
}
