package Projeck_Akhir;
public class Cetak {
public static void main(String[] args) {
 Barang obj = new Barang(); 
 obj.setkode("FF01"); 
 obj.setnama("Asus Zenfone 3");
 obj.setstok("100");
 obj.setharga("4000000");
 
 System.out.println("Kode Barang ="+ obj.getkode());
 System.out.println("Nama Barang ="+ obj.getnama());
 System.out.println("Stok Barang ="+ obj.getstok());
 System.out.println("Harga Barang ="+ obj.getharga());
 }
}
    
}
