package Kendaraanku12;
class Mini_Buss extends Kendaraan {
 public String getJeniskendaraan (){
        return Jenis;
    }
  public void setJeniskendaraan(String MiniBus){
   super.SetJenis(MiniBus); ;
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
  public void setbiayatiketkendaraan(double BiayaMiniBus){
       super.Setbiaya_tiket_kendaraan(BiayaMiniBus); ;
    }
  public double getbiayatiketperpenumpang(){
      return biaya_tiket_perpenumpang;
  }
  public void setbiayatiketperpenumpang(double BiayaPenumpang){
       super.Setbiaya_tiket_perpenumpang(BiayaPenumpang) ;
    }
  @Override
 public double getTotalBiaya (){
     return(biaya_tiket_kendaraan * biaya_tiket_perpenumpang *jumlah_penumpang)/2/100; 
 } 
    
}
