import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;
public class Anterface {

    static String url="jdbc:mysql://localhost:3306/library";
    static String user="root";
    static String pass="1290MK";


    public static void Header()
    {

        System.out.println(" " +
                "             ██████╗ ███████╗███████╗████████╗██╗ ██████╗ ███╗   ██╗              \n" +
                "            ██╔════╝ ██╔════╝██╔════╝╚══██╔══╝██║██╔═══██╗████╗  ██║              \n" +
                "            ██║  ███╗█████╗  ███████╗   ██║   ██║██║   ██║██╔██╗ ██║              \n" +
                "            ██║   ██║██╔══╝  ╚════██║   ██║   ██║██║   ██║██║╚██╗██║              \n" +
                "            ╚██████╔╝███████╗███████║   ██║   ██║╚██████╔╝██║ ╚████║              \n" +
                "             ╚═════╝ ╚══════╝╚══════╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝              \n" +
                "                                                                                  \n" +
                "██████╗ ██╗██████╗ ██╗     ██╗ ██████╗ ████████╗██╗  ██╗ ██████╗ ██╗   ██╗███████╗\n" +
                "██╔══██╗██║██╔══██╗██║     ██║██╔═══██╗╚══██╔══╝██║  ██║██╔═══██╗██║   ██║██╔════╝\n" +
                "██████╔╝██║██████╔╝██║     ██║██║   ██║   ██║   ███████║██║   ██║██║   ██║█████╗  \n" +
                "██╔══██╗██║██╔══██╗██║     ██║██║   ██║   ██║   ██╔══██║██║▄▄ ██║██║   ██║██╔══╝  \n" +
                "██████╔╝██║██████╔╝███████╗██║╚██████╔╝   ██║   ██║  ██║╚██████╔╝╚██████╔╝███████╗\n" +
                "╚═════╝ ╚═╝╚═════╝ ╚══════╝╚═╝ ╚═════╝    ╚═╝   ╚═╝  ╚═╝ ╚══▀▀═╝  ╚═════╝ ╚══════╝\n" +
                "                                                                            ");

    }

    /**
     * Connecter
     */
    public void Sign_Up_Design()
    {
        System.out.println("" +
                "███████╗███████╗     ██████╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗ ██████╗████████╗███████╗██████╗ \n" +
                "██╔════╝██╔════╝    ██╔════╝██╔═══██╗████╗  ██║████╗  ██║██╔════╝██╔════╝╚══██╔══╝██╔════╝██╔══██╗\n" +
                "███████╗█████╗      ██║     ██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██║        ██║   █████╗  ██████╔╝\n" +
                "╚════██║██╔══╝      ██║     ██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║        ██║   ██╔══╝  ██╔══██╗\n" +
                "███████║███████╗    ╚██████╗╚██████╔╝██║ ╚████║██║ ╚████║███████╗╚██████╗   ██║   ███████╗██║  ██║\n" +
                "╚══════╝╚══════╝     ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝ ╚═════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝\n" +
                "                                                                                      \n\n\n\n\n\n\n\n");
    }
    /**
     * Créer nouveau compte
     */

       public void Sign_In_Design()
       {
           System.out.println("" +
                   "███╗   ██╗ ██████╗ ██╗   ██╗██╗   ██╗███████╗ █████╗ ██╗   ██╗     ██████╗ ██████╗ ███╗   ███╗██████╗ ████████╗███████╗\n" +
                   "████╗  ██║██╔═══██╗██║   ██║██║   ██║██╔════╝██╔══██╗██║   ██║    ██╔════╝██╔═══██╗████╗ ████║██╔══██╗╚══██╔══╝██╔════╝\n" +
                   "██╔██╗ ██║██║   ██║██║   ██║██║   ██║█████╗  ███████║██║   ██║    ██║     ██║   ██║██╔████╔██║██████╔╝   ██║   █████╗  \n" +
                   "██║╚██╗██║██║   ██║██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██║██║   ██║    ██║     ██║   ██║██║╚██╔╝██║██╔═══╝    ██║   ██╔══╝  \n" +
                   "██║ ╚████║╚██████╔╝╚██████╔╝ ╚████╔╝ ███████╗██║  ██║╚██████╔╝    ╚██████╗╚██████╔╝██║ ╚═╝ ██║██║        ██║   ███████╗\n" +
                   "╚═╝  ╚═══╝ ╚═════╝  ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝ ╚═════╝      ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝        ╚═╝   ╚══════╝\n" +
                   "                                                                                                               \n\n\n\n\n\n\n\n");
       }

