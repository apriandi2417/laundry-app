package loundry;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 /*
 * @author apriandi
 */
public class Member extends javax.swing.JFrame {
    DefaultTableModel model;
    
    private String Id_member, Nama, Alamat, Kontak;
    private String Jenis_kelamin;
    public Member() {
        initComponents();
        //membuat tabel model
        model = (DefaultTableModel) jTable1.getModel();
        
        //menambahkan  TableModel ke jtable
        jTable1.setModel(model);
        
        //melakukan load data dari database
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Bclear2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btambah = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        RBlaki = new javax.swing.JRadioButton();
        RBperempuan = new javax.swing.JRadioButton();
        Bkembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAlamat = new javax.swing.JTextArea();
        TextKontak = new javax.swing.JTextField();
        TextNama = new javax.swing.JTextField();
        TextIdMember = new javax.swing.JTextField();
        Bdelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Breset = new javax.swing.JButton();

        Bclear2.setText("Clear");
        Bclear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bclear2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tambah Member Baru");

        jLabel2.setText("Nama");

        jLabel3.setText("id_member");

        jLabel4.setText("Alamat");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Kontak");

        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Bupdate.setText("Update");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBlaki);
        RBlaki.setText("L");
        RBlaki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBlakiMouseClicked(evt);
            }
        });
        RBlaki.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RBlakiKeyReleased(evt);
            }
        });

        buttonGroup1.add(RBperempuan);
        RBperempuan.setText("P");
        RBperempuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBperempuanMouseClicked(evt);
            }
        });
        RBperempuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RBperempuanKeyReleased(evt);
            }
        });

        Bkembali.setText("Kembali");
        Bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkembaliActionPerformed(evt);
            }
        });

        TextAlamat.setColumns(20);
        TextAlamat.setRows(5);
        jScrollPane1.setViewportView(TextAlamat);

        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_member", "Nama", "Alamat", "Jenis Kelamin", "Kontak"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        Breset.setText("Clear");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBlaki)
                        .addGap(18, 18, 18)
                        .addComponent(RBperempuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TextIdMember)
                    .addComponent(TextNama)
                    .addComponent(TextKontak)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bdelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Breset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bkembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TextIdMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBlaki)
                    .addComponent(RBperempuan)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btambah)
                    .addComponent(Bupdate)
                    .addComponent(Bdelete)
                    .addComponent(Bkembali)
                    .addComponent(Breset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            //membuat koneksi
            Connection conn = KoneksiDB.getKoneksi();
            Statement s = conn.createStatement();
            
            //membuat query SELECT
            String sql = "SELECT * FROM member";
            ResultSet r = s.executeQuery(sql);
            
            //membaca data didalam database baris per baris
            while (r.next()) {
                //membuat object 'obj' untuk menampung data yang dibaca dari DB
                Object[] obj = new Object[5];
                obj[0]= r.getString("id_member");
                obj[1]= r.getString("nama_member");
                obj[2]= r.getString("alamat_member");
                obj[3]= r.getString("jenis_kelamin");
                obj[4]= r.getString("Kontak");
                
                //timpilkan satu baris data kedalam tabel
                model.addRow(obj);
            }
            
            //menutup hasi penulusuran dan koneksi
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("terjadi eror" + e);
        }
    }
    public void reset(){
        TextIdMember.setText("");
        TextNama.setText("");
        TextAlamat.setText("");
        TextKontak.setText("");
        buttonGroup1.clearSelection();
    }
    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        //membaca dan menyimpan data yang diinputkan oleh user kedalam variabel
        Id_member = TextIdMember.getText();
        Nama = TextNama.getText();
        Alamat = TextAlamat.getText();
        if(RBlaki.isSelected()){
            Jenis_kelamin = RBlaki.getText();
        }
        if(RBperempuan.isSelected()){
            Jenis_kelamin = RBperempuan.getText();
        }
        Kontak = TextKontak.getText();
        
        
            //masukkan data kedalam jtable
            Object [] data = {Id_member,Nama,Alamat,Jenis_kelamin,Kontak};
            model.addRow(data); 

            //MENYIMPAN DATA KEDALAM DATABASE MySQL
            
                Connection conn = KoneksiDB.getKoneksi();

                String sql = "CALL tambah_member('"+Id_member+"','"+Nama+"','"+
                        Alamat+"','"+Jenis_kelamin+"','"+Kontak+"')";
            try {
                PreparedStatement p = conn.prepareStatement(sql);

                p.executeUpdate();
                p.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Terjadi error ");
            }
            reset();
            loadData();
  
            
        

    }//GEN-LAST:event_BtambahActionPerformed
    private void RBlakiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RBlakiKeyReleased


    }//GEN-LAST:event_RBlakiKeyReleased
    private void RBperempuanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RBperempuanKeyReleased
    }//GEN-LAST:event_RBperempuanKeyReleased
    private void RBlakiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBlakiMouseClicked
    }//GEN-LAST:event_RBlakiMouseClicked
    private void RBperempuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBperempuanMouseClicked
    }//GEN-LAST:event_RBperempuanMouseClicked
    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        //membaca dan menyimpan data yang diinputkan oleh user kedalam variabel
        Id_member = TextIdMember.getText();
        Nama = TextNama.getText();
        Alamat = TextAlamat.getText();
        if(RBlaki.isSelected()){
            Jenis_kelamin = RBlaki.getText();
        }
        if(RBperempuan.isSelected()){
            Jenis_kelamin = RBperempuan.getText();
        }
        Kontak = TextKontak.getText();
        
        
        //MENYIMPAN DATA KEDALAM DATABASE MySQL
        try {
            Connection conn = KoneksiDB.getKoneksi();
            
            String sql = "CALL update_member('"+Id_member+"','"+Nama+"','"+
                    Alamat+"','"+Jenis_kelamin+"','"+Kontak+"')";
            PreparedStatement p = conn.prepareStatement(sql);
            
            p.executeUpdate();
            p.close();
            
        } catch (SQLException e) {
            System.out.println("Terjadi error ");
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate?");
        reset();
        loadData();
    }//GEN-LAST:event_BupdateActionPerformed
    private void BkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkembaliActionPerformed
        Transaksi transaksi = new Transaksi();
        transaksi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BkembaliActionPerformed
    private void Bclear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bclear2ActionPerformed
    }//GEN-LAST:event_Bclear2ActionPerformed
    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Anda yakin akan menghapus data ini?");
        if(pilih == JOptionPane.OK_OPTION){
            Id_member = TextIdMember.getText();
            try {
                Connection conn = KoneksiDB.getKoneksi();

                String sql = "CALL delete_member('"+Id_member+"')";
                PreparedStatement p = conn.prepareStatement(sql);

                p.executeUpdate();
                p.close();

            } catch (SQLException e) {
                System.out.println("Terjadi error ");
            }
            reset();
            loadData();   
        }          
    }//GEN-LAST:event_BdeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int x = jTable1.getSelectedRow();
        TextIdMember.setText(jTable1.getValueAt(x, 0).toString());
        TextNama.setText(jTable1.getValueAt(x, 1).toString());
        TextAlamat.setText(jTable1.getValueAt(x, 2).toString());
        String y = jTable1.getValueAt(x, 3).toString(); ;
        if( y.equals("L")){
            RBlaki.setSelected(true);
        }
        if(y.equals("P")){
            RBperempuan.setSelected(true);
        } 
        TextKontak.setText(jTable1.getValueAt(x, 4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_BresetActionPerformed
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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclear2;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bkembali;
    private javax.swing.JButton Breset;
    private javax.swing.JButton Btambah;
    private javax.swing.JButton Bupdate;
    private javax.swing.JRadioButton RBlaki;
    private javax.swing.JRadioButton RBperempuan;
    private javax.swing.JTextArea TextAlamat;
    private javax.swing.JTextField TextIdMember;
    private javax.swing.JTextField TextKontak;
    private javax.swing.JTextField TextNama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
