package Transaksi_Barang;

public class Barang  {
private String kodebarang,Namabarang;
int Hargabarang;
    private int Stokbarang;
    private int total;
    int Jumlahpembelian;

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNamabarang() {
        return Namabarang;
    }

    public void setNamabarang(String Namabarang) {
        this.Namabarang = Namabarang;
    }

    public int getHargabarang() {
        return Hargabarang;
    }

    public int getJumlahpembelian() {
        return Jumlahpembelian;
    }

    public void setJumlahpembelian(int Jumlahpembelian) {
        this.Jumlahpembelian = Jumlahpembelian;
    }

    public void setHargabarang(int Hargabarang) {
        this.Hargabarang = Hargabarang;
    }

    public int getStokbarang() {
        return Stokbarang;
    }

    public void setStokbarang(int Stokbarang) {
        this.Stokbarang = Stokbarang;
    }
public int Total(){
    return total;
}

}
