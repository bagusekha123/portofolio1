package Kendaraanku12;
 class Mobil extends Kendaraan {
public String getJeniskendaraan (){
        return Jenis;
    }
  public void setJeniskendaraan(String Mobil){
   super.SetJenis(Mobil); ;
    }
 public double JumlahPenumpang(){
        return jumlah_penumpang;
    }
  public void setJumlahPenumpang(int JumlahPenumpang){
       super.Setjumlah_penumpang(JumlahPenumpang); ;
    }
  public double getbiayatiketkendaraan(){
      return biaya_tiket_kendaraan;
  }
  public void setbiayatiketkendaraan(double BiayaMobil){
       super.Setbiaya_tiket_kendaraan(BiayaMobil); ;
    }
  public double getbiayatiketperpenumpang(){
      return biaya_tiket_perpenumpang;
  }
  public void setbiayatiketperpenumpang(double BiayaPenumpang){
       super.Setbiaya_tiket_perpenumpang(BiayaPenumpang) ;
    }
  @Override
 public double getTotalBiaya (){
     return biaya_tiket_kendaraan * biaya_tiket_perpenumpang *jumlah_penumpang; 
 } 
    
    
}
