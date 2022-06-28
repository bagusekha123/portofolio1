package Da6tabarang;
public class n_transaksi  extends Transaksi  {
public n_transaksi(){
 id="Tr12";
 harga=5000;
 jumlah=2;
 pembayaran=20000;
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
 
 double total()
 {
 return (getharga()*getjumlah());
 }
 double kembali()
 {
 return (getpembayaran()-total());
 }
}    
