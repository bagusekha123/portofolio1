package Kendaraanku12;
class NewMain {
public static void main(String[] args) {
Kendaraan Toper = new Kendaraan();
Toper.SetJenis("Roda empat dan roda dua");
Toper.Setbiaya_tiket_kendaraan(2315000);
Toper.Setbiaya_tiket_perpenumpang(250000);
Toper.Setjumlah_penumpang(27);
Toper.SetJumlahKendaraan(4);
Toper.CetakInfo();
System.out.println("Total Biaya"+ Toper.getTotalBiaya());
      
Buss   Michle = new Buss();
 Michle.setJeniskendaraan("Roda Empat");
Michle.setJumlahPenumpang(15);
 Michle.setbiayatiketkendaraan(1600000);
 Michle.setbiayatiketperpenumpang(150000);
 System.out.println("Total Biaya Buss : " + Michle.getTotalBiaya());
        
 Mini_Buss Putu = new Mini_Buss();
 Putu.setJeniskendaraan("Roda Empat");
 Putu.setJumlahPenumpang(5);
 Putu.setbiayatiketkendaraan(600000);
 Putu.setbiayatiketperpenumpang(75500);
 System.out.println("Biaya Total Mini Bus: " + Putu.getTotalBiaya());
             
 Mobil Diah = new Mobil();
 Diah.setJeniskendaraan("Ruda Empat");
 Diah.setJumlahPenumpang(4);
 Diah.setbiayatiketkendaraan(100000);
 Diah.setbiayatiketperpenumpang(20000);
 System.out.println("Biaya Total Mobil: " + Diah.getTotalBiaya());
        
 Sepeda_Motor Padme = new Sepeda_Motor();
 Padme.setJeniskendaraan("Ruda Dua");
 Padme.setJumlahPenumpang(3);
 Padme.setbiayatiketkendaraan(15000);
 Padme.setbiayatiketperpenumpang(5000);
 System.out.println("Biaya Total Sepeda Motor: " + Padme.getTotalBiaya());
 
    
}
          
   

    }
    
