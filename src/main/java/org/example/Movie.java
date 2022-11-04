package org.example;

/**
 * Creates a movie object that can be stored in a user's database.
 *
 * @author Joel Grant
 * @version 1.0
 *
 */
public class Movie {
    private String movieName;
    private int timesWatched;
    private boolean movieWatched;

    /**
     * Default constructor.
     */
    public Movie() {
        this.movieName = "TEST";
        this.timesWatched = 0;
        this.movieWatched = false;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getTimesWatched() {
        return timesWatched;
    }

    public boolean getMovieWatched() {
        return movieWatched;
    }

    public void setMovieName(String newMovieName) {
        this.movieName = newMovieName;
    }

    public void setTimesWatched(int newTimesWatched) {
        this.timesWatched = newTimesWatched;
    }

    public void setMovieWatched(String setMovieWatched) {
        String watched = setMovieWatched.toLowerCase();

        if (watched.equals("yes")) {
            this.movieWatched = true;
            this.timesWatched++;
        }
    }
}
