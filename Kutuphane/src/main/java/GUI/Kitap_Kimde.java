/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Class.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class Kitap_Kimde extends javax.swing.JPanel {

    Kiralik kirala = new Kiralik();
    Ogrenciler ogrenci = new Ogrenciler();
    public Kitap_Kimde() {
        initComponents();
        tb_kitap.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                kirala.Kitap_CekA(tb_kitap.getText());
                ogrenci.Veri_Cek(kirala.getOgr_no());
                tb_ogr_ad.setText(ogrenci.getOgr_ad());
                tb_ogr_soyad.setText(ogrenci.getOgr_soyad());
                tb_ogr_bolum.setText(ogrenci.getOgr_bolum());
                tb_ogr_tel.setText(ogrenci.getOgr_tel());
                tb_ogr_mail.setText(ogrenci.getOgr_mail());
                tb_a_tarihi.setText(kirala.getA_tarihi());
                tb_v_tarihi.setText(kirala.getV_tarihi());
                ogrenci.getOgr_no();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                kirala.Kitap_CekA(tb_kitap.getText());
                ogrenci.Veri_Cek(ogrenci.getOgr_no());
                tb_ogr_ad.setText(ogrenci.getOgr_ad());
                tb_ogr_soyad.setText(ogrenci.getOgr_soyad());
                tb_ogr_bolum.setText(ogrenci.getOgr_bolum());
                tb_ogr_tel.setText(ogrenci.getOgr_tel());
                tb_ogr_mail.setText(ogrenci.getOgr_mail());
                tb_a_tarihi.setText(kirala.getA_tarihi());
                tb_v_tarihi.setText(kirala.getV_tarihi());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                kirala.Kitap_CekA(tb_kitap.getText());
                ogrenci.Veri_Cek(ogrenci.getOgr_no());
                tb_ogr_ad.setText(ogrenci.getOgr_ad());
                tb_ogr_soyad.setText(ogrenci.getOgr_soyad());
                tb_ogr_bolum.setText(ogrenci.getOgr_bolum());
                tb_ogr_tel.setText(ogrenci.getOgr_tel());
                tb_ogr_mail.setText(ogrenci.getOgr_mail());
                tb_a_tarihi.setText(kirala.getA_tarihi());
                tb_v_tarihi.setText(kirala.getV_tarihi());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tb_kitap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tb_ogr_ad = new javax.swing.JTextField();
        tb_ogr_soyad = new javax.swing.JTextField();
        tb_ogr_tel = new javax.swing.JTextField();
        tb_ogr_bolum = new javax.swing.JTextField();
        tb_ogr_mail = new javax.swing.JTextField();
        tb_a_tarihi = new javax.swing.JTextField();
        tb_v_tarihi = new javax.swing.JTextField();

        jLabel1.setText("Kitap Adı");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Kiralık Bilgisi");

        jLabel3.setText("Öğrenci Adı");

        jLabel4.setText("Öğrenci Soyadı");

        jLabel5.setText("Öğrenci Bölümü");

        jLabel6.setText("Öğrenci Tel");

        jLabel7.setText("Öğrenci Mail");

        jLabel8.setText("Alış Tarihi");

        jLabel9.setText("Teslim Tarihi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tb_v_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_a_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_ogr_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_ogr_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_ogr_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_kitap, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_ogr_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_ogr_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tb_kitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tb_ogr_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tb_ogr_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tb_ogr_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tb_ogr_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_ogr_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tb_a_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tb_v_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tb_a_tarihi;
    private javax.swing.JTextField tb_kitap;
    private javax.swing.JTextField tb_ogr_ad;
    private javax.swing.JTextField tb_ogr_bolum;
    private javax.swing.JTextField tb_ogr_mail;
    private javax.swing.JTextField tb_ogr_soyad;
    private javax.swing.JTextField tb_ogr_tel;
    private javax.swing.JTextField tb_v_tarihi;
    // End of variables declaration//GEN-END:variables
}
