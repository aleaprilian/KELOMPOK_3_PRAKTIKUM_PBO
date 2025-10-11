/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum7;

/**
 *
 * @author Faridz Talbi
 */
public class Praktikum7 {

    public static void main(String[] args) {
       // BarangElektronik p1 = new BarangElektronik ("Laptop", 700000, 12);
        Produk p1 = new Produk ("Buku", 1500000);
        Produk p2 = new BarangElektronik ("Mouse", 1500000, 12);
        p1.tampilkanInfo();
        System.out.println("Pajak Produk biasa : " + p1.hitungPajak());
        System.out.println("Harga Akhir produk : " + p1.hitungHarga());
        System.out.println("-------------------------");
        p2.tampilkanInfo();
        System.out.println("Pajak Produk Elektronik : " + p2.hitungPajak());
        System.out.println("Harga Akhir produk : " + p2.hitungHarga());


       // p1.tampilkanGaransi();
    }
}
