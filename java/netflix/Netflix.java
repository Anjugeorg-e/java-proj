package netflix;

import java.util.ArrayList;

public class Netflix {

    ArrayList<Movie> moviesList = new ArrayList<>();
    ArrayList<Tvshow> tvshowsList = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Playlist> listofMoviesTvshows = new ArrayList<>();

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }

    public ArrayList<Tvshow> getTvshowsList() {
        return tvshowsList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void addMovietoNetflix(Movie movie) {
        this.moviesList.add(movie);
    }

    public void addTvshowToNetflix(Tvshow tvshow) {
        this.tvshowsList.add(tvshow);
    }

    public void addNewUser(User user) {
        this.userList.add(user);
    }

    public void addMovie(Movie movie) {
        listofMoviesTvshows.add(movie);
    }

    public void addTvshow(Tvshow tvshow) {
        listofMoviesTvshows.add(tvshow);
    }

    // @Override
    // public String toString() {
    // return "Netflix [listofitems=" + listofitems + "]";
    // }

}
