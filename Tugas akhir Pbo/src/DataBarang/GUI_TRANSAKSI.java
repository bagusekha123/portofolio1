/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBarang;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
public class GUI_TRANSAKSI extends javax.swing.JFrame {

    /**
     * Creates new form GUI_TRANSAKSI
     */
    public GUI_TRANSAKSI() {
        initComponents();
    n_Transaksi obj = new n_Transaksi();
        tampil();
    }
public Connection conn;
public void koneksi() throws SQLException {
 try {
 conn=null;
 Class.forName("com.mysql.jdbc.Driver");
 conn= 
DriverManager.getConnection("jdbc:mysql://localhost/002_oop?user=root&password=");
 } catch (ClassNotFoundException ex) {
 
Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(Level.SEVERE, 
null, ex);
 } catch (SQLException e) {
 
Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(Level.SEVERE, 
null, e);
 } catch (Exception es) {
 
Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(Level.SEVERE, 
null, es);
 }
}
public void tampil() {
 DefaultTableModel tabelhead = new DefaultTableModel();
 tabelhead.addColumn("KODE");
 tabelhead.addColumn("NAMA");
 tabelhead.addColumn("STOK");
 tabelhead.addColumn("HARGA");
 tabelhead.addColumn("JUMLAH");
 tabelhead.addColumn("TOTAL");
 tabelhead.addColumn("BAYAR");
 tabelhead.addColumn("KEMBALI");
 try {
 koneksi();
 String sql = "select * from tb_transaksi";
 Statement stat = conn.createStatement();
 ResultSet res = stat.executeQuery(sql);
 while(res.next()){
 tabelhead.addRow(new 
Object[]{res.getString(1),res.getString(2),res.getString(3),
 
res.getString(4),res.getString(5),res.getString(6), 
res.getString(7), 
 res.getString(8)});
 }
 jTable_data.setModel(tabelhead);
 } catch (Exception e) {
 }
 }
public void insert(){
 String id = Text_id.getText();
 String kode = Tesx_kode.getText();
 String nama = Text_nama.getText();
 String harga = Text_harga.getText();
 String jumlah = Text_jumlah.getText();
 String total = Text_total.getText();
 String bayar = Text_bayar.getText();
 String kembalian = Text_kembalian.getText();
 try {
 koneksi();
 Statement statement = conn.createStatement();
 statement.executeUpdate("INSERT INTO tb_transaksi(id, "
 + "kode, nama, harga, jumlah, total, bayar,kembalian)" + 
"values('"+id+"','"+kode+"','"+nama+"','"+harga+"','"+jumlah+
"','"+total+"'"
 + ",'"+bayar+"','"+kembalian+"')");
 statement.close();
 JOptionPane.showMessageDialog(null, "Memasukkan Transaksi Baru!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Transaksi Gagal!");
 }
 refresh();
}
public void update(){
 String id = Text_id.getText();
 String jumlah = Text_jumlah.getText();
 String total = Text_total.getText();
 String bayar = Text_bayar.getText();
 String kembalian = Text_kembalian.getText();
 try {
 Statement statement = conn.createStatement();
 statement.executeUpdate("UPDATE tb_transaksi SET id='"+id+"'," + 
"jumlah='"+jumlah+"',total='"+total+"',bayar='"+bayar+"',kembalian='"+kembalian+"' "
 + "WHERE id = '"+id+"'");
 statement.close();
 conn.close();
 JOptionPane.showMessageDialog(null, "Berhasil Merubah Transaksi!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Error"+e);
 }
 refresh();
 }
public void refresh(){
 new GUI_TRANSAKSI().setVisible(true);
 this.setVisible(false);
 }
public void delete(){
 int ok=JOptionPane.showConfirmDialog(null,"Anda Yakin Menghapus Data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
 if(ok==0){
 try{
 String sql="delete from tb_transaksi where id='"+Text_id.getText()+"'";
 java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
 stmt.executeUpdate();
 JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
 }catch(Exception e){
 JOptionPane.showMessageDialog(null,"Data gagal di hapus");
 }
 }
 refresh();
 }
 public void reset()
 {
 Text_id.setText("");
 Tesx_kode.setText("");
 Text_nama.setText("");
 Text_harga.setText("");
 Text_jumlah.setText("");
 Text_total.setText("");
 Text_bayar.setText("");
 Text_kembalian.setText("");
 }
 public void cariID(){
 DefaultTableModel tabelhead = new 
DefaultTableModel();
 tabelhead.addColumn("ID");
 tabelhead.addColumn("KODE");
 tabelhead.addColumn("JUDUL");
 tabelhead.addColumn("HARGA");
 tabelhead.addColumn("JUMLAH");
 tabelhead.addColumn("TOTAL");
 tabelhead.addColumn("BAYAR");
 tabelhead.addColumn("KEMBALIAN");
 try{
 koneksi();
 Statement statement=conn.createStatement();
 String sql="SELECT * FROM tb_transaksi WHERE id like'%"+Text_cari.getText()+"%'";
 ResultSet rs=statement.executeQuery(sql);
if(rs.next())
 {
 Text_id.setText(rs.getString(1));
 Tesx_kode.setText(rs.getString(2));
 Text_nama.setText(rs.getString(3));
 Text_harga.setText(rs.getString(4));
 Text_jumlah.setText(rs.getString(5));
 Text_total.setText(rs.getString(6));
 Text_bayar.setText(rs.getString(7));
Text_kembalian.setText(rs.getString(8));
 }
 else{
 JOptionPane.showMessageDialog(null, "ID penjualan yang Anda cari tidak ada");
 }
 statement.close();
 }catch (Exception e){
 System.out.println("Error."+e);
 } 
 }
 public void carikode(){
 try{
 koneksi();
 Statement statement=conn.createStatement();
 String sql="select * from tb_barang where kodelike '%"+Tesx_kode.getText()+"%'";
 ResultSet rs=statement.executeQuery(sql);
 if(rs.next())
 {
 Tesx_kode.setText(rs.getString(1));
 Text_nama.setText(rs.getString(2));
 Text_harga.setText(rs.getString(4));
 }
 else{
 JOptionPane.showMessageDialog(null, "Barang yang ada cari tidak ada!");
 }
 statement.close();
 }catch (Exception ex){
 System.out.println("Error."+ex);
 } 
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Transaksi = new javax.swing.JLabel();
        Nama_Barang = new javax.swing.JLabel();
        Text_id = new javax.swing.JTextField();
        Buton_Kode = new javax.swing.JButton();
        Tesx_kode = new javax.swing.JTextField();
        Idtransaksi1 = new javax.swing.JLabel();
        Text_nama = new javax.swing.JTextField();
        Harga_Barang = new javax.swing.JLabel();
        Text_harga = new javax.swing.JTextField();
        Harga_Barang1 = new javax.swing.JLabel();
        Text_jumlah = new javax.swing.JTextField();
        Button_hitung = new javax.swing.JButton();
        Total_Pembyaran = new javax.swing.JLabel();
        Text_total = new javax.swing.JTextField();
        Uang_dibayar = new javax.swing.JLabel();
        Text_bayar = new javax.swing.JTextField();
        Button_proses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Text_kembalian = new javax.swing.JTextField();
        Text_cari = new javax.swing.JTextField();
        Button_cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_data = new javax.swing.JTable();
        Button_insert = new javax.swing.JButton();
        Button_update = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        Button_barang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Transaksi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Transaksi.setText("Transaksi");

        Nama_Barang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Nama_Barang.setText("Nama Barang");

        Text_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_idActionPerformed(evt);
            }
        });

        Buton_Kode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Buton_Kode.setText("Kode Barang");
        Buton_Kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buton_KodeActionPerformed(evt);
            }
        });

        Idtransaksi1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Idtransaksi1.setText("ID TRANSAKSI");

        Harga_Barang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Harga_Barang.setText("Harga Barang");

        Harga_Barang1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Harga_Barang1.setText("Jumlah Pembelian");

        Button_hitung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_hitung.setText("Hitung");
        Button_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_hitungActionPerformed(evt);
            }
        });

        Total_Pembyaran.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Total_Pembyaran.setText("Total Bayar");

        Uang_dibayar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Uang_dibayar.setText("Uang Dibayar");

        Button_proses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_proses.setText("Proses");
        Button_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_prosesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Uang Kembalian");

        Button_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_cari.setText("Cari ID");
        Button_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cariActionPerformed(evt);
            }
        });

        jTable_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Kode", "Nama", "Harga", "Jumlah", "Total", "Bayar", "Kembalian"
            }
        ));
        jScrollPane1.setViewportView(jTable_data);

        Button_insert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_insert.setText("Insert");
        Button_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_insertActionPerformed(evt);
            }
        });

        Button_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_update.setText("Update");
        Button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_updateActionPerformed(evt);
            }
        });

        Button_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_delete.setText("Delete");
        Button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_deleteActionPerformed(evt);
            }
        });

        jButton_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        Button_barang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Button_barang.setText("Data Barang-->");
        Button_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_barangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Button_proses)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(Text_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(Idtransaksi1)
                            .addGap(18, 18, 18)
                            .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Harga_Barang1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nama_Barang)
                                        .addComponent(Buton_Kode)))
                                .addComponent(Harga_Barang)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(Button_hitung))
                                .addComponent(Total_Pembyaran)
                                .addComponent(Uang_dibayar))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tesx_kode)
                                .addComponent(Text_nama)
                                .addComponent(Text_harga)
                                .addComponent(Text_jumlah)
                                .addComponent(Text_total)
                                .addComponent(Text_bayar)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Transaksi)
                                .addGap(440, 440, 440))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_barang)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addComponent(Button_cari)))
                                .addGap(71, 71, 71))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Button_insert)
                        .addGap(18, 18, 18)
                        .addComponent(Button_update)
                        .addGap(34, 34, 34)
                        .addComponent(Button_delete)
                        .addGap(63, 63, 63)
                        .addComponent(jButton_reset)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Transaksi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Idtransaksi1))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_cari)
                            .addComponent(Text_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buton_Kode)
                            .addComponent(Tesx_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nama_Barang)
                            .addComponent(Text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Harga_Barang)
                            .addComponent(Text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Harga_Barang1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Text_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button_insert)
                        .addComponent(Button_update)
                        .addComponent(Button_delete)
                        .addComponent(jButton_reset)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_hitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total_Pembyaran)
                            .addComponent(Text_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Button_barang)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Uang_dibayar)
                    .addComponent(Text_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_proses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_hitungActionPerformed
n_Transaksi obj = new n_Transaksi();
 obj.setId(Text_id.getText());
 obj.setHarga(Double.parseDouble(Text_harga.getText()));
 obj.setJumlah(Double.parseDouble(Text_jumlah.getText()));
 
 Text_total.setText(Double.toString(obj.total()));        // TODO add your handling code here:
    }//GEN-LAST:event_Button_hitungActionPerformed

    private void Button_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_prosesActionPerformed
        n_Transaksi obj = new n_Transaksi();
 obj.setHarga(Double.parseDouble(Text_harga.getText()));
 obj.setJumlah(Double.parseDouble(Text_jumlah.getText()));
 Text_total.setText(Double.toString(obj.total())); 
 obj.setPembayaran(Double.parseDouble(Text_bayar.getText()));
 Text_kembalian.setText(Double.toString(obj.kembali()));// TODO add your handling code here:
    }//GEN-LAST:event_Button_prosesActionPerformed

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
  reset();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void Button_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_insertActionPerformed
   insert();     // TODO add your handling code here:
    }//GEN-LAST:event_Button_insertActionPerformed

    private void Button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_updateActionPerformed
