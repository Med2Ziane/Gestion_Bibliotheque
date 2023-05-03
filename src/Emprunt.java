import java.sql.Connection;
import java.sql.*;

public class Emprunt {

    private int Id;
    private Date DateEmprunt;
    private Date DateRetour;
    private int IdAdherent;
    private int IdLivre;

    public static final String url = "jdbc:mysql://localhost:3306/library";
    public static final String username = "root"; //change the user name and the pass on your device
    public static final String password = "1290MK";


    public Emprunt()
    {
        this.Id=-1;
        this.DateEmprunt=null;
        this.DateRetour=null;
        this.IdAdherent=-1;
        this.IdLivre=-1;
    }
    public Emprunt(int Id, Date DateEmprunt, Date DateRetour, int IdAdherent, int IdLivre)
    {
        this.Id=Id;
        this.DateEmprunt=DateEmprunt;
        this.DateRetour=DateRetour;
        this.IdAdherent=IdAdherent;
        this.IdLivre=IdLivre;
    }
    /**
     * Getters
     */
    public int getId() 
    { return Id;}

    public Date getDateEmprunt()
    { return DateEmprunt;}

    public Date getDateRetour()
    { return DateRetour;}

    public int getIdAdherent()
    { return IdAdherent;}

    public int getIdLivre()
    { return IdLivre;}

    /**
     * Setters
     */
    public void setId(int Id)
    { this.Id=Id;}

    public void setDateEmprunt(Date DateEmprunt)
    { this.DateEmprunt=DateEmprunt;}

    public void setDateRetour(Date DateRetour)
    { this.DateRetour=DateRetour;}

    public void setIdAdherent(int IdAdherent)
    { this.IdAdherent=IdAdherent;}

    public void setIdLivre(int IdLivre)
    { this.IdLivre=IdLivre;}
    /**
     * toString
     */
    @Override
    public String toString()
    {
        return "Emprunt{" + "Id=" + Id + ", DateEmprunt=" + DateEmprunt + ", DateRetour=" + DateRetour + ", IdAdherent=" + IdAdherent + ", IdLivre=" + IdLivre + '}';
    }

    /*public void emprunter(Emprunt emprunt){
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Check if book is available
            String checkSql = "SELECT nbrLivreLibre FROM ouvrage WHERE idLivre = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, emprunt.idLivre);
            ResultSet checkResult = checkStmt.executeQuery();
            if (checkResult.next()) {
                int livreDisponible = checkResult.getInt("nbrLivreLibre");
                if (livreDisponible < 1) {
                    System.out.println("Le livre n'est pas disponible pour l'emprunt.");
                    return;
                }
            } else {
                System.out.println("Le livre n'existe pas dans la base de données.");
                return;
            }

            // Add new emprunt to database
            String sql = "INSERT INTO emprunt (idLivre, idAdherent, dateEmprunt, estRetourne) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, idLivre);
            pstmt.setString(2, idAdherent);
            pstmt.setDate(3, new java.sql.Date(dateEmprunt.getTime()));
            pstmt.setBoolean(4, estRetourne);
            pstmt.executeUpdate();
            System.out.println("L'emprunt a été enregistré avec succès.");

            // Update livre's nbrLivreLibre attribute in database
            String updateSql = "UPDATE ouvrage SET nbrLivreLibre = nbrLivreLibre - 1 WHERE idLivre = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, idLivre);
            updateStmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'emprunt: " + e.getMessage());
        }
    }*/
    
}
