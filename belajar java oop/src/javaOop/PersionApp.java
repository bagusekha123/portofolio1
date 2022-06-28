package javaOop;
public class PersionApp {
public static void main(String[] args) {
Pesion persion1 = new Pesion("Ida Bagus Kresnayana Eka","Jalan gora Lingkungan seksari "
        + "Kelurahan Cakra Negara Utara "
        + "kecamatan cakra Negara "
        + "Kota Mataram Provinsi NTB");
// tidak bisa karena bersifat final persion1.contry = "America";
System.out.println("Nama Saya :"+persion1.Name);
System.out.println("Alamat Saya"+persion1.Adress);
System.out.println("Negara Saya :"+persion1.contry);
persion1.sayHello("Budi");
Pesion persion2 = new Pesion("Budi");
persion2.sayHello("Eka");
}
   
}
