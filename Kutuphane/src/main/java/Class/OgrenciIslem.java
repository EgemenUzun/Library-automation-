package Class;
import Interface.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public abstract class OgrenciIslem implements IOrtakIslem {
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    DbHelper db = new DbHelper();
     void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
   public int Veri_Kontrol(String veri)
    {
        int kontrol = 0;
        String sql= "SELECT count(ogr_no) from Ogrenciler where ogr_no=? ";
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
    
    public void Ogr_Ekle(String ogr_no,String ogr_ad,String ogr_soyad,String ogr_bolum,String ogr_mail, String ogr_tel)
    {
     String sql = "INSERT INTO Ogrenciler(ogr_no,ogr_ad,ogr_soyad,ogr_bolum,ogr_mail,ogr_tel) VALUES(?,?,?,?,?,?)";
     try
     {
       if(Veri_Kontrol(ogr_no)==0) 
        {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ogr_no);
        preparedStatement.setString(2, ogr_ad);
        preparedStatement.setString(3, ogr_soyad);
        preparedStatement.setString(4, ogr_bolum);
        preparedStatement.setString(5, ogr_mail);
        preparedStatement.setString(6, ogr_tel);
        preparedStatement.executeUpdate();
        infoBox("Öğrenci Başarıyla Eklendi","UYARI");
        connection.close();
        
        }
       else
        {
            infoBox("Bu öğrencinin kayıdı yapılmış","UYARI");
        }
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }  
    }
    
    public void Ogr_Guncelle(String ogr_no,String ogr_ad,String ogr_soyad,String ogr_bolum,String ogr_mail, String ogr_tel)
    {
     String sql = "Update Ogrenciler SET ogr_ad=?,ogr_soyad=?,ogr_bolum=?,ogr_mail=?,ogr_tel=? where ogr_no=?";
     try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(6, ogr_no);
        preparedStatement.setString(1, ogr_ad);
        preparedStatement.setString(2, ogr_soyad);
        preparedStatement.setString(3, ogr_bolum);
        preparedStatement.setString(4, ogr_mail);
        preparedStatement.setString(5, ogr_tel);
        preparedStatement.executeUpdate();
         infoBox("Öğrenci Bilgileri Güncellendi","UYARI");
        connection.close();
     
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
    
    @Override
    public void Veri_Sil(String ogr_no)
    {
        String sql = "DELETE FROM Ogrenciler WHERE ogr_no=?";
     try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ogr_no);
        preparedStatement.executeUpdate();
        infoBox("Öğrenci Silindi","UYARI");
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
     
    }

}
