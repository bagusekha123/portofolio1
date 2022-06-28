package Da6tabarang;
public class Cetak_transaksi {
public static void main(String[] args) {
Transaksi obj = new Transaksi();
obj.setid("Tr12");
obj.setjumlah(100);
obj.setharga(600000);
obj.setpembayaran(700000);
    System.out.println("Id Transaksi ="+ obj.getid());
    System.out.println("Jumlah Barang ="+ obj.getjumlah());
    System.out.println("harga Barang ="+ obj.getharga());
    System.out.println("Total Pembayaran ="+ obj.getpembayaran());
    
}
    
}
