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
class Lingkasan extends Bangun_Datar{
    public double getDiameter(){
    return Panjang;
} 
public void setDiameter(double Diameter){
    super.setPanjang(Diameter);
}
@Override
 public double getluas(){
    //rumusnya Pl * (r*r) -> r = jari2
    return Math.PI * Math.pow(Panjang/2, 2);
} 

}
