package netflix;

public class Main {
    public static void main(String[] args) {
        User anu = new User("anu", "fgthd");
        User sam = new User("Sam", "kjgft");

        Movie stranger = new Movie("stranger", "horror", 2001, 2.30);
        Movie wonderland = new Movie("wonderland", "comedy", 2004, 2.15);

        Tvshow heirs = new Tvshow("heirs", "comedy", 2012, 23.45);
        Tvshow storm = new Tvshow("storm", "action", 2001, 123.21);

        Netflix netflix = new Netflix();
        netflix.addMovietoNetflix(wonderland);
        netflix.addMovietoNetflix(stranger);
        netflix.addTvshowToNetflix(storm);
        netflix.addTvshowToNetflix(heirs);
        netflix.addNewUser(sam);
        netflix.addNewUser(anu);

        System.out.println(anu.searchMovies(netflix, wonderland));
        System.out.println(anu.searchTvShows(netflix, storm));

        anu.setMovieRating(stranger, 2.3);
        anu.setTvshowRating(heirs, 4.3);
        anu.setMovieRating(wonderland, 4.5);
        anu.setTvshowRating(storm, 3.4);
        sam.setTvshowRating(storm, 4.5);
        anu.setTvshowRating(storm, 5.6);
        System.out.println(storm.ratingList);

        System.out.println(storm.findAverageRatingOfTvshow());
        System.out.println(stranger.findAverageRatingOfMovie());

        System.out.println(netflix.moviesList);
        System.out.println(netflix.tvshowsList);

        Watchlist anuswatchlist = new Watchlist(anu);
        anu.addMovieToWatchList(wonderland, anuswatchlist);
        anu.addTvshowToWatchList(storm, anuswatchlist);
        anu.addMovieToWatchList(stranger, anuswatchlist);
        System.out.println(anuswatchlist);

        Episode episodeOne = new Episode("storm", "action", 2001, 23.45, "episodeOne", 1, 15);
        Episode episodeTwo = new Episode("storm", "action", 2001, 23.45, "episodeTwo", 2, 30);
        

        anu.setEpisodeRating(episodeOne, 3.4);
        System.out.println(episodeOne.episodeRatingList);
   
        storm.addEpisodeToList(episodeOne);
        storm.addEpisodeToList(episodeTwo);
        System.out.println(storm.episodesList);
        System.out.println(episodeOne.getTitle());
        

    }
}
