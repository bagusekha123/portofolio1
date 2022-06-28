package Kendaraanku12;
class Sepeda_Motor extends Kendaraan {
public String getJeniskendaraan (){
        return Jenis;
    }
  public void setJeniskendaraan(String Motor){
   super.SetJenis(Motor); ;
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
  public void setbiayatiketkendaraan(double BiayaMotor){
       super.Setbiaya_tiket_kendaraan(BiayaMotor); ;
    }
  public double getbiayatiketperpenumpang(){
      return biaya_tiket_perpenumpang;
  }
  public void setbiayatiketperpenumpang(double BiayaPenumpang){
       super.Setbiaya_tiket_perpenumpang(BiayaPenumpang) ;
    }
  @Override
 public double getTotalBiaya (){
     return biaya_tiket_kendaraan * biaya_tiket_perpenumpang*jumlah_penumpang; 
 } 
    
    
}
