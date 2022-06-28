package UAS_PBO;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bangun_Datar Balok = new Bangun_Datar();
        Balok.setPanjang(10);
        Balok.setLebar(5);
        System.out.println("Luas Balok:"+ Balok.getLuas);
     
       SegiTiga st = new SegiTiga();
       st.setAlas(5);
       st.setTinggi(7);
       System.out.println("Luas segitiga: " + st.getLuas());
        
       Lingkasan l = new Lingkasan();
        l.setDiameter(10);
        System.out.println("Luas lingkaran: " + l.getLuas());
        
        Travesium t = new Travesium();
        t.setPanjang(15);
        t.setPanjangAtas(10);
        t.setLebar(4);
        System.out.println("Luas trapesium: " + t.getLuas());
    }
        
        
    }
    
    

