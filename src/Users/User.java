package Users;
/**
 * Adherent
 */
import java.util.*;
public abstract class User  {

    private int Id;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Telephone;
    private String Email;
    private String Password;// *******************************************//
    private String DateInscription;
    /**
     * Constructeur
     */
    public User()
    {
        this.Id = -1;
        this.Nom = null;
        this.Prenom = null;
        this.Adresse = null;
        this.Telephone = null;
        this.Email = null;
        this.Password = null;
        this.DateInscription = null;
    }
    public User(int Id, String Nom, String Prenom, String Adresse, String Telephone, String Email,String Password, String DateInscription)
    {
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
    public int getId()
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
    public void setId(int Id)
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




}