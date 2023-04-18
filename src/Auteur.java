public class Auteur {
    private int id;
    private String nom;

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
    
}
