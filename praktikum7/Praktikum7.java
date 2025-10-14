package com.mycompany.praktikum7;

public class Praktikum7 {

    public static void main(String[] args) {
       BarangElektronik laptop = new BarangElektronik("Laptop", 12000000, 12);
        laptop.tampilkanInfo();        // method dari superclass
        laptop.tampilkanGaransi();     // method dari subclass

        Produk p1 = new Produk("Buku", 15000);
        BarangElektronik p2 = new BarangElektronik("Mouse", 150000, 12);

        p1.tampilkanInfo();
        System.out.println("Pajak Produk Umum : " + p1.hitungPajak());
        System.out.println("Harga Akhir Produk : " + p1.hitungHarga());
        System.out.println("---------------------------");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak Barang Elektronik : " + p2.hitungPajak());
        System.out.println("Harga Akhir Produk : " + p2.hitungHarga());
    }
}
