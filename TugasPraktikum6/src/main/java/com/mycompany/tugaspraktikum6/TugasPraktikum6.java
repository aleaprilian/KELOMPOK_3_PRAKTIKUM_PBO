/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikum6;

/**
 *
 * @author Faridz Talbi
 */
public class TugasPraktikum6 {
    public static void main(String[] args) {
        Rekening rek = new Rekening("Faridz", 2500000);
        System.out.println("Nama Nasabah : " + rek.namaNasabah);
        System.out.println(rek.getSaldo());
        rek.setSaldo(3000000);
        System.out.println("Penambahan Saldo Berhasil...");
        System.out.println(rek.getSaldo());
        Bank.tampilNamaBank();
        Bank bank1 = new Bank(50000);
        System.out.println("Saldo Minimum Akun Bank : " + bank1.getSaldo());
    }
}

