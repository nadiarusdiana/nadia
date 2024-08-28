/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal2;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab13Soal2 {

    public static void main(String[] args) {
          Segitiga segitiga = new Segitiga();

        double luas1 = segitiga.hitungLuas(5.0, 8.0);
        System.out.println("Luas Segitiga (alas x tinggi / 2): " + luas1);
        double luas2 = segitiga.hitungLuas(4.0, 3.0, 6.0);
        System.out.println("Luas Segitiga (sisi x tinggi / 2): " + luas2);
    }
}