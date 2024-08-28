/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soal2;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab15Soal2 {

    class KalkulatorKurang {
        public int kurang(int a, int b) {
            return a - b;
        }
    }

    // Kelas KalkulatorBagi sebagai inner class
    class KalkulatorBagi {
        public int bagi(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
            }
            return a / b;
        }
    }

    // Kelas KalkulatorKali sebagai inner class
    class KalkulatorKali {
        public int kali(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
         Bab15Soal2 program = new Bab15Soal2();

        // Membuat objek dari masing-masing inner class
        KalkulatorKurang kurang = program.new KalkulatorKurang();
        KalkulatorBagi bagi = program.new KalkulatorBagi();
        KalkulatorKali kali = program.new KalkulatorKali();

        // Melakukan operasi
        int hasilKurang = kurang.kurang(10, 5);
        int hasilBagi = bagi.bagi(10, 2);
        int hasilKali = kali.kali(10, 5);

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        System.out.println("Hasil Perkalian: " + hasilKali);
    }
}