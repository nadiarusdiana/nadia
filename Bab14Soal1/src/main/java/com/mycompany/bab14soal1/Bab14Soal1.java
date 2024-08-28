/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal1;

/**
 *
 * @author Nadia Rusdiana
 */
public class Bab14Soal1 {

    public static void main(String[] args) {
        AbstrakHewan kucing = new Kucing();
        AbstrakHewan anjing = new Anjing();
        
        System.out.println("Kucing:");
        kucing.suara();  
        kucing.suara2(); 
        
        System.out.println("Anjing:");
        anjing.suara();  
        anjing.suara2(); 
    }
}