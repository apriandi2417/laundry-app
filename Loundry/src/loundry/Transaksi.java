package loundry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
 /*
 * @author Apriandi
 */
public class Transaksi extends javax.swing.JFrame {
    DefaultTableModel model;
    
    private String Id_transaksi, Id_member, Parfum, Jenis ;
    private int Berat, Total, Bayar, Kembali;
    public Transaksi() {
        initComponents();
        //membuat tabel model
        model = (DefaultTableModel) jTable1.getModel();
        
        //menambahkan  TableModel ke jtable
        jTable1.setModel(model);
        
        //melakukan load data dari database
        loadData();
    }
    
    public void loadData(){
        try {
            //membuat koneksi
            Connection conn = KoneksiDB.getKoneksi();
            Statement s = conn.createStatement();
            
            //membuat query SELECT
            String sql = "SELECT * FROM transaksi";
            ResultSet r = s.executeQuery(sql);
            
            //membaca data didalam database baris per baris
            while (r.next()) {
                //membuat object 'obj' untuk menampung data yang dibaca dari DB
                Object[] obj = new Object[8];
                obj[0]= r.getInt("id_transaksi");
                obj[1]= r.getString("id_member");
                obj[2]= r.getInt("berat");
                obj[3]= r.getString("parfum");
                obj[4]= r.getString("jenis");
                obj[5]= r.getInt("total");
                obj[6]= r.getInt("bayar");
                obj[7]= r.getInt("kembali");
                
                //timpilkan satu baris data kedalam tabel
                model.addRow(obj);
            }
            
            //menutup hasi penulusuran dan koneksi
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("terjadi eror");
        }
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bclear = new javax.swing.JButton();
        TextNama = new javax.swing.JTextField();
        CBparfum = new javax.swing.JComboBox<>();
        RBbiasa = new javax.swing.JRadioButton();
        RBkilat = new javax.swing.JRadioButton();
        TextBayar = new javax.swing.JTextField();
        TextTotal = new javax.swing.JTextField();
        TextBerat = new javax.swing.JTextField();
        TextKembali = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Btambah = new javax.swing.JButton();
        Bcetak = new javax.swing.JButton();
        BTambahMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_transaksi", "id_member", "Berat", "Parfum", "Jenis", "Total", "Bayar", "kembali"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Bclear.setText("Clear");
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });

        CBparfum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parfum", "Strobery", "Babol", "Melati", "Mawar" }));

        buttonGroup1.add(RBbiasa);
        RBbiasa.setText("Biasa");
        RBbiasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBbiasaMouseClicked(evt);
            }
        });
        RBbiasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RBbiasaKeyReleased(evt);
            }
        });

        buttonGroup1.add(RBkilat);
        RBkilat.setText("Kilat");
        RBkilat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBkilatMouseClicked(evt);
            }
        });
        RBkilat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RBkilatKeyReleased(evt);
            }
        });

        TextBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextBayarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Loundry");

        jLabel2.setText("Nama / id_member");

        jLabel3.setText("Berat");

        jLabel4.setText("Parfum");

        jLabel5.setText("Jenis");

        jLabel6.setText("Total");

        jLabel7.setText("Bayar");

        jLabel8.setText("Kembalian");

        jLabel9.setText("Kg");

        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Bcetak.setText("Cetak");
        Bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcetakActionPerformed(evt);
            }
        });

        BTambahMember.setText("Tambah Member Baru");
        BTambahMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CBparfum, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextBerat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(RBbiasa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RBkilat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bcetak, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addComponent(Bclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextBayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextKembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTambahMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBparfum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RBbiasa)
                    .addComponent(RBkilat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bclear)
                    .addComponent(Bcetak)
                    .addComponent(BTambahMember)
                    .addComponent(Btambah))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        // TODO add your handling code here:
        TextNama.setText("");
        TextBerat.setText("");
        CBparfum.setSelectedItem("Parfum");
        buttonGroup1.clearSelection();
        TextTotal.setText("");
        TextBayar.setText("");
        TextKembali.setText("");
    }//GEN-LAST:event_BclearActionPerformed
    private void RBbiasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBbiasaMouseClicked
        // TODO add your handling code here:
        int jenis = 0;
        if(RBbiasa.isSelected()){
            jenis = 5000;
        }
        else if(RBkilat.isSelected()){
            jenis = 8000;
        }
        else{
            jenis = 0;
        }
        int berat = Integer.parseInt(TextBerat.getText());
        int hasil = berat * jenis;
        TextTotal.setText(String.valueOf(hasil));
    }//GEN-LAST:event_RBbiasaMouseClicked

    private void RBbiasaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RBbiasaKeyReleased
    }//GEN-LAST:event_RBbiasaKeyReleased

    private void RBkilatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBkilatMouseClicked
        // TODO add your handling code here:
        int jenis = 0;
        if(RBbiasa.isSelected()){
            jenis = 5000;
        }
        else if(RBkilat.isSelected()){
            jenis = 8000;
        }
        else{
            jenis = 0;
        }
        int berat = Integer.parseInt(TextBerat.getText());
        int hasil = berat * jenis;
        TextTotal.setText(String.valueOf(hasil));
    }//GEN-LAST:event_RBkilatMouseClicked

    private void RBkilatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RBkilatKeyReleased
    }//GEN-LAST:event_RBkilatKeyReleased

    private void TextBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBayarKeyReleased
        // TODO add your handling code here:
        int total = Integer.parseInt(TextTotal.getText());
        int bayar = Integer.parseInt(TextBayar.getText());
        int hasil = bayar - total;
        TextKembali.setText(String.valueOf(hasil));
    }//GEN-LAST:event_TextBayarKeyReleased

    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        //membaca dan menyimpan data yang diinputkan oleh user kedalam variabel
        Id_member = TextNama.getText();
        Berat = Integer.parseInt(TextBerat.getText());
        Parfum = CBparfum.getSelectedItem().toString();
        if(RBbiasa.isSelected()){
            Jenis = RBbiasa.getText();
        }
        if(RBkilat.isSelected()){
            Jenis = RBkilat.getText();
        }
        Total = Integer.parseInt(TextTotal.getText());
        Bayar = Integer.parseInt(TextBayar.getText());
        Kembali = Integer.parseInt(TextKembali.getText());
        
        //masukkan data kedalam jtable
        Object [] data = {Id_transaksi, Id_member,Berat,Parfum,Jenis,Total,Bayar,Kembali};
        model.addRow(data); 
        
        //MENYIMPAN DATA KEDALAM DATABASE MySQL
        try {
            Connection conn = KoneksiDB.getKoneksi();
            
            String sql = "CALL tambah_transaksi('"+Id_member+"','"+Berat+"','"+Parfum
                    +"','"+Jenis+"','"+Total+"','"+Bayar+"','"+Kembali+"')";
            PreparedStatement p = conn.prepareStatement(sql);
            
            p.executeUpdate();
            p.close();
            
        } catch (SQLException e) {
            System.out.println("Terjadi error ");
        }
    }//GEN-LAST:event_BtambahActionPerformed

    private void BcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcetakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcetakActionPerformed

    private void BTambahMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahMemberActionPerformed
        Member member = new Member();
        member.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTambahMemberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTambahMember;
    private javax.swing.JButton Bcetak;
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Btambah;
    private javax.swing.JComboBox<String> CBparfum;
    private javax.swing.JRadioButton RBbiasa;
    private javax.swing.JRadioButton RBkilat;
    private javax.swing.JTextField TextBayar;
    private javax.swing.JTextField TextBerat;
    private javax.swing.JTextField TextKembali;
    private javax.swing.JTextField TextNama;
    private javax.swing.JTextField TextTotal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
