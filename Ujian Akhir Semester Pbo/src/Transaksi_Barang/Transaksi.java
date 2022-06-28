package Transaksi_Barang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
public class Transaksi extends Barang {
private char Idtransaksi;
int Uangdibayar,Uangkembalian;
public char getIdtransaksi() {
        return Idtransaksi;
    }

    public void setIdtransaksi(char Idtransaksi) {
        this.Idtransaksi = Idtransaksi;
    }

    public int getUangdibayar() {
        return Uangdibayar;
    }

    public void setUangdibayar(int Uangdibayar) {
        this.Uangdibayar = Uangdibayar;
    }
  

    @Override
    public int Total() {
        return Hargabarang * Jumlahpembelian;
        
    }

  

public int Uangkembalian(){
    return Uangkembalian;
}
    
}