update();        // TODO add your handling code here:
    }//GEN-LAST:event_Button_updateActionPerformed

    private void Button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_deleteActionPerformed
delete();        // TODO add your handling code here:
    }//GEN-LAST:event_Button_deleteActionPerformed

    private void Button_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cariActionPerformed
cariID();        // TODO add your handling code here:
    }//GEN-LAST:event_Button_cariActionPerformed

    private void Buton_KodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buton_KodeActionPerformed
carikode();        // TODO add your handling code here:
    }//GEN-LAST:event_Buton_KodeActionPerformed

    private void Button_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_barangActionPerformed
    GUI_BARANG obj = new GUI_BARANG();
    obj.show();
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_barangActionPerformed

    private void Text_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_idActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_TRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_TRANSAKSI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buton_Kode;
    private javax.swing.JButton Button_barang;
    private javax.swing.JButton Button_cari;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_hitung;
    private javax.swing.JButton Button_insert;
    private javax.swing.JButton Button_proses;
    private javax.swing.JButton Button_update;
    private javax.swing.JLabel Harga_Barang;
    private javax.swing.JLabel Harga_Barang1;
    private javax.swing.JLabel Idtransaksi1;
    private javax.swing.JLabel Nama_Barang;
    private javax.swing.JTextField Tesx_kode;
    private javax.swing.JTextField Text_bayar;
    private javax.swing.JTextField Text_cari;
    private javax.swing.JTextField Text_harga;
    private javax.swing.JTextField Text_id;
    private javax.swing.JTextField Text_jumlah;
    private javax.swing.JTextField Text_kembalian;
    private javax.swing.JTextField Text_nama;
    private javax.swing.JTextField Text_total;
    private javax.swing.JLabel Total_Pembyaran;
    private javax.swing.JLabel Transaksi;
    private javax.swing.JLabel Uang_dibayar;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_data;
    // End of variables declaration//GEN-END:variables
}
