package javaOop; 
class bus extends Kendaraan {
double tiketpenumpang(){
    return getJumlah()* 5000;

}
double Tiketkendaraan(){
double tiket =5000;
return tiket;
}
double Pajak(){
    return (tiketpenumpang()+Tiketkendaraan())*0.02;
}
double total(){
    return Pajak()*tiketpenumpang()+Tiketkendaraan(); 
}
    
}
