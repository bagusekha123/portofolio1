package uts_pbo;

class tas {

    public String jenisTas, warnaDasar, Bahan;
    public double hargaJual, persenDiskon;

    public void setJenisTas(String jenis) {
        jenisTas = jenis;
    }

    public void setwarnaDasar(String warna) {
        warnaDasar = warna;
    }

    public void setBahan(String bahan) {
        Bahan = bahan;
    }

    public void setHargaJual(double harga) {
        hargaJual = harga;
    }

    public void setDiskon(double diskon) {
        persenDiskon = diskon;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public double getDiskon() {
        return persenDiskon;
    }

    public String getJenisTas() {
        return jenisTas;
    }

    public String getwarnadasar() {
        return warnaDasar;
    }

    public String getBahan() {
        return Bahan;
    }

    public void cetakInfo() {
        System.out.println("Jenis Tas  : " + getJenisTas());
        System.out.println("Warna Tas : " + getwarnadasar());
        System.out.println("Bahan Tas : " + getBahan());
        System.out.println("Harga Jual  : " + getHargaJual());
        System.out.println("Persen Diskon : " + getDiskon() + "%");

    }

}

class backpack extends tas {

    public int jumlahKantong;
    double diskon;

    public void setKantong(int jumlahkantong) {
        jumlahKantong = jumlahkantong;
    }

    public int getjumlahKantong() {
        return jumlahKantong;
    }

    public double persenDiskon() {
        return ((50/jumlahKantong)+4)/100;
    }

    public double potonganDiskon() {
        return persenDiskon * hargaJual;
    }

    public void print() {

        System.out.println("jumlah kantong : " + getjumlahKantong() + " kantong");
    }
}


