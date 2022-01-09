
package Class;
import Interface.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public abstract class KitapIslem implements IKitapIslem ,IOrtakIslem {
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    DbHelper db = new DbHelper();
    public DefaultTableModel kitmodel = new DefaultTableModel();
    public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public int Veri_Kontrol(String veri)
    {
        int kontrol = 0;
        String sql= "SELECT count(ISBN) from Kitaplar where ISBN=?";
        try
        {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, veri);
        resultSet = preparedStatement.executeQuery();
        resultSet.next();
        kontrol =resultSet.getInt(1);
        }
        catch(SQLException h)
     {
         h.printStackTrace();
     }
        return kontrol;
    }
    public void Kitap_Ekle(String ISBN,String k_adı,String k_sayfa,String k_tur,String k_yayinevi,String k_yazar)
    {
     String sql = "INSERT INTO Kitaplar(ISBN,k_ad,k_sayfa,k_tur,k_yayinevi,y_ad) VALUES(?,?,?,?,?,?)";
     
     try
     {
        if(Veri_Kontrol(ISBN)==0)
        {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ISBN);
        preparedStatement.setString(2, k_adı);
        preparedStatement.setString(3, k_sayfa);
        preparedStatement.setString(4, k_tur);
        preparedStatement.setString(5, k_yayinevi);
        preparedStatement.setString(6, k_yazar);
        preparedStatement.executeUpdate();
        infoBox("Kitap Başarıyla Eklendi","UYARI");
        connection.close();
        }
        else
        {
            infoBox("Bu kitapın kayıdı yapılmış","UYARI");
        }
     
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
    
    public void Kitap_Guncelle(String ISBN,String k_adı,String k_sayfa,String k_tur,String k_yayinevi,String k_yazar)
    {
     String sql = "Update Kitaplar SET k_ad=?,k_sayfa=?,k_tur=?,k_yayinevi=?, y_ad=? where ISBN=?";

     try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(6, ISBN);
        preparedStatement.setString(1, k_adı);
        preparedStatement.setString(2, k_sayfa);
        preparedStatement.setString(3, k_tur);
        preparedStatement.setString(4, k_yayinevi);
        preparedStatement.setString(5, k_yazar);
        preparedStatement.executeUpdate();
        infoBox("Kitap Başarıyla Güncellendi","UYARI");
        connection.close();
     
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
    
    @Override
    public void Veri_Sil(String ISBN)
    {
      String sql = "DELETE FROM Kitaplar WHERE ISBN=?";
     try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ISBN);
        preparedStatement.executeUpdate();
        infoBox("Kitap Başarıyla Silindi","UYARI");
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
}
 
  