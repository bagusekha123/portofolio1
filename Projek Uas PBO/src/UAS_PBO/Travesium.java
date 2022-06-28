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
class Travesium extends Bangun_Datar {
    protected double panjangAtas;
    private double panjang;
    
    public double getPanjangAtas() {
        return panjangAtas;
    }
    public void setPanjangAtas(double panjangAtas) {
        this.panjangAtas = panjangAtas < 0 ? 1 : panjangAtas;
    }
    
    @Override
    public double getLuas() {
        // luas trapesium = ((p + pA) / 2) * 3
        return ((panjang + panjangAtas) / 2) * 3;
    }    
    
}
