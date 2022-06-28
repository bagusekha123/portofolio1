/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_PBO;

/**
 *
 * @author ASUS
 */
class SegiTiga extends Bangun_Datar {
 public double getAlas (){
        return Panjang;
    }
  public void setAlas(double alas){
       super.setPanjang(alas); ;
    }
 public double getTinggi(){
        return Lebar;
    }
  public void setTinggi(double Tinggi){
       super.setLebar(Tinggi); ;
    }
 @Override 
 public double getLuas (){
     return(Panjang * Lebar)/2; 
 }   
}   

