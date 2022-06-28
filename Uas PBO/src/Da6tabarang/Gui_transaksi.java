package Da6tabarang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
public class Gui_transaksi extends javax.swing.JFrame {
public Gui_transaksi() {
        initComponents();

        tampil();
}

public Connection conn;
public void koneksi() throws SQLException {
 try {
 conn=null;
 Class.forName("com.mysql.jdbc.Driver");
 conn= 
DriverManager.getConnection("jdbc:mysql://localhost/1618030_oop?user=root&password=");
 } catch (ClassNotFoundException ex) {
 
Logger.getLogger(Gui_transaksi.class.getName()).log(Level.SEVERE, 
null, ex);
 } catch (SQLException e) {
 
Logger.getLogger(Gui_transaksi.class.getName()).log(Level.SEVERE, 
null, e);
 } catch (Exception es) {
 
Logger.getLogger(Gui_transaksi.class.getName()).log(Level.SEVERE, 
null, es);
 }
  }
public void reset()
 {
 id.setText("");
 kode.setText("");
 nama.setText("");
 harga.setText("");
 jumlah.setText("");
 total.setText("");
 bayar.setText("");
 kembalian.setText("");
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
 table_data.setModel(tabelhead);
 } catch (Exception e) {
 }
 }
public void refresh(){
 new Gui_transaksi().setVisible(true);
 this.setVisible(false);
 }
