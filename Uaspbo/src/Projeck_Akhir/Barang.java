package Projeck_Akhir;
public class Barang {
public Barang()
 {
 kode = "FF10";
 nama = "Vertical Foregrip";
 stok = "100";
 harga = "2000";
 }

    String kode, nama, stok, harga;
 
 public void setkode(String Code)
 {
 this.kode=Code;
 }
 public void setnama(String Name)
 {
 this.kode=Name;
 }
 public void setstok(String Stock)
 {
 this.kode=Stock;
 }
 public void setharga(String Price)
 {
 this.kode=Price;
 }
 public String getkode()
 {
 return kode;
 }
 public String getnama()
 {
 return nama;
 }
 public String getstok()
 {
 return stok;
 }
 public String getharga()
 {
 return harga;
 }
}    
