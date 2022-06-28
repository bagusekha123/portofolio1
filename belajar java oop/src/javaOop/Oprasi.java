package javaOop;
public class Oprasi {
double bil1,bil2;

    public double getBil1() {
        return bil1;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }
double Tambah(){
    return bil1 + bil2;
}
double Kurang(){
    return bil1 - bil2;
  }
double KAli(){
    return bil1 * bil2;
}
double Bagi(){
    return bil1 / bil2;
}
}
