/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8soal1;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab8soal1 {

    
    public static void main(String[] args) {
        int nilaiAwal = 5;
        int nilaiAkhir =100;
        
        System.out.println("Nilai Awal  ?: " + nilaiAwal);
        System.out.println("Nilai Akhir ?: " + nilaiAkhir);

        System.out.println("Hasilnya:");
        
        int counter = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(counter + ". " + i);
            counter++;
        }
    }
}