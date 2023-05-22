package netflix;

import java.util.ArrayList;

public class Netflix {

    ArrayList<Movie> moviesList = new ArrayList<>();
    ArrayList<Tvshow> tvshowsList = new ArrayList<>();
    ArrayList<User> userList = new ArrayList<>();

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }


    public ArrayList<Tvshow> getTvshowsList() {
        return tvshowsList;
    }


    public ArrayList<User> getUserList() {
        return userList;
    }


    public void addMovietoNetflix(Movie movie){
        this.moviesList.add(movie);
    }

    public void addTvshowToNetflix(Tvshow tvshow){
        this.tvshowsList.add(tvshow);
    }

    public void addNewUser(User user){
        this.userList.add(user);
    }

}
