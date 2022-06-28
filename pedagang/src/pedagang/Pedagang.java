package pedagang;
public class Pedagang { 
 int harga_pensil=1000;
 int harga_bolpoint=2000;
 int harga_penghapus=500;
 int jumlah_pensil=10,jumlah_penghapus=10,jumlah_bolpoint=5;
public void harga_pensil(){
    System.out.println("harga pensil="+harga_pensil);
}
public void harga_bolpoint(){
    System.out.println("harga pensil="+harga_bolpoint);
}
public void harga_penghapus(){
    System.out.println("harga pensil="+harga_penghapus);
}
public void jumlah_pensil(){
    System.out.println("harga pensil="+jumlah_pensil);
}
public void jumlah_bolpoint(){
    System.out.println("harga pensil="+harga_bolpoint);
}
public void jumlah_penghapus(){
    System.out.println("harga pensil="+jumlah_penghapus);
}
 public int penghasilan(){
    return (jumlah_pensil*harga_pensil)+(jumlah_bolpoint*harga_bolpoint)+(jumlah_penghapus*harga_penghapus) ;
} 
    
    
public static void main(String[] args) {
  Pedagang ahmad=new Pedagang();
  
    }
    
}
