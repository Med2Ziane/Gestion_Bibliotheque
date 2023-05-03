import java.util.*;
public class Livre {
    private int Id;
    private Boolean Statut;
     /**
     * Constructeur
     */
    public Livre(int Id, boolean Statut)
    {
        this.Id = Id;
        this.Statut = Statut;
    }
    public Livre()
    {
        this.Id = -1;
        this.Statut = false;
    }
    /**
     * Getters
     */
    public int getId()
    { return Id;}

    public boolean getStatu()
    { return Statut; }
    /**
     * Setters
     */
    public void setId(int Id)
    { this.Id = Id;}

    public void setStatut(boolean Statut)
    { this.Statut = Statut; }
     /**
     * @toString Affichage
     */
    public String toString()
    {
        return "Liver{id=" + Id + ",Statut=" + Statut+"}";
    }
}
