package netflix;

import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String userName;
    private String password;
    private Netflix netflix;

    HashMap<Movie, Double> movieRating = new HashMap<Movie, Double>();
    HashMap<Tvshow, Double> tvshowRating = new HashMap<Tvshow, Double>();
    HashMap<Episode, Double> episodeRating = new HashMap<Episode, Double>();
    ArrayList<Playlist> userWatchList = new ArrayList<>();

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
        movie.ratingList.put(this, rating);
    }

    public void setTvshowRating(Tvshow tvshow, Double rating) {
        this.tvshowRating.put(tvshow, rating);
        tvshow.ratingList.put(this, rating);
    }

    public void setEpisodeRating(Episode episode, Double rating) {
        this.episodeRating.put(episode, rating);
        episode.episodeRatingLIst.put(this, rating);

    }

    // public void addMovieToWatchList(Movie movie, Watchlist watchlist) {
    // watchlist.moviesWatchList.add(movie);
    // // if(this.userWatchList == null){
    // // this.userWatchList.add(watchlist);
    // // }
    // }

    // public void addTvshowToWatchList(Tvshow tvshow, Watchlist watchlist) {
    // watchlist.tvshowsWatchList.add(tvshow);
    // // if(this.userWatchList == null){
    // // this.userWatchList.add(watchlist);
    // // }

    // }

    public void addMovieToWatchList(Playlist playlist) {
        this.userWatchList.add(playlist);
    }
    // public void showWatchList(Movie movie) {
    // this.userWatchList.add(movie);

    // }

    // public ArrayList<Watchlist> getUserWatchList() {
    // return userWatchList;
    // }

    // public void setUserWatchList(ArrayList<Watchlist> userWatchList) {
    // this.userWatchList = userWatchList;
    // }

    @Override
    public String toString() {
        return "User [userName=" + userName + "]";
    }

}
