/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal1;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab11Soal1 {

     public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("0001", "Sulaiman", "A", "Manager", 3000000.0);
        Karyawan karyawan2 = new Karyawan("0002", "Putri", "B", "Staff", 3500000.0);

        System.out.println("Informasi Karyawan 1:");
        karyawan1.tampilkanInfo();

        System.out.println("Informasi Karyawan 2:");
        karyawan2.tampilkanInfo();
    }
}
    