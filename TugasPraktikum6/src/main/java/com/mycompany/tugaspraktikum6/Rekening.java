/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum6;

/**
 *
 * @author Faridz Talbi
 */
public class Rekening {
    public String namaNasabah;
    private int saldo;
    
    Rekening(String namaNasabah, int saldo) {
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        System.out.print("Saldo Nasabah : ");
        return saldo;
    }
}

