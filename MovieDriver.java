/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: This class collects information about movies (title, rating, and tickets sold)
 *              and displays the details using the Movie class in a loop.
 * Due: 07/03/2025
 * Platform/compiler: Eclipse/VDI
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * 
 * Print your Name here: Yihune Gizachew
 */

import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;

        do { 
            // Create new Movie object
            Movie myMovie = new Movie();
            
            // Prompt for movie title
            System.out.print("Enter the title of a movie: ");
            String title = keyboard.nextLine();
            myMovie.setTitle(title);
            
            // Prompt for rating
            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            myMovie.setRating(rating);
            
            // Prompt for tickets sold
            System.out.print("Enter the number of tickets sold at a (unnamed) theater: ");
            int tickets = keyboard.nextInt();
            myMovie.setSoldTickets(tickets);
            keyboard.nextLine();  // Clear leftover newline
            
            // Output movie information
            System.out.println("\nMovie Information");
            System.out.println(myMovie.toString());
            
            // Ask to continue
            System.out.print("\nDo you want to enter another movie? (yes/No): ");
            again = keyboard.nextLine();
            
        } while (again.equalsIgnoreCase("yes"));

        System.out.println("\nDone!");
        keyboard.close();
    } 
}


























































}
