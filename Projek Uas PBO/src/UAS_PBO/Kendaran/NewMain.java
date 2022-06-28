package UAS_PBO.Kendaran;
public class NewMain {
public static void main(String[] args) {
Kendaraan Criss = new Kendaraan();
Criss.SetJenis("Roda empat dan roda dua");
Criss.Setbiaya_tiket_kendaraan(45500);
Criss.Setbiaya_tiket_perpenumpang(25000);
Criss.Setjumlah_penumpang(4);
System.out.println("Total Biaya"+ Criss.getTotalBiaya());
      
Buss   st = new Buss();
 st.setJeniskendaraan("Roda Empat");
       st.setJumlahPenumpang(15);
       st.setbiayatiketkendaraan(1600000);
       st.setbiayatiketperpenumpang(100000);
       System.out.println("Luas segitiga: " + st.getTotalBiaya());
        
       Mini_Bus l = new Mini_Bus();
       l.setJeniskendaraan("Roda Empat");
       l.setJumlahPenumpang(5);
       l.setbiayatiketkendaraan(600000);
       l.setbiayatiketperpenumpang(75500);
       System.out.println("Biaya Total MiniBus: " + l.getTotalBiaya());
             
       Mobil t = new Mobil();
        t.setJeniskendaraan("Ruda Empat");
        t.setJumlahPenumpang(4);
        t.setbiayatiketkendaraan(25000);
        t.setbiayatiketperpenumpang(20000);
        System.out.println("Luas trapesium: " + t.getTotalBiaya());
        
        Sepeda_Motor d = new Sepeda_Motor();
        d.setJeniskendaraan("Ruda Dua");
        d.setJumlahPenumpang(3);
        d.setbiayatiketkendaraan(10000);
        d.setbiayatiketperpenumpang(5000);
        System.out.println("Luas trapesium: " + d.getTotalBiaya());
    }
          

    }
    
}
