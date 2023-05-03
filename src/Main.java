import Users.User;
import Users.bibliothecaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static Users.User.url;
import static Users.User.username;
import static Users.User.password;

public class Main {
    public static void main(String[] args) throws SQLException {
        //System.out.printf("welcome!");
        /*bibliothecaire b1=new bibliothecaire();


        Auteur auteur=new Auteur();
        auteur.ajouter(auteur);*/


        String url="jdbc:mysql://localhost:3306/library";
        String user="root";
        String pass="1290MK";
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Welcome to the Library App!");

            // Main loop for user input
            while (true) {
                // Display menu options to the user
                System.out.println("\nPlease login :");
                System.out.println("1. Login");
                System.out.println("2. Exit");

                // Read user input from the console
                Scanner scanner = new Scanner(System.in);
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        Anterface.Login();
                        break;
                    case 2:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
        }


    }
}