/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_PBO;
 
public class Bangun_Datar {
// Dibuat protected agar bisa diturunkan ke Class Anak
 protected Double Panjang,Lebar;
    private double Luas;
    String getLuas;
//Geter dan seter Panjang
public double getPanjang(){
    return Panjang;
} 
public void setPanjang(double Panjang){
    this.Panjang = Panjang < 1 ? 1 : Panjang;
} 
public double getLebar(){
    return Lebar;
} 
public void setLebar(double Lebar){
    this.Lebar = Lebar < 1 ? 1 : Lebar;
} 
//method getLuas
public double getLuas(){
   return Luas;
}
}