/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class barang3 {
private String kode_buku, judul, pengarang, penerbit, jumlah_buku, isbn, jenis_buku;
public void setkode_buku (String Data){
    this.kode_buku= Data; 
}
public void setjudul (String Data){
    this.judul= Data; 
}
public void setpengarang (String Data){
    this.pengarang= Data; 
}
public void penerbit (String Data){
    this.penerbit= Data; 
}
public void setjumlah_buku (String Data){
    this.jumlah_buku= Data; 
}
public void setisbn (String Data){
    this.isbn= Data; 
}
public void setjenis_buku (String Data){
    this.jenis_buku= Data; 
}
public String getkode_buku (){
    return this.kode_buku;
}
public String getjudul (){
    return this.judul;
}
public String getpengarang (){
    return this.pengarang;
}
public String getpenerbit (){
    return this.penerbit;
}
public String getjumlah_buku (){
    return this.jumlah_buku;
}
public String getisbn (){
    return this.isbn;
}
public String getjenis_buku (){
    return this.jenis_buku;
}
public static void main(String[] args) {
  barang toper = new barang();
  
    
    }
    
}
