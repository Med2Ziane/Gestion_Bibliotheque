import java.sql.Date;

public class Emprunt {

    private int Id;
    private Date DateEmprunt;
    private Date DateRetour;
    private int IdAdherent;
    private int IdLivre;

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

    
}
