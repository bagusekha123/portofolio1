package UAS_PBO.Kendaran;
class Buss extends Kendaraan {
public String getJeniskendaraan (){
        return Jenis;
    }
  public void setJeniskendaraan(String Bus){
   super.SetJenis(Bus); ;
    }
 public double JumlahPenumpang(){
        return jumlah_penumpang;
    }
  public void setJumlahPenumpang(double JumlahPenumpang){
       super.Setjumlah_penumpang(JumlahPenumpang); ;
    }
  public double getbiayatiketkendaraan(){
      return biaya_tiket_kendaraan;
  }
  public void setbiayatiketkendaraan(double BiayaBus){
       super.Setbiaya_tiket_kendaraan(BiayaBus); ;
    }
  public double getbiayatiketperpenumpang(){
      return biaya_tiket_perpenumpang;
  }
  public void setbiayatiketperpenumpang(double BiayaPenumpang){
       super.Setbiaya_tiket_perpenumpang(BiayaPenumpang) ;
    }
@Override
  public double getTotalBiaya (){
     return(biaya_tiket_kendaraan * biaya_tiket_perpenumpang)/5/100; 
 } 
    
}
