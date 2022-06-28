/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusia2;

/**
 *
 * @author ASUS
 */
public class Manusia2 {
int tinggi =155;
String warna_kulit = "sawo matang";
void berjalan(){
    System.out.println("tegak");
}
void makan(){
    System.out.println("tegamengunyah");
}
void tidur(){
    System.out.println("terlentang");
}
int tinggi_orang(){
    return tinggi;
}
String warna_kulit_orang(){
    return warna_kulit;
}


    public static void main(String[] args) {
     Manusia2 ferdy = new Manusia2();
System.out.println("bagaimana cara ferdy berjalan");
ferdy.berjalan();
System.out.println("bagaimana cara ferdy tidur");
ferdy.tidur();
System.out.println("bagaimana cara ferdy makan");
ferdy.makan();
System.out.println("==============");
System.out.println("tinggi ferdy="+ferdy.tinggi_orang()+"cm");
System.out.println("warna kulit ferdy="+ferdy.warna_kulit_orang());


        
   
    }
    
}
