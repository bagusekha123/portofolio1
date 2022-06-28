package DataBarang;
public class n_Transaksi extends Transaksi  {
public n_Transaksi(){
  id="Tr12";
  kode="Tx12";
 harga=5000;
 jumlah=2;
 pembayaran=20000;
 }
 
 double total()
 {
 return (getHarga()*getJumlah());
 }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(double pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 double kembali()
 {
 return (getPembayaran()-total());
 }
}    
    

