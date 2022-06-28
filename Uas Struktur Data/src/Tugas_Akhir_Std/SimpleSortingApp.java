/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir_Std;

/**
 *
 * @author ASUS
 */
public class SimpleSortingApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray2 arr = new HighArray2(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(77);
        arr.display();
        System.out.println("Bubble Sort ");
        arr.BubbleSort();
        arr.display();
    }
}
