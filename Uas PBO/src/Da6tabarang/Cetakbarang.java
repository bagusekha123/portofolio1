package Da6tabarang;
public class Cetakbarang {
public static void main(String[] args) {
Barang obj = new Barang(); 
 obj.setKode("FF01"); 
 obj.setNama("Asus Zenfone 3");
 obj.setStok("100");
 obj.setHarga("4000000");
 
 System.out.println("Kode Barang ="+ obj.getKode());
 System.out.println("Nama Barang ="+ obj.getNama());
 System.out.println("Stok Barang ="+ obj.getStok());
 System.out.println("Harga Barang ="+ obj.getHarga());
 }
    }
    
}
