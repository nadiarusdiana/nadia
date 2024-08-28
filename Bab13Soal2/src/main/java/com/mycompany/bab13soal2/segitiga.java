/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab13soal2;

/**
 *
 * @author Nadia Rusdiana
 */
class Segitiga {
    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
    public double hitungLuas(double sisiA, double sisiB, double tinggi) {
        double alas = (2 * sisiA) / sisiB;
        return (alas * tinggi) / 2;
    }
}