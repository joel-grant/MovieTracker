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

    /**
     * Getter method to provide the movie name.
     *
     * @return string of the movie's name.
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Getter method to provide the quantity of times the movie has been watched.
     *
     * @return integer of quantity of times the movie has been watched.
     */
    public int getTimesWatched() {
        return timesWatched;
    }

    /**
     * Returns the response if this movie has been watched by the user before.
     *
     * @return true/false if the movie has been watched.
     */
    public boolean getMovieWatched() {
        return movieWatched;
    }

    /**
     * Setter method to set the name of the movie from user's input.
     *
     * @param newMovieName provided from the user's input.
     */
    public void setMovieName(String newMovieName) {
        this.movieName = newMovieName;
    }

    /**
     * Setter method that establishes how many times the movie has been watched by the user.
     *
     * @param newTimesWatched directly set the new number of times watched.
     */
    public void setTimesWatched(int newTimesWatched) {
        this.timesWatched = newTimesWatched;
    }

    /**
     * Setter method that says if the movie has been watched by the user or not.
     *
     * @param setMovieWatched a string of yes/no that sets a boolean variable.
     */
    public void setMovieWatched(String setMovieWatched) {
        String watched = setMovieWatched.toLowerCase();

        if (watched.equals("yes")) {
            this.movieWatched = true;
            this.timesWatched++;
        }
    }
}
