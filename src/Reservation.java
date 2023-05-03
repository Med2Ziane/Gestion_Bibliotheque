import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Reservation {
    /**
     * khsna darouri IdAtherent w IdOuvrage 3lach zethom
     */
    private int Id;
    private Date DateReservation;
    private int IdAdherent;
    private int IdOuvrage;//+idlivre


    /**
     * Constructeur
     */
    public Reservation()
    {
        this.Id=-1;
        this.DateReservation=null;
        this.IdAdherent=-1;
        this.IdOuvrage=-1;
    }
    public Reservation(int Id, Date DateReservation,int IdAdherent,int IdOuvrage)
    {
        this.Id=Id;
        this.DateReservation=DateReservation;
        this.IdAdherent=IdAdherent;
        this.IdOuvrage=IdOuvrage;
    }
    /**
     * Getters
     */
    public int getId() 
    {return Id; }

    public Date getDateReservation()
    {return DateReservation;}

    public int getIdAdherent()
    {return IdAdherent;}

    public int getIdOuvrage()
    {return IdOuvrage;}

    /**
     * Setters
     */
    public void setId(int Id)
    {this.Id=Id;}

    public void setDateReservation(Date DateReservation)
    {this.DateReservation=DateReservation;}

    public void setIdAdherent(int IdAdherent)
    {this.IdAdherent=IdAdherent;}

    public void setIdOuvrage(int IdOuvrage)
    {this.IdOuvrage=IdOuvrage;}
    @Override
    public String toString() {
        return "Reservation{" + "Id=" + Id + ", DateReservation=" + DateReservation + ", IdAdherent=" + IdAdherent + ", IdOuvrage=" + IdOuvrage + '}';
    }



    
}
