/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedagang;

/**
 *
 * @author ASUS
 */
public class pedagang1 {
 public class Pedagang {
    int h_pensil = 1000, h_bolpoint = 2000, h_penghapus = 500; 
    int jumlah_pensil, jumlah_bolpoint, jumlah_penghapus;
    
    int pendapatan(){
        return (jumlah_pensil * h_pensil) + (jumlah_bolpoint * h_bolpoint) + (jumlah_penghapus * h_penghapus);
    }
}   
}
