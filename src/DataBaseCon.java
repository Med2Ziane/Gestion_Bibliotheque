import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DataBaseCon {
    public static final String url = "jdbc:mysql://localhost:3306/library";
    public static final String username = "root"; //change the user name and the pass on your device
    public static final String password = "";

    /**
     *
     */
    public DataBaseCon()throws SQLException{

    }

    /**
     * 
     */
    public void OpenConnection()
    {
       try 
       {
         java.sql.Connection con= DriverManager.getConnection(url,username,password);  
         
       } catch (SQLException ex) {
        // TODO: handle exception
           System.out.println("Connection failed: " + ex.getMessage());
       }
    }
    
}
