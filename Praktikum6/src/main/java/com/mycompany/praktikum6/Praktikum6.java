/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum6;

/**
 *
 * @author Faridz Talbi
 */
public class Praktikum6 {
    public static void main(String[] args) {
        //inisiasi object
        Produk produk1 = new Produk("Pakaian",250000,10);
        Produk produk2 = new Produk("Aksesoris",150000,20);

        //pemanggilan attribut serta method class Product
        System.out.println("Nama Produk 1 : " + produk1.nama);
        System.out.println("Harga : " + produk1.getHarga());
        produk1.setHarga(300000);
        System.out.println("Harga baru untuk produk 1 : " + produk1.getHarga());
        produk1.namaSupplierFix();
        Produk.infoJumlahProduk();
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }
}

//        Rekening rek = new Rekening("Ale", 2500000);
//        System.out.println("Nama Nasabah : " + rek.namaNasabah);
//        System.out.println(rek.getSaldo());
//        rek.setSaldo(300000);
//        System.out.println("Penambahan Saldo Berhasil...");
//        System.out.println(rek.getSaldo());
//
//        Bank.tampilNamaBank();
//        Bank bank1 = new Bank(50000);
//        System.out.println("Saldo Minimum Akun Bank : " + bank1.getSaldo());
  
