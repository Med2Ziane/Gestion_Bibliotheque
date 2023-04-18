import java.util.*;
public class Livre {
    private int Id;
    private String Statut;
     /**
     * Constructeur
     */
    public Livre(int Id, String Statut) 
    {
        this.Id = Id;
        this.Statut = Statut;
    }
    public Livre()
    {
        this.Id = -1;
        this.Statut = null;
    }
    /**
     * Getters
     */
    public int getId()
    { return Id;}

    public String getStatu()
    { return Statut; }
    /**
     * Setters
     */
    public void setId(int Id)
    { this.Id = Id;}

    public void setStatut(String Statut)
    { this.Statut = Statut; }
     /**
     * @toString Affichage
     */
    public String toString()
    {
        return "Liver{id=" + Id + ",Statut=" + Statut+"}";
    }
}
