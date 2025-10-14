package com.mycompany.latihan6;

public class Latihan6 {

    public static void main(String[] args) {
        Rekening rek = new Rekening("gta", 2500000);
        System.out.println("Nama Nasabah : " + rek.namaNasabah);
        System.out.println(rek.getSaldo());
        rek.setSaldo(300000);
        System.out.println("Penambahan Saldo Berhasil...");
        System.out.println(rek.getSaldo());

        Bank.tampilNamaBank();
        Bank bank1 = new Bank(50000);
        System.out.println("Saldo Minimum Akun Bank : " + bank1.getSaldo());

    }
}    
