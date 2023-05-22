package netflix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private double duration;

    // ArrayList<Double>ratingList = new ArrayList<>();
    HashMap<User, Double>ratingList = new HashMap<User, Double>();

    public Movie(String title, String genre, int releaseYear, Double duration) {
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


    // public ArrayList<Double> getRatingList() {
    //     return ratingList;
    // }


    // public void setRatingList(ArrayList<Double> ratingList) {
    //     this.ratingList = ratingList;
    // }

    public double findAverageRatingOfMovie() {
        double sum = 0;
        double avg = 0;
        for(int i=0; i<ratingList.size();i++){
            sum= sum + this.ratingList.get(i);
        }
        
        // avg = sum / this.ratingList.size();
        // return avg;
        return sum;
    }

    // @Override
    // public String toString() {
    //     return "Movie [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + ", duration=" + duration
    //             + ", ratingList=" + ratingList + "]";
    // }

    // @Override
    // public String toString() {
    //     return "Movie [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + ", duration=" + duration
    //             + "]";
    // }



    
}
