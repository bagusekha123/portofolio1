/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class namaclass {
  int a,b,c;
public namaclass(){
    a=1;
    b=2;
    c=3;
    
}  
    public void hasil(){
        System.out.print(a);
         System.out.print(b);
          System.out.print(c);
    }
      public static void main(String[] args){
          namaclass nc = new namaclass();
          nc.hasil();
      }
}
