
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Ogrenciler extends OgrenciIslem{
    private String ogr_no;
    private String ogr_ad;
    private String ogr_soyad;
    private String ogr_bolum;  
    private String ogr_mail;
    private String ogr_tel;
    
    @Override
    public void Veri_Cek(String ogr_no) {
         String sql = "Select * FROM Ogrenciler WHERE ogr_no=?";
          try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ogr_no);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
           ogr_ad=resultSet.getString("ogr_ad");
           ogr_soyad=resultSet.getString("ogr_soyad");
           ogr_bolum=resultSet.getString("ogr_bolum");
           ogr_mail=resultSet.getString("ogr_mail");
           ogr_tel=resultSet.getString("ogr_tel");
        }
        connection.close();
     }
     catch(SQLException h)
     {
         //null pointer durumu dönebilir ama bildirimi istenmemektedir
     }
    }
    

    public String getOgr_soyad() {
        return ogr_soyad;
    }

    public void setOgr_soyad(String ogr_soyad) {
        this.ogr_soyad = ogr_soyad;
    }

    public String getOgr_no() {
        return ogr_no;
    }

    public void setOgr_no(String ogr_no) {
        this.ogr_no = ogr_no;
    }

    public String getOgr_ad() {
        return ogr_ad;
    }

    public void setOgr_ad(String ogr_ad) {
        this.ogr_ad = ogr_ad;
    }

    public String getOgr_bolum() {
        return ogr_bolum;
    }

    public void setOgr_bolum(String ogr_bolum) {
        this.ogr_bolum = ogr_bolum;
    }

    public String getOgr_mail() {
        return ogr_mail;
    }

    public void setOgr_mail(String ogr_mail) {
        this.ogr_mail = ogr_mail;
    }

    public String getOgr_tel() {
        return ogr_tel;
    }

    public void setOgr_tel(String ogr_tel) {
        this.ogr_tel = ogr_tel;
    }
    
}
