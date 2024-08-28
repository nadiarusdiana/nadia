/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal1;

/**
 *
 * @author Nadia Rusdiana
 */
import java.util.Scanner;
public class Bab17Soal1 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); 

        String[] kota = new String[jumlahKota];
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine();
        }
        System.out.println("\nKota-kota yang dimasukkan:");
        for (int i = 0; i < kota.length; i++) {
            System.out.println(kota[i]);
        }

        // Menutup scanner
        scanner.close();
    }
}