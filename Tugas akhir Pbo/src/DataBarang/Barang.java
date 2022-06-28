package DataBarang;
public class Barang {
private String kode, nama, stok, harga;
public Barang() {
    kode = "FF10";
 nama = "Vertical Foregrip";
 stok = "100";
 harga = "2000";

    }
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}
