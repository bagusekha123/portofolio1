public class TRANSAKSI {
public double harga,jumlah,pembayaran;
public String Id_Transaksi;

public void setHarga(double Harga){
    this.harga = Harga;
}
public double getHarga(){
    return harga;
}
public void setJumlah(double Jumlah){
    this.jumlah = Jumlah;
}
public double getJumlah(){
    return jumlah;
}
public void setPembayaran(double Pembayaran){
    this.pembayaran = Pembayaran;
}
public double getpembayaran(){
    return pembayaran;
}
public void setid(String Id){
    this.Id_Transaksi = Id;
}
public String getId(){
    return Id_Transaksi;
}
public double Total(){
    return harga * jumlah;
}
}
