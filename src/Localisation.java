public class Localisation {
    private int IdLivre;
    private int Rayon;
    private int Etagere;

     /**
     * Constructeur
     */
    public Localisation()
    {
        this.IdLivre = -1;
        this.Rayon = -1;
        this.Etagere = -1;
    }
    public Localisation(int IdLivre, int Rayon, int Etagere) {
        this.IdLivre = IdLivre;
        this.Rayon = Rayon;
        this.Etagere = Etagere;
    }
    /**
     * Getters
     */
    public int getIdLivre() 
    {return IdLivre; }

    public int getRayon()
    {return Rayon; }

    public int getEtagere()
    {return Etagere; }
    /**
     * Setters
     */
    public void setIdLivre(int IdLivre)
    {this.IdLivre = IdLivre; }

    public void setRayon(int Rayon)
    {this.Rayon = Rayon; }

    public void setEtagere(int Etagere)
    {this.Etagere = Etagere; }

    /**
     * toString
     */
    @Override
    public String toString()
    {
        return "Localisation{" + "IdLivre=" + IdLivre + ", Rayon=" + Rayon + ", Etagere=" + Etagere + '}';
    }
    
}
