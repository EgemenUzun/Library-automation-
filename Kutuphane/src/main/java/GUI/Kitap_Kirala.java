package GUI;
import Class.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
public class Kitap_Kirala extends javax.swing.JPanel {
    
    Kiralik kirala = new Kiralik();
    Kitaplar kitap = new Kitaplar();
    int kitap_count,kiralik_count;
    public Kitap_Kirala() {
        initComponents();
        kitap.Kitap_Cek();
        kirala.Kitap_Cek();
        tb_kitap.setModel(kitap.kitmodel);
        kitap_count=kitap.kitmodel.getRowCount();
        tb_kiralik.setModel(kirala.kirmodel);
        kiralik_count=kirala.kirmodel.getRowCount();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                kitap.Kitap_Cek();
                kirala.Kitap_Cek();
                if(kitap_count!=kitap.kitmodel.getRowCount())
                {
                tb_kitap.setModel(kitap.kitmodel);
                kitap_count=kitap.kitmodel.getRowCount();
                }
                if(kiralik_count!=kirala.kirmodel.getRowCount())
                {
                 tb_kiralik.setModel(kirala.kirmodel);
                 kiralik_count=kirala.kirmodel.getRowCount();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_ogr_ara = new javax.swing.JTextField();
        tb_kitap_ara = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_kirala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_kitap = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_kiralik = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_iade = new javax.swing.JButton();

        jLabel1.setText("Öğrenci No");

        jLabel2.setText("Kitap ISBN");

        btn_kirala.setText("Kirala");
        btn_kirala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kiralaActionPerformed(evt);
            }
        });

        tb_kitap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Kitap adı", "Sayfa sayısı", "Türü", "Yayınevi", "Yazar adı"
            }
        ));
        jScrollPane1.setViewportView(tb_kitap);

        tb_kiralik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Kitap adı", "Sayfa sayısı", "Türü", "Yayınevi", "Yazar adı", "Alış tarihi", "Teslim Tarihi"
            }
        ));
        jScrollPane2.setViewportView(tb_kiralik);

        jLabel3.setText("Kitaplar Listesi");

        jLabel4.setText("Kiralık Listesi");

        btn_iade.setText("İade Et");
        btn_iade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iadeActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(tb_ogr_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tb_kitap_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btn_kirala)
                        .addGap(71, 71, 71)
                        .addComponent(btn_iade)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tb_ogr_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tb_kitap_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kirala)
                    .addComponent(btn_iade))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        
    private void btn_kiralaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kiralaActionPerformed
       kirala.Kiralik_Ekle(tb_kitap_ara.getText(), tb_ogr_ara.getText());
       kirala.Veri_Sil(tb_kitap_ara.getText());
    }//GEN-LAST:event_btn_kiralaActionPerformed

    private void btn_iadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iadeActionPerformed
        kirala.Kiralik_Sil(tb_kitap_ara.getText());
    }//GEN-LAST:event_btn_iadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iade;
    private javax.swing.JButton btn_kirala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_kiralik;
    private javax.swing.JTable tb_kitap;
    private javax.swing.JTextField tb_kitap_ara;
    private javax.swing.JTextField tb_ogr_ara;
    // End of variables declaration//GEN-END:variables
}
