package Transaksi_Barang;
public class Biaya extends Transaksi{
@Override
    public int Uangkembalian(){
    return Total()-Uangdibayar;
}
    
}
