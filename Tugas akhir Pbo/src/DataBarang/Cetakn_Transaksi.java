package DataBarang;
public class Cetakn_Transaksi {
public static void main(String[] args) {
n_Transaksi obj= new n_Transaksi();
obj.setId("ff001");
obj.setJumlah(20);
obj.setHarga(100000);
obj.setPembayaran(400000);
    System.out.println("Id Transaksi ="+ obj.getId());
    System.out.println("Jumlah Barang ="+ obj.getJumlah());
    System.out.println("Hrga Barang ="+ obj.getHarga());
    System.out.println("Uang Bayar"+ obj.getPembayaran());
    }
    
}
