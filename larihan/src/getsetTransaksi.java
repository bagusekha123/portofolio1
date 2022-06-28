/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class getsetTransaksi {
    public double harga, jumlah,jml_uang;
    public String id;
    
    public void setid(String Id){
        this.id = Id;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public void setJumlahUang(double Jumlah){
        this.jml_uang = jumlah;
    }
    
    public void setJumlahBarang(double jumlah_barang){
        this.jumlah = jumlah_barang;
    }
    
    
    public double getHargaBarang(){
        return harga;
    }
    
    public double getJumlahBarang(){
        return jumlah;
    }
    
    public double getJumlahUang(){
        return jml_uang;
    }
    
    public double total(){
        return (getJumlahBarang() * getHargaBarang());
    }
    
    public double kembalian(){
        return (total() - getJumlahUang());
    }
}
