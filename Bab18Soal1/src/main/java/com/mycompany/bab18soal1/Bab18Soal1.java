/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab18Soal1 {

 
    public static void main(String[] args) {
          try {
            int a = 10;
            int b = 0;
            int result = a / b; // Akan menyebabkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat membagi dengan nol!");
        }

        System.out.println("Program tetap berjalan setelah penanganan exception.");
    }
}