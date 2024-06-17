import java.sql.*;
import javax.swing.JOptionPane;
public class dbconnect {
    Connection conn = null;
/* In this section please change the path to connect to the database.
*/
    public static Connection connectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.sqlite");
            
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
