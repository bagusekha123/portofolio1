package Tugas_Akhir_Std;
class Mahasiswa{
 private String[][] arr;
    private int nElemen;
    private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa (int Max){
         arr = new String[Max][3];
         
        nElemen = 0;
       
    }    
    
        public void insert(String nim, String nama, String alamat) { 
        arr[nElemen][0] = nim;
        arr[nElemen][1] = nama;
        arr[nElemen][2] = alamat;
        System.out.println("nim: "+nim +", nama: "+nama+", alamat: "+alamat+" telah ditambahkan pada index ke "+nElemen);
        nElemen++;
    }
     public void BubbleSort() { 
        int batas, i;
        int iterasi=1;
        int hasilperbandingan;
        String Nama1;
        String Nama2;
        //arr1 = new String[1][3];
        for (batas = nElemen-1; batas>0; batas--) { 
            System.out.println("Iterasi ke "+iterasi++);
            for (i = 0; i < batas; i++) {
                 for (int k = 0; k < nElemen; k++) { 
//                     System.out.print(arr[k] + " ");
                 }
//            System.out.println(Integer.valueOf(arr[i][0]) < Integer.valueOf(arr[i+1][0]));
// 

//System.out.println(arr[i+1][0]);
Nama1=arr [i][1];
Nama2=arr[i+1][1];
hasilperbandingan=Nama1.compareTo(Nama2);
if (hasilperbandingan>0) { 
                     swap(i, i + 1);
                     
                 }
            }
        }
        System.out.println("");
    }
     public void swap(int one, int two) { 
        String temp[] = new String[1];
        temp = arr[one];
        arr[one] = arr[two]; 
        arr[two] = temp;
    }
    public void display() {
        for (int i = 0; i < nElemen; i++) { 
            System.out.println("Nim: "+arr[i][0] + ", Nama: "+arr[i][1]+", asal: "+arr[i][2]);
        }
//        System.out.println("");
    }

}
    
public class Data_Mahasiswa {
public static void main(String[] args) {
         int maxSize = 100;
        Mahasiswa arr;
        arr = new Mahasiswa(maxSize);
        arr.insert("1660270", "Agung", "Madium");
        arr.insert("1660230", "Sofy", "Semarang");
        arr.insert("1660280","Arina","MAlang");
        arr.insert("1660260","Helmi" ,"Madura");
        arr.insert("1660220","Tamail","Banyuwangi");
        arr.insert("1660240","Dinda","Bandung");
        arr.insert("1660250","RAis","Ambon");
        arr.insert("1660200","Jundi","Mallang");
        arr.insert("1660210","Ahmad", "Sidoarjo");
        arr.display();
        System.out.println("Bubble Sort ");
        arr.BubbleSort();
        arr.display();
    }
    
}

    

