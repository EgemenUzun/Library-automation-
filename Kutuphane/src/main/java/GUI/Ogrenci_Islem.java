/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Class.OgrenciIslem;
import Class.Ogrenciler;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Ogrenci_Islem extends javax.swing.JPanel {

   Ogrenciler ogr= new Ogrenciler();
    public Ogrenci_Islem() {
        initComponents();
        ogr_no.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ogr.Veri_Cek(ogr_no.getText());
                ogr_ad.setText(ogr.getOgr_ad());
                ogr_soyad.setText(ogr.getOgr_soyad());
                ogr_bolum.setText(ogr.getOgr_bolum());
                ogr_mail.setText(ogr.getOgr_mail());
                ogr_tel.setText(ogr.getOgr_tel());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ogr.Veri_Cek(ogr_no.getText());
                ogr_ad.setText(ogr.getOgr_ad());
                ogr_soyad.setText(ogr.getOgr_soyad());
                ogr_bolum.setText(ogr.getOgr_bolum());
                ogr_mail.setText(ogr.getOgr_mail());
                ogr_tel.setText(ogr.getOgr_tel());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ogr.Veri_Cek(ogr_no.getText());
                ogr_ad.setText(ogr.getOgr_ad());
                ogr_soyad.setText(ogr.getOgr_soyad());
                ogr_bolum.setText(ogr.getOgr_bolum());
                ogr_mail.setText(ogr.getOgr_mail());
                ogr_tel.setText(ogr.getOgr_tel());
            }
        });
                
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ogr_bolum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ogr_mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ogr_tel = new javax.swing.JTextField();
        ogr_no = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_kaydet = new javax.swing.JButton();
        ogr_ad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ogr_soyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_sil = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(739, 555));

        jLabel4.setText("Öğrencinin Bölümü ");

        jLabel5.setText("Öğrencinin Epostası ");

        jLabel6.setText("Öğrencinin Telefonu ");

        jLabel1.setText("Öğrencinin No ");

        btn_kaydet.setText("Kaydet");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        jLabel2.setText("Öğrencinin Adı ");

        jLabel3.setText("Öğrencinin Soyadı");

        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ogr_bolum, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                                    .addComponent(ogr_mail)
                                    .addComponent(ogr_tel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ogr_soyad)
                                    .addComponent(ogr_no)
                                    .addComponent(ogr_ad))))
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_kaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogr_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogr_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogr_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogr_bolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogr_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogr_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kaydet)
                    .addComponent(btn_sil))
                .addContainerGap(347, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        
        try
        {
        ogr.setOgr_no(ogr_no.getText().toUpperCase());
        ogr.setOgr_ad(ogr_ad.getText().toUpperCase());
        ogr.setOgr_soyad(ogr_soyad.getText().toUpperCase());
        ogr.setOgr_bolum(ogr_bolum.getText().toUpperCase());
        ogr.setOgr_mail(ogr_mail.getText());
        ogr.setOgr_tel(ogr_tel.getText().toUpperCase());
        if(ogr_no.getText().equals("")||ogr_ad.getText().equals("")||ogr_soyad.getText().equals("")||ogr_bolum.getText().equals("")||ogr_mail.getText().equals("")||ogr_tel.getText().equals(""))
        {
            throw new Exception("Boşdeğer Giremzsiniz");
        }
        else if(ogr_tel.getDocument().getLength()!=11)
            throw new Exception("Telefon numaranız 11 karakter den az veya fazla olamaz");
        
        else if(ogr_no.getDocument().getLength()>9)
            throw new Exception("Okul numaranız 9 karakter den büyük olamaz");
        
        else if(ogr_bolum.getDocument().getLength()>50)
            throw new Exception("Bölümünüz 50 karakter den büyük olamaz");
                
        else
        {
        ogr.Ogr_Guncelle(ogr.getOgr_no(), ogr.getOgr_ad(), ogr.getOgr_soyad(), ogr.getOgr_bolum(), ogr.getOgr_mail(), ogr.getOgr_tel());
        }
        
        }
        catch(Exception h)
        {
            JOptionPane.showMessageDialog(null,h.getMessage());
        }
        
    }//GEN-LAST:event_btn_kaydetActionPerformed
     
    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        ogr.Veri_Sil(ogr_no.getText());
        
    }//GEN-LAST:event_btn_silActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JToggleButton btn_sil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ogr_ad;
    private javax.swing.JTextField ogr_bolum;
    private javax.swing.JTextField ogr_mail;
    private javax.swing.JTextField ogr_no;
    private javax.swing.JTextField ogr_soyad;
    private javax.swing.JTextField ogr_tel;
    // End of variables declaration//GEN-END:variables
}
