/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab16soal1;

/**
 *
 * @author Nadia Rusdiana
 */
abstract class OperasiAritmatika {
    protected double A = 9.5;
    protected double B = 2.5;

    protected abstract double penjumlahan();
    protected abstract double pengurangan();
    protected abstract double perkalian();
    protected abstract double pembagian();
}
class Kalkulator extends OperasiAritmatika {

    @Override
    protected double penjumlahan() {
        return A + B;
    }

    @Override
    protected double pengurangan() {
        return A - B;
    }

    @Override
    protected double perkalian() {
        return A * B;
    }

    @Override
    protected double pembagian() {
        return A / B;
    }
}