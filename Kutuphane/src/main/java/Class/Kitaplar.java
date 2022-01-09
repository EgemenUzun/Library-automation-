
package Class;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Kitaplar extends KitapIslem  {

    private String ISBN;
    private String k_ad;
    private String k_sayfa;
    private String k_tur;
    private String k_yayinevi;
    Yazarlar yazar = new Yazarlar();
   
   @Override
    public void Veri_Cek(String ISBN) {
         String sql = "Select * FROM Kitaplar WHERE ISBN=?";
          try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ISBN);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
           k_ad=resultSet.getString("k_ad");
           k_sayfa=resultSet.getString("k_sayfa");
           k_tur=resultSet.getString("k_tur");
           k_yayinevi=resultSet.getString("k_yayinevi");
           yazar.setK_yazar(resultSet.getString("y_ad"));
        }
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
          
    }
    
    @Override
    public void Kitap_Cek()
    {
     String sql = "Select * FROM Kitaplar";
          try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        
        Object[] kolonlar ={"ISBN","Kitap Adı","Sayfası","Türü","Yayınevi","Yazarı"};
        Object[] satirlar = new Object[6];
        kitmodel.setColumnCount(0);
        kitmodel.setRowCount(0);
        kitmodel.setColumnIdentifiers(kolonlar);
         while(resultSet.next())
        {
           satirlar[0]=resultSet.getString("ISBN");
           satirlar[1]=resultSet.getString("k_ad");
           satirlar[2]=resultSet.getString("k_sayfa");
           satirlar[3]=resultSet.getString("k_tur");
           satirlar[4]=resultSet.getString("k_yayinevi");
           satirlar[5]=resultSet.getString("y_ad");
           kitmodel.addRow(satirlar);
        }
        
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getK_ad() {
        return k_ad;
    }

    public void setK_ad(String k_ad) {
        this.k_ad = k_ad;
    }

    public String getK_sayfa() {
        return k_sayfa;
    }

    public void setK_sayfa(String k_sayfa) {
        this.k_sayfa = k_sayfa;
    }

    public String getK_tur() {
        return k_tur;
    }

    public void setK_tur(String k_tur) {
        this.k_tur = k_tur;
    }

    public String getK_yayinevi() {
        return k_yayinevi;
    }

    public void setK_yayinevi(String k_yayinevi) {
        this.k_yayinevi = k_yayinevi;
    }
    public void setK_yazar(String k_yazar)
    {
      yazar.setK_yazar(k_yazar);
    }
     public String getK_yazar() {
        return yazar.getK_yazar();
    }
    
     
}
