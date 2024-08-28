/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
        int nilaiAwal = 3;
        int nilaiAkhir = 15;
        int pertambahan = 5;
        
        System.out.println("Masukan bilangan awal  : " + nilaiAwal);
        System.out.println("Masukan bilangan akhir : " + nilaiAkhir);
        System.out.println("Hasil deret bilangan   :");
        
        for (int i = nilaiAwal; i <= nilaiAkhir; i += pertambahan) {
            if (i > nilaiAwal) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
       
    }
}

