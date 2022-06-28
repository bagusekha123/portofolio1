/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Java_awal {
  int a,b,c;  
public void java(){
    System.out.println("Selamat Belajar");
}
public void setAngkasatu(int angka1){
    this.a = angka1;
    
}
public int getAngkasatu(){
    return a;
}
public void setAngkadua(int angka2){
    this.b = angka2;
    
}
public int getAngkadua(){
    return b;
}
public void setAngkatiga(int angka3){
    this.c = angka3;
    
}
public int getAngkatiga(){
    return c;
}
public void CetakInfo(){
    System.out.println("Nilai A:"+ this.a);
    System.out.println("Nilai B:"+ this.b);
    System.out.println("Nilai C:"+ this.c);
}
public int getPerjumlahan2Angka(){
    return a + b;
    
}
public int getPerjumlahanAngka(){
    return a+c;
}

public static void main(String[] args) {
  Java_awal b = new Java_awal();
  b.java();
  b.setAngkasatu(3);
  b.setAngkadua(2);
  b.setAngkatiga(6);
  b.CetakInfo();
  b.getPerjumlahan2Angka();
  
    }
    
}
