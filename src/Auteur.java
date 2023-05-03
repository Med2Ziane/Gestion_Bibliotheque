import Users.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Auteur {
    private int id;
    private String nom;


    public static final String url = "jdbc:mysql://localhost:3306/library";
    public static final String username = "root"; //change the user name and the pass on your device
    public static final String password = "1290MK";

     /**
     * Constructeur
     */
    public Auteur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Auteur()
    {
        this.id=-1;
        this.nom=null;
    }
    /*
     * Getters
     */
    public int getId()
    {return id;}

    public String getNom()
    {return nom;}
    /*
     * Setters
     */
    public void setId(int id)
    {this.id = id;}

    public void setNom(String nom)
    {this.nom = nom;}
    /**
     * toString
     */
    public String toString()
    {
        return"Ateur{id:"+id+",nom:"+nom+"}";
    }


    /*********************/

    public void ajouter(Auteur auteur) {
        // Establish database connection
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String sql = "insert into auteur(IdAut,nom) value(?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, auteur.getId());
            pstmt.setString(2, auteur.getNom());


            pstmt.executeUpdate();
            System.out.println("User ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de l'auteur: " + e.getMessage());
        }
    }
    
}
