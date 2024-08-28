/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal1;

/**
 *
 * @author Nadia Rusdiana
 */
 
 public class Bab13Soal1 {

    public static void main(String[] args) {
         Kalkulator kalkulator = new Kalkulator();

        int hasilTambah = kalkulator.operasi(20, 10);
        int hasilKurang = kalkulator.operasi(10, 20, "kurang");
        int hasilKali = kalkulator.operasi(20, 10, 2.0);
        int hasilBagi = kalkulator.operasi(20.0, 10.0);

        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}