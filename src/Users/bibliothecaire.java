package Users;

public class bibliothecaire extends User {
    private String Role;
     /**
     * Constructeur
     */
    public bibliothecaire() {
        super();
        this.Role="bibliothecaire";
    }
    public bibliothecaire(int Id, String Nom, String Prenom, String Adresse, String Telephone, String Email,String Password, String DateInscription)
    {
        super(Id, Nom, Prenom, Adresse, Telephone, Email,Password, DateInscription);
        this.Role="bibliothecaire";
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
        return "bibliothecaire{" + super.toString() + "Role=" + Role + '}';
    }

    
}
