package Tugas_Akhir_Std;

class Bubleshort {
    private int[] arr; 
    private int nElemen;
    public Bubleshort(int max) { 
        arr = new int[max];
        nElemen = 0;
    }
    public void insert(int value) { 
        arr[nElemen] = value; 
        System.out.println(value +" telah ditambahkan pada index ke "+nElemen);
        nElemen++;
    }
    public void BubbleSort() { 
        int batas, i;
        int iterasi=1;
        for (batas = nElemen-1; batas>0; batas--) { 
            System.out.println("Iterasi ke "+iterasi++);
            for (i = 0; i < batas; i++) {
                 for (int k = 0; k < nElemen; k++) { 
                     System.out.print(arr[k] + " ");
                 }
                 System.out.println("");
                 if (arr[i] < arr[i + 1]) { 
                     swap(i, i + 1);
                 }
            }
        }
        System.out.println("");
    }

    public void swap(int one, int two) { 
        int temp = arr[one];
        arr[one] = arr[two]; 
        arr[two] = temp;
    }
    public void display() {
        for (int i = 0; i < nElemen; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}