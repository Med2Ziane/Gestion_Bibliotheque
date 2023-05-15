package Users;
/**
 * Adherent
 */
import java.sql.*;
import java.util.Scanner;

public abstract class User  {

    private String Id;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Telephone;
    private String Email;
    private String Password;// *******************************************//
    private String DateInscription;

    /**********  connection with MySql  **********/

    public static final String url = "jdbc:mysql://localhost:3306/library";
    public static final String username = "root"; //change the user name and the pass on your device
    public static final String password = "";
    Connection conn = DriverManager.getConnection(url, username, password);

    /**
     * Constructeur
     */
    public User() throws SQLException {
        this.Id = null;
        this.Nom = null;
        this.Prenom = null;
        this.Adresse = null;
        this.Telephone = null;
        this.Email = null;
        this.Password = null;
        this.DateInscription = null;
    }
    public User(String Id, String Nom, String Prenom, String Adresse, String Telephone, String Email,String Password, String DateInscription) throws SQLException {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Telephone = Telephone;
        this.Email = Email;
        this.Password = Password;
        this.DateInscription = DateInscription;
    }
    // Getters
    public String getId()
    { return Id;}

    public String getNom()
    { return Nom;}

    public String getPrenom()
    { return Prenom;}

    public String getAdresse()
    { return Adresse;}

    public String getTelephone()
    { return Telephone;}

    public String getEmail()
    { return Email;}

    public String getPassword()
    { return Password;}

    public String getDateInscription()
    { return DateInscription;}

    // Setters
    public void setId(String Id)
    { this.Id = Id;}

    public void setNom(String Nom)
    { this.Nom = Nom;}

    public void setPrenom(String Prenom)
    { this.Prenom = Prenom;}

    public void setAdresse(String Adresse)
    { this.Adresse = Adresse;}

    public void setTelephone(String Telephone)
    { this.Telephone = Telephone;}

    public void setEmail(String Email)
    { this.Email = Email;}

    public void setPassword(String Password)
    { this.Password = Password;}

    public void setDateInscription(String DateInscription)
    { this.DateInscription = DateInscription;}
    /**
     * @toString Affichage
     */
    public String toString()
    {
        return "User{ Id: " + this.Id+"\nNom: " + this.Nom+"\nPrenom: "
                + this.Prenom+"\nAdresse: "+ this.Adresse+"\nTelephone: "
                + this.Telephone+"\nEmail: " + this.Email+"\nPassword:"+Password+ "\nDateInscription:"+this.DateInscription+"}";
    }

    /********* ajoute modifier supprimer chercher **********/

    public void ajouterAdh(bibliothecaire bib) {//hadi majal makhddama
        // Establish database connection
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String sql = "insert into Users (IdUse,Nom,Prenom,Adresse,Telephone,Email,Pass,DateInscription,Rolee) value(?, ?, ?, ?, ?, ?, ?, ?, \"Adh\")";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, bib.getId());
            pstmt.setString(2, bib.getNom());
            pstmt.setString(3, bib.getPrenom());
            pstmt.setString(4, bib.getAdresse());
            pstmt.setString(5, bib.getTelephone());
            pstmt.setString(6, bib.getEmail());
            pstmt.setString(7, bib.getPassword());
            pstmt.setString(8, bib.getDateInscription());
            pstmt.setString(9, bib.getRole());


            pstmt.executeUpdate();
            System.out.println("User ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de l'auteur: " + e.getMessage());
        }
    }
    public void modifier(User user){
        try  (Connection conn = DriverManager.getConnection(url, username, password)){
            // prepare the SQL statement to update the author's name
            PreparedStatement statement = conn.prepareStatement("update Users set Nom= ?, Prenom= ?, Adresse= ?, Telephone=? ,Email=? ,Pass=? ,DateInscription=? where IdUse=?");
            statement.setString(1, user.getNom());
            statement.setString(2, user.getPrenom());
            statement.setString(3, user.getAdresse());
            statement.setString(4, user.getTelephone());
            statement.setString(5, user.getEmail());
            statement.setString(6, user.getPassword());
            statement.setString(7, user.getDateInscription());
            statement.setString(8, user.getId());


            // execute the update statement
            statement.executeUpdate();
            System.out.println("User Change avec succès !");
        } catch (SQLException e) {
            System.err.println("Error updating author: " + e.getMessage());
        }
    }
    public void findById(User user) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Users WHERE IdUse = ?")) {
            stmt.setString(1, user.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    user.setNom(rs.getString("Nom"));
                    user.setPrenom(rs.getString("Prenom"));
                    System.out.println("Author found: " + user.getId() + " - " + user.getNom() +" - " + user.getPrenom());
                } else {
                    System.out.println("Author not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /*********************************/

    public static void findusers() throws SQLException {
        System.out.print("Enter a search term: ");
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.next();



        // Execute a SQL query to search for books matching the search term

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Users WHERE IdUse LIKE ? OR Nom LIKE ?")) {
            //String stmt = "SELECT * FROM Users WHERE IdUse LIKE ? OR Nom LIKE ?";

            //conn = Database.getConnection();
            stmt.setString(1, searchTerm);
            stmt.setString(2, searchTerm);
            ResultSet rs = stmt.executeQuery();

            // Print out the search results
            System.out.println("\nSearch results:");
            System.out.println("***************");
            while (rs.next()) {
                System.out.println("User found:");
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                //System.out.println(IdUse + "\t" + Nom + "\t" + Prenom + "\t");
            }
        }
    }


}