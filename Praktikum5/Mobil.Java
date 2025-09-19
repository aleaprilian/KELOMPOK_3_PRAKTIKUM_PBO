package com.mycompany.praktikum5;
public class Mobil {
   
    String merk;
    String warna;
    int tahunKeluar;

    public Mobil(String merk, String warna, int tahunKeluar){
        this.merk = merk;
        this.warna = warna;
        this.tahunKeluar = tahunKeluar;
    }

    public void tampilkanMobil(){
        System.out.println("mobil: " + merk);
        System.out.println("warna: " + warna);
        System.out.println("tahun: " + tahunKeluar);
    }

    public Mobil (){
        this.merk = "Unknown";
        this.warna = "Putih";
        this.tahunKeluar = 2010;
    }

    public void panaskanMobil(){
        System.out.println("Mobil sedang dipanaskan");
   }
}