    static String role="";

    static boolean loggedIn=false;
    public static void Login(){
        Statement stmt = null;//hadi declaration diyal lquiry diyql SQL
        try {
            // Register JDBC driver
            //Class.forName(JDBC_DRIVER);

            // Open a connection
            Connection conn = DriverManager.getConnection(url, user, pass);

            // Prompt the user for their username and password
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String IdUse = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Execute a query to check if the user exists
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Users WHERE IdUse='" + IdUse + "' AND Pass='" + password + "'";
            ResultSet rs = stmt.executeQuery(sql);

            // If the query returns a result, the user exists and their credentials are valid
            if (rs.next()) {
                role=rs.getString("Rolee");//hadi tchecke lROLE diyal Luser wach Adh wlla Bib
                loggedIn=true;
                System.out.println("Login successful!");

                /*int choice = 0;
                while (choice != 3) {
                    System.out.println("1. Afficher Livre");
                    System.out.println("2. Emprunter Livre");
                    System.out.println("3. Quit");

                    System.out.println("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            // Code to display books
                            break;
                        case 2:
                            // Code to borrow books
                            break;
                        case 3:
                            System.out.println("Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                            break;
                    }
                }*/
            } else {
                System.out.println("Invalid username or password.");
            }

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Logged in as " + role);


        switch (role) {
            case "Adh": //hadi ghadi tkhdm min ykoun luser Adherent
                while (true) {
                    System.out.println("1. Afficher Livre");
                    System.out.println("2. Emprunter Livre");
                    System.out.println("3. exit");
                    Scanner scannerAdh = new Scanner(System.in);
                    int optionAdh = scannerAdh.nextInt();
                    switch (optionAdh) {
                        case 1:
                            System.out.println("Affichage livre");//fblast had SOP ghadi ykouno les methodes
                            break;
                        case 2:
                            System.out.println("Emprantage livre");//fblast had SOP ghadi ykouno les methodes
                            break;
                        case 3:
                            System.out.println("Goodbye!");//hadi khasha trdna login page 3ad T9dr mn tmma tkhrj ga3 Mais Hna ana rani dayrha tkhrj direct
                            System.exit(0);
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                    break;
                }
            case "Bib"://w hadi ghadi tkhdm min ykoun luser biblithecaire
                while (true) {
                    System.out.println("1. Ajouter User");
                    System.out.println("2. Modifier User");
                    System.out.println("3. Supprimer User");
                    System.out.println("4. exit");
                    Scanner scannerBib = new Scanner(System.in);
                    int optionBib = scannerBib.nextInt();
                    switch (optionBib) {
                        case 1:
                            System.out.println("Ajoutage user");//fblast had SOP ghadi ykouno les methodes
                            break;
                        case 2:
                            System.out.println("Modifiage user");//fblast had SOP ghadi ykouno les methodes
                            break;
                        case 3:
                            System.out.println("Suprimagage user");//fblast had SOP ghadi ykouno les methodes
                            break;
                        case 4:
                            System.out.println("Goodbye!");//hadi khasha trdna login page 3ad T9dr mn tmma tkhrj ga3 Mais Hna ana rani dayrha tkhrj direct
                            System.exit(0);
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("Invalid role");

        }
    }
}
