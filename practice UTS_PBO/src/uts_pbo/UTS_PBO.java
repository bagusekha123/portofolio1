package uts_pbo;

public class UTS_PBO {

    public static void main(String[] args) {
        tas bag = new tas();
        
   
        backpack bakpak = new backpack();
        bakpak.setJenisTas("backPack");
        bakpak.setwarnaDasar("Biru");
        bakpak.setBahan("plastik");
        bakpak.setHargaJual(10000);
        bakpak.setDiskon(1);
        bakpak.setKantong(860);
        bakpak.cetakInfo();
        bakpak.getBahan();
        //bakpak.print();
        System.out.println("=======================");
        System.out.println("jumlah kantong : " +bakpak.getjumlahKantong());
        System.out.println("persen diskon : " +bakpak.persenDiskon());
        System.out.println("potongan diskon : "+bakpak.potonganDiskon());
        /**
         * bag.setJenisTas("BackPack"); bag.setwarnaDasar("Hijau");
         * bag.setBahan("plastik"); bag.setHargaJual(20000); bag.setDiskon(20);
         * bag.cetakInfo();
       *
         */
    }

}
