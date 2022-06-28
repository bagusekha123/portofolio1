package UAS_PBO.Kendaran;
public class Kendaraan {
    protected String Jenis;
    protected Double jumlah_penumpang;
    protected Double biaya_tiket_kendaraan,
                    biaya_tiket_perpenumpang;

    
    public void SetJenis(String Jenis){
        this.Jenis = Jenis;
    }
    public String getJenis(){
        return Jenis;
    }
    public void Setjumlah_penumpang(double Penumpang){
        this.jumlah_penumpang = Penumpang;
    }
    public Double getjumlah_penumpang(){
        return jumlah_penumpang;
    }
    public void Setbiaya_tiket_kendaraan(double Biaya_Penumpang){
        this.biaya_tiket_kendaraan = Biaya_Penumpang;
    }
    public Double getbiaya_penumpang(){
        return biaya_tiket_kendaraan;
    }
 public void Setbiaya_tiket_perpenumpang(double Tiket_Penumpang){
        this.biaya_tiket_perpenumpang = Tiket_Penumpang;
    }
    public Double getbiaya_tiket_perpenumpang(){
        return  biaya_tiket_perpenumpang;
    }
public double getTotalBiaya(){
   return TotalBiaya;
}
  public void cetakInfo(){
        System.out.println("Nama Kendaraan " + this.Jenis);
        System.out.println("Banyak Penumpang " + this.jumlah_penumpang);
        System.out.println("Biaya Kendaraan " + this.biaya_tiket_kendaraan);
        System.out.println("Biaya Penumpang " +this.biaya_tiket_perpenumpang);
    }

}
