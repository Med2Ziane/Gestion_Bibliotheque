package Users;

public class Adherent extends User {
    private String Role;
     /**
     * Constructeur
     */
    public Adherent() {
        super();
        this.Role="Adherent";
    }
    public Adherent(int Id, String Nom, String Prenom, String Adresse, String Telephone, String Email,String Password, String DateInscription)
    {
        super(Id, Nom, Prenom, Adresse, Telephone, Email,Password, DateInscription);
        this.Role="Adherent";
    }
    /**
     * Get
     */
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
        return "Adherent{" + super.toString() + "Role=" + Role + '}';
    }

    
}
