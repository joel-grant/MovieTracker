package org.example;
import java.util.Scanner;

/**
 * The main class for the entire program.  Handles the menu and user inputs.
 *
 * @author Joel Grant
 * @version 1.0 2022-Nov-04 Initial brute force version.
 *
 */
public class Main {
    private static final int ADD_MOVIE = 1;
    private static final int VIEW_ALL_MOVIES = 2;
    private static final int QUIT = 3;
    
    /**
     *
     * Driver of the main program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String response = "";
        System.out.println("Welcome to the Movie Tracker!");

        MovieList movies = new MovieList();

        while (!response.equals("3")) {
            System.out.println("Please enter the number of the selection you wish to make.");
            System.out.println("1. Add a new movie to your tracker.");
            System.out.println("2. View movies in your tracker.");
            System.out.println("3. Quit Program.");

            response = userInput.next();

            if (response.equals("1")) {
                Movie newMovie = new Movie();
                System.out.println("Enter the name of the movie");
                newMovie.setMovieName(userInput.next());
                userInput.nextLine();
                System.out.println("Did you watch the movie?");
                newMovie.setMovieWatched(userInput.next());

                System.out.println(newMovie.getMovieName());
                System.out.println(newMovie.getTimesWatched());
                System.out.println(newMovie.getMovieWatched());
                movies.addNewMovie(newMovie);
            }
            else if (response.equals("2")) {
                movies.getAllMovies();
            }

        }






    }
}