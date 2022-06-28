package Tugas_Akhir_Std;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Arrays;
public class Pengurutan_DataMahasiswa {
public static void main(String[] args) {
int[] Nim = {3,2,6,4,8,7,9,1,5,10};
      char[] Nama = {'d', 'c', 'g', 'f', 'i', 'a', 'b', 'h', 'e'};
 
      String tampilan;
      JTextArea areaTampilan;
 
      // Menampilkan elemen larik integer
      tampilan = "Menampilkan elemen larik integer :\n";
      for (int x = 0; x < Nim.length; x++)
         tampilan += Nim[x] + "   ";
 
      Arrays.sort(Nim);
 
      // Menampilkan elemen larik integer setelah diurutkan
      tampilan += "\nMenampilkan elemen larik integer setelah diurutkan :\n";
      for (int x = 0; x < Nama.length; x++)
         tampilan += Nama[x] + "   ";
 
      // Menampilkan elemen larik karakter
      tampilan += "\n\nMenampilkan elemen larik karakter :\n";
      for (int x = 0; x < Nama.length; x++)
         tampilan += Nama[x] + "   ";
 
      Arrays.sort(Nama);
 
      // Menampilkan elemen larik karakter setelah diurutkan
      tampilan += "\nMenampilkan elemen larik karakter setelah diurutkan :\n";
      for (int x = 0; x < Nama.length; x++)
         tampilan += Nama[x] + "   ";
 
      areaTampilan = new JTextArea();
      areaTampilan.setText(tampilan);
      JOptionPane.showMessageDialog(null, areaTampilan, "Mengurutkan Elemen Larik",
         JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri aplikasi
      System.exit(0);
System.out.println(Nim + ""+Nama);       
}
    
}
    