public void insert(){
 String Id =   Id.getText;
 String kode = Kode.getText();
 String Nama = nama.getText();
 String Harga = harga.getText();
 String Jumlah = jumlah.getText();
 String Total = total.getText();
 String Bayar = bayar.getText();
 String Kembalian = kembalian.getText();
 try {
 koneksi();
 Statement statement = conn.createStatement();
 statement.executeUpdate("INSERT INTO tb_transaksi(id, kode, nama, harga, jumlah, total, bayar, kembali)"
+ "values('"+id+"','"+kode+"','"+nama+"','"+harga+"','"+jumlah+"','"+total+"'"
+ ",'"+bayar+"','"+kembalian+"')");
 statement.close();
JOptionPane.showMessageDialog(null, "Memasukkan Transaksi Baru!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Transaksi Gagal!");
 }
 refresh();
}
 public void update(){
 String Id = id.getText();
 String Jumlah = jumlah.getText();
 String Total = total.getText();
 String Bayar = bayar.getText();
 String Kembalian = kembalian.getText();
 try {
 Statement statement = conn.createStatement();
 statement.executeUpdate("UPDATE tb_transaksi SET id='"+id+"'," + 
"jumlah='"+jumlah+"',total='"+total+"',bayar='"+bayar+"',kembali='"+kembalian+"' " + "WHERE id = '"+id+"'");
 statement.close();
 conn.close();
 JOptionPane.showMessageDialog(null, "Berhasil Merubah Transaksi!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Error"+e);
 }
 refresh();
 }
 public void delete(){
 int ok=JOptionPane.showConfirmDialog(null,"Anda Yakin Menghapus Data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
 if(ok==0){
 try{
 String sql="delete from tb_transaksi where id='"+id.getText()+"'";
 java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
 stmt.executeUpdate();
 JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
 }catch(Exception e){
 JOptionPane.showMessageDialog(null,"Data gagal di hapus");
 }
 }
 refresh();
 }
public void cariID(){
 DefaultTableModel tabelhead = new DefaultTableModel();
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
 String sql="SELECT * FROM tb_transaksi WHERE id like '%"+Cari.getText()+"%'";
 ResultSet rs=statement.executeQuery(sql);
 if(rs.next())
 {
 id.setText(rs.getString(1));
 Kode.setText(rs.getString(2));
 nama.setText(rs.getString(3));
 harga.setText(rs.getString(4));
 jumlah.setText(rs.getString(5));
 total.setText(rs.getString(6));
 bayar.setText(rs.getString(7));
kembalian.setText(rs.getString(8));
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
 String sql="select * from tb_barang where kode like '%"+Kode.getText()+"%'";
 ResultSet rs=statement.executeQuery(sql);
 if(rs.next())
 {
 Kode.setText(rs.getString(1));
 nama.setText(rs.getString(2));
 harga.setText(rs.getString(4));
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
        Id_Transaksi = new javax.swing.JLabel();
        Harga_Barang = new javax.swing.JLabel();
        Jumlah_Pembelian = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        Total_Harga = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        Uang_diBayar = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        btn_proses = new javax.swing.JButton();
        Uang_Kembalian = new javax.swing.JLabel();
        Cari = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data = new javax.swing.JTable();
        btn_kode = new javax.swing.JButton();
        text_kode = new javax.swing.JTextField();
        Nama_Barang = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_barang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Transaksi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Transaksi.setText("      Transaksi");

        Id_Transaksi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Id_Transaksi.setText("ID Transaksi");

        Harga_Barang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Harga_Barang.setText("Harga Barang");

        Jumlah_Pembelian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Jumlah_Pembelian.setText("Jumlah Pembelian");

        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        Total_Harga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Total_Harga.setText("Total Harga");

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        Uang_diBayar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Uang_diBayar.setText("Uang di bayar");

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        kembalian.setEditable(false);
        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });

        btn_proses.setText("Proses");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });

        Uang_Kembalian.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Uang_Kembalian.setText("Uang Kembalian");

        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Kode", "Nama", "Harga", "Jumlah", "Total", "Biaya", "Kembali"
            }
        ));
        jScrollPane1.setViewportView(table_data);

        btn_kode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_kode.setText("Kode Barang");
        btn_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kodeActionPerformed(evt);
            }
        });

        text_kode.setEditable(false);

        Nama_Barang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nama_Barang.setText("Nama Barang");

        jButton3.setText("Cari Kode ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");

        btn_barang.setText("Barang-->");
        btn_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_kode)
                        .addComponent(Id_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nama_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Harga_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_barang)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jumlah_Pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGap(153, 153, 153)
                                .addComponent(btn_insert)
                                .addGap(32, 32, 32)
                                .addComponent(btn_update)
                                .addGap(43, 43, 43)
                                .addComponent(btn_delete)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_hitung))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Uang_diBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 108, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_proses))
                    .addComponent(Uang_Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Id_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_kode)
                                    .addComponent(text_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nama_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Harga_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jumlah_Pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_insert)
                            .addComponent(btn_update)
                            .addComponent(btn_delete)
                            .addComponent(btn_reset)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_hitung)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_barang))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Total_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Uang_diBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_proses)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uang_Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembalianActionPerformed

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
n_transaksi obj = new n_transaksi();
 obj.setid(t.getText());
 obj.setharga(Double.parseDouble(harga.getText()));
 obj.setjumlah(Double.parseDouble(jumlah.getText()));
 
 total.setText(Double.toString(obj.total()));

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prosesActionPerformed
      Transaksi obj = new Transaksi();
 obj.setHarga(Double.parseDouble(harga.getText()));
 obj.setJumlah(Double.parseDouble(jumlah.getText()));
 total.setText(Double.toString(obj.total())); 
 obj.setPembayaran(Double.parseDouble(bayar.getText()));
 kembalian.setText(Double.toString(obj.kembali()));

    }//GEN-LAST:event_btn_prosesActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
     insert();
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        update();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
delete();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
cariID();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kodeActionPerformed
carikode();
    }//GEN-LAST:event_btn_kodeActionPerformed

    private void btn_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barangActionPerformed
    
 Gui_Barang obj = new Gui_Barang();
 obj.show();
 this.dispose();
 
 // TODO add your handling code here:
 } 
    }//GEN-LAST:event_btn_barangActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cari;
    private javax.swing.JLabel Harga_Barang;
    private javax.swing.JLabel Id_Transaksi;
    private javax.swing.JLabel Jumlah_Pembelian;
    private javax.swing.JLabel Nama_Barang;
    private javax.swing.JLabel Total_Harga;
    private javax.swing.JLabel Transaksi;
    private javax.swing.JLabel Uang_Kembalian;
    private javax.swing.JLabel Uang_diBayar;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton btn_barang;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_hitung;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_kode;
    private javax.swing.JButton btn_proses;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField nama;
    private javax.swing.JTable table_data;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_kode;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
