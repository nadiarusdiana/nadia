/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab13soal1;

/**
 *
 * @author Nadia Rusdiana
 */
class Kalkulator {
    
    public int operasi(int a, int b) {
        return a + b;
    }
    public int operasi(int a, int b, String operasi) {
        if (operasi.equals("kurang")) {
            return a - b;
        }
        return 0;
    }
    public int operasi(int a, int b, double operasi) {
        return a * b;
    }
    public int operasi(double a, double b) {
        return (int) (a / b);
    }
}