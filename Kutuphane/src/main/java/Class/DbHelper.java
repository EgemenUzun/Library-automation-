
package Class;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbHelper {
   static String url = "jdbc:sqlserver://DESKTOP-Q5Q3B43:1433;databaseName=Kutuphane";
   static String id="egemen";
   static String password ="egemen12";
   public Connection getConnection() throws SQLException
   {
     return (Connection) DriverManager.getConnection(url, id, password);
   }
   public void ShowError(SQLException e)
   {
       JOptionPane.showMessageDialog(null,e.getMessage()+"|"+e.getErrorCode());
   }
}
