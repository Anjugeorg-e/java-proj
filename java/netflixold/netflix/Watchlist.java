package netflix;

import java.util.ArrayList;

public class Watchlist {
    private User user;
    ArrayList<Movie>moviesWatchList= new ArrayList<>();
    ArrayList<Tvshow>tvshowsWatchList = new ArrayList<>();


    public Watchlist(User user) {
        this.user = user;
     
    }

    @Override
    public String toString() {
        return "Watchlist [user=" + user + ", moviesWatchList=" + moviesWatchList + ", tvshowsWatchList="
                + tvshowsWatchList + "]";
    }
    
    



}
