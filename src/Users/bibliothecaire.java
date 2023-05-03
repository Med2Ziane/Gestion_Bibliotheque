package Users;

import java.sql.*;

public class bibliothecaire extends User {
    private String Role;
     /**
     * Constructeur
     */
    public bibliothecaire() throws SQLException {
        super();
        this.Role="bibliothecaire";
    }
    public bibliothecaire(String Id, String Nom, String Prenom, String Adresse, String Telephone, String Email,String Password, String DateInscription) throws SQLException {
        super(Id, Nom, Prenom, Adresse, Telephone, Email,Password, DateInscription);
        this.Role="bibliothecaire";
    }
    /**
     * Get
     */
    public String getRole(String role) {
        return Role;
    }
    public String getRole() {
        return Role;
    }
    /**
     * Set
     */
    public void setRole(String Role) {
        this.Role = Role;
    }
    @Override
    public String toString() {
        return "bibliothecaire{" + super.toString() + "Role=" + Role + '}';
    }

    public void findById(bibliothecaire bib) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Users WHERE IdUse = ?")) {
            stmt.setString(1, bib.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    bib.setNom(rs.getString("Nom"));
                    bib.setPrenom(rs.getString("Prenom"));
                    System.out.println("Author found: " + bib.getId() + " - " + bib.getNom() +" - " + bib.getPrenom());
                } else {
                    System.out.println("Author not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*****************/


    
}
