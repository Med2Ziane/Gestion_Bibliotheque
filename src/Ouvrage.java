import java.util.*;
public class Ouvrage {
    private int ISBN;
    private String Titre;
    private Date Datepublication;
    private String Description;//Raha f diagram de class Résumé
    private List<Livre> Livres;//Hadi ghadi tkoun List dial Livres li 3endhom nfs Ouvrage

     /**
     * Constructeur
     */
    public Ouvrage(int ISBN, String Titre, Date Datepublication, String Description, List<Livre> Livres)
    {
        this.ISBN = ISBN;
        this.Titre = Titre;
        this.Datepublication = Datepublication;
        this.Description = Description;
        this.Livres = Livres;
    }
    public Ouvrage()
    {
        this.ISBN = 0;
        this.Titre = null;
        this.Datepublication = null;
        this.Description = null;
        this.Livres = null;
    }
    /**
     * Getters
     */
    public int getISBN()
    {return ISBN; }

    public String getTitre()
    {return Titre; }

    public Date getDatepublication()
    {return Datepublication; }

    public String getDescription()
    {return Description; }

    public List<Livre> getLivres()
    {return Livres; }

    /**
     * Setters
     */
    public void setISBN(int ISBN)
    {this.ISBN = ISBN;}

    public void setTitre(String Titre)
    {this.Titre = Titre;}

    public void setDatepublication(Date Datepublication)
    {this.Datepublication = Datepublication;}

    public void setDescription(String Description)
    {this.Description = Description;}

    public void setLivres(List<Livre> Livres)
    {this.Livres = Livres;}
    /**
     * toString
     */

    public String toString()
    {
        return "Ouvrage{" +
                "ISBN=" + ISBN +
                ", Titre='" + Titre + '\'' +
                ", Datepublication=" + Datepublication +
                ", Description='" + Description + '\'' +
                ", Livres=" + Livres +
                '}';
    }


}
