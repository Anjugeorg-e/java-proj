package netflix;

import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String userName;
    private String password;

    HashMap<Movie, Double> movieRating = new HashMap<Movie, Double>();
    HashMap<Tvshow, Double> tvshowRating = new HashMap<Tvshow, Double>();
    HashMap<Episode, Double> episodeRating = new HashMap<Episode, Double>();
    ArrayList<Watchlist>userWatchList = new ArrayList<>();

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean searchMovies(Netflix netflix, Movie movie) {
        if (netflix.moviesList.contains(movie)) {
            return true;
        }
        return false;
    }

    public boolean searchTvShows(Netflix netflix, Tvshow tvshow) {
        if (netflix.tvshowsList.contains(tvshow)) {
            return true;
        }
        return false;
    }

    public double getMovieRating(Movie movie) {
        return movieRating.get(movie);
    }

    public double getTvshowRating(Tvshow tvshow) {
        return tvshowRating.get(tvshow);
    }

    public void setMovieRating(Movie movie, Double rating) {
       this.movieRating.put(movie, rating);
    //    movie.ratingList.add(rating);
    }

    public void setTvshowRating(Tvshow tvshow, Double rating) {
        this.tvshowRating.put(tvshow, rating);
        tvshow.ratingList.add(rating);
    }

    public void setEpisodeRating(Episode episode, Double rating) {
        this.episodeRating.put(episode, rating);
        episode.episodeRatingList.add(rating);

    }

    public void addMovieToWatchList(Movie movie, Watchlist watchlist){
        watchlist.moviesWatchList.add(movie);
        // if(this.userWatchList == null){
        //     this.userWatchList.add(watchlist);
        // }
    }

    public void addTvshowToWatchList(Tvshow tvshow, Watchlist watchlist){
        watchlist.tvshowsWatchList.add(tvshow);
        // if(this.userWatchList == null){
        //     this.userWatchList.add(watchlist);
        // }
        
        
    }

    public void showWatchList(Watchlist watchlist){
        this.userWatchList.add(watchlist);
        
    }

    // public void displayWatchlist(Watchlist watchlist){

    //     System.out.println(watchlist.moviesWatchList);
    //     System.out.println(watchlist.tvshowsWatchList);
        
    // }

    public ArrayList<Watchlist> getUserWatchList() {
        return userWatchList;
    }

    public void setUserWatchList(ArrayList<Watchlist> userWatchList) {
        this.userWatchList = userWatchList;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + "]";
    }
    


}
