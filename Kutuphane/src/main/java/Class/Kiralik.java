package Class;
import Interface.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Kiralik implements IKitapIslem , IOrtakIslem {
    public DateFormat bicim = new SimpleDateFormat("dd.MM.yyyy");
    Kitaplar kitap = new Kitaplar();
    Ogrenciler ogrenci = new Ogrenciler();
    DbHelper db = new DbHelper();
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    private String a_tarihi,v_tarihi,ogr_no;
    public DefaultTableModel kirmodel = new DefaultTableModel();
    ///////////////////////////////////////////////////////////////////////////////////
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
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
    public void Kiralik_Ekle(String ISBN,String ogr_no)
    {
     Calendar a_tarihi = Calendar.getInstance(); 
     Calendar v_tarihi = Calendar.getInstance();
     String sql = "INSERT INTO Kiralik(ISBN,k_ad,k_sayfa,k_tur,k_yayinevi,y_ad,a_tarih,v_tarih,ogr_no) VALUES(?,?,?,?,?,?,?,?,?)";
     a_tarihi.setTime(new Date());
     v_tarihi.setTime(new Date());
     v_tarihi.add(Calendar.DATE, 30);
     this.a_tarihi=bicim.format(a_tarihi.getTime());
     this.v_tarihi=bicim.format(v_tarihi.getTime());
      try
     {
        if(kitap.Veri_Kontrol(ISBN)!=1)
             throw new Exception("Aradığınız kitanın ISBN numarası bulunamadı lütfen tekrar deneyin");
        else if(ogrenci.Veri_Kontrol(ogr_no)!=1)
            throw new Exception("Aradığınız Öğrencinin öğrenci numarası bulunamadı lütfen tekrar deneyin");
        else
        {
        kitap.Veri_Cek(ISBN);
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ISBN);
        preparedStatement.setString(2, kitap.getK_ad());
        preparedStatement.setString(3, kitap.getK_sayfa());
        preparedStatement.setString(4, kitap.getK_tur());
        preparedStatement.setString(5, kitap.getK_yayinevi());
        preparedStatement.setString(6, kitap.getK_yazar());
        preparedStatement.setString(7, this.a_tarihi);
        preparedStatement.setString(8, this.v_tarihi);
        preparedStatement.setString(9, ogr_no);
        preparedStatement.executeUpdate();
        kitap.infoBox("Kitap Başarıyla Kiralandı", "UYARI");
        connection.close();
        }
     
     }
     catch(SQLException h)
     {
        h.printStackTrace();
     }
     catch(Exception ozel)
     {
        kitap.infoBox(ozel.getMessage(), "UYARI");
     }
    }

    public void Kiralik_Sil(String ISBN) 
    {
        String sql = "DELETE FROM Kiralik WHERE ISBN=?";
        String sql2 = "INSERT INTO Kitaplar(ISBN,k_ad,k_sayfa,k_tur,k_yayinevi,y_ad) VALUES(?,?,?,?,?,?)";
     try
     {
        Veri_Cek(ISBN);
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ISBN);
        preparedStatement.executeUpdate();
        preparedStatement = connection.prepareStatement(sql2);
        preparedStatement.setString(1, ISBN);
        preparedStatement.setString(2, kitap.getK_ad());
        preparedStatement.setString(3, kitap.getK_sayfa());
        preparedStatement.setString(4, kitap.getK_tur());
        preparedStatement.setString(5, kitap.getK_yayinevi());
        preparedStatement.setString(6, kitap.getK_yazar());
        preparedStatement.executeUpdate();
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
     String sql = "Select * FROM Kiralik";
          try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        Object[] kolonlar ={"ISBN","Kitap Adı","Sayfası","Türü","Yayınevi","Yazarı","Alış Tarihi","Teslim Tarihi"};
        Object[] satirlar = new Object[8];
        kirmodel.setColumnCount(0);
        kirmodel.setRowCount(0);
        kirmodel.setColumnIdentifiers(kolonlar);
         while(resultSet.next())
        {
           satirlar[0]=resultSet.getString("ISBN");
           satirlar[1]=resultSet.getString("k_ad");
           satirlar[2]=resultSet.getString("k_sayfa");
           satirlar[3]=resultSet.getString("k_tur");
           satirlar[4]=resultSet.getString("k_yayinevi");
           satirlar[5]=resultSet.getString("y_ad");
           satirlar[6]=resultSet.getString("a_tarih");
           satirlar[7]=resultSet.getString("v_tarih");
           kirmodel.addRow(satirlar);
        }
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }
    }
       @Override
      public void Veri_Cek(String ISBN) {
          
         String sql = "Select * FROM Kİralik WHERE ISBN=?";
          try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, ISBN);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
           ogrenci.setOgr_no(resultSet.getString("ogr_no"));
           kitap.setK_ad(resultSet.getString("k_ad"));
           kitap.setK_sayfa(resultSet.getString("k_sayfa"));
           kitap.setK_tur(resultSet.getString("k_tur"));
           kitap.setK_yayinevi(resultSet.getString("k_yayinevi"));
           kitap.setK_yazar(resultSet.getString("y_ad"));
           a_tarihi= resultSet.getString("a_tarih");
           v_tarihi=resultSet.getString("v_tarih");
        }
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }     
    }
      public void Kitap_CekA(String kitap_adı) {
          
         String sql = "Select * FROM Kİralik WHERE k_ad=?";
          try
     {
        Connection connection = db.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, kitap_adı);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
           a_tarihi= resultSet.getString("a_tarih");
           v_tarihi=resultSet.getString("v_tarih");
           ogr_no =resultSet.getString("ogr_no");
           ogrenci.setOgr_no(resultSet.getString("ogr_no"));
        }
        connection.close();
     }
     catch(SQLException h)
     {
         h.printStackTrace();
     }     
    }
      
    public String getA_tarihi() {
        return a_tarihi;
    }

    public String getOgr_no() {
        return ogr_no;
    }
    
    public void setA_tarihi(String a_tarihi) {
        this.a_tarihi = a_tarihi;
    }

    public String getV_tarihi() {
        return v_tarihi;
    }

    public void setV_tarihi(String v_tarihi) {
        this.v_tarihi = v_tarihi;
    }

    @Override
    public int Veri_Kontrol(String veri) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
