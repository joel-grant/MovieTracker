package org.example;

public class MovieList {
    private static final int LIST_SIZE = 1;
    private Movie[] movies;
    private int numberOfMovies;

    public MovieList() {
        this.movies = new Movie[LIST_SIZE];
        this.numberOfMovies = 0;
    }

    public boolean addNewMovie(Movie movie) {
        expandList();
        this.movies[numberOfMovies] = movie;
        this.numberOfMovies++;
        boolean wasAdded = true;
        return wasAdded;
    }

    public void getAllMovies() {
        for (int i = 0; i < movies.length -1; i++) {
            System.out.println(movies[i].getMovieName());
        }
    }

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
