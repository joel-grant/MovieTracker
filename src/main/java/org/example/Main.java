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
        int response = 0;
        System.out.println("Welcome to the Movie Tracker!");

        MovieList movies = new MovieList();

        while (response != QUIT) {
            displayMenu();

            response = userInput.nextInt();
            userInput.nextLine();

            System.out.println();

            switch (response) {
                case ADD_MOVIE:
                    addMovie(movies, userInput);
                    break;
                case VIEW_ALL_MOVIES:
                    movies.getAllMovies();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Facilitates the user input to capture the movie details from the user.
     *
     * @param moviesList An Array of Movie objects
     * @param userInput From the user's keyboard.
     */
    private static void addMovie(MovieList moviesList, Scanner userInput) {
        Movie newMovie = new Movie();

        System.out.println("Enter the name of the movie");
        newMovie.setMovieName(userInput.nextLine());
//                userInput.nextLine();
        System.out.println("Did you watch the movie?");
        newMovie.setMovieWatched(userInput.next());
        moviesList.addNewMovie(newMovie);
    }

    /**
     * Displays basic text output for the user to see the menu options.
     */
    private static void displayMenu() {
        System.out.println("Please enter the number of the selection you wish to make.");
        System.out.println(ADD_MOVIE + ". Add a new movie to your tracker.");
        System.out.println(VIEW_ALL_MOVIES + ". View movies in your tracker.");
        System.out.println(QUIT + ". Quit Program.");
    }
}