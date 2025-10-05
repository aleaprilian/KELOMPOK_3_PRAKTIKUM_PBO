/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum6;

/**
 *
 * @author Faridz Talbi
 */
public class Bank {
    private int saldo;
    static String namaBank = "BNI";

    Bank(int saldo){
        this.saldo = saldo;
    }

    public static void tampilNamaBank() {
        System.out.println("Nama Bank : " + namaBank);
    }

    public int getSaldo(){
        return saldo;
    }
}