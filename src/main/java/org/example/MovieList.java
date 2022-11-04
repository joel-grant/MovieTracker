package org.example;

/**
 * MovieLists are lists of Movie objects that facilitates the CRUD process of lists of movies.
 *
 * @author Joel Grant
 * @version 1.0
 */
public class MovieList {
    private static final int LIST_SIZE = 1; // Default size of the list is 1.
    private Movie[] movies; // the default list of movie objects
    private int numberOfMovies; //

    /**
     * Default Constructor for a movie list object as a list of Movie objects.
     */
    public MovieList() {
        this.movies = new Movie[LIST_SIZE];
        this.numberOfMovies = 0;
    }

    /**
     * Facilitates adding a new movie object to the MovieList array.
     *
     * @param movie object
     * @return true or false
     */
    public boolean addNewMovie(Movie movie) {
        expandList();
        this.movies[numberOfMovies] = movie;
        this.numberOfMovies++;
        boolean wasAdded = true;
        return wasAdded;
    }

    /**
     * Getter method to iterate through all of the movies on the list.
     */
    public void getAllMovies() {
        for (int i = 0; i < movies.length -1; i++) {
            System.out.println(movies[i].getMovieName());
        }
    }

    /**
     * Each time something is added to the list, the list is expanded via this method.
     *
     * @return true/false if the list was "expanded".
     */
    private boolean expandList() {
        boolean wasExpanded = false;

        Movie[] tempArray = new Movie[movies.length + LIST_SIZE];

        for (int i = 0; i <= movies.length -1; i++) {
            tempArray[i] = movies[i];
        }
        movies = tempArray;

        wasExpanded = (movies == tempArray);
        return wasExpanded;
    }
}
