/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_PBO.Kendaran;

/**
 *
 * @author ASUS
 */
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
  public void setJumlahPenumpang(double JumlahPenumpang){
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
     return(biaya_tiket_kendaraan * biaya_tiket_perpenumpang); 
 } 
    
    
}
