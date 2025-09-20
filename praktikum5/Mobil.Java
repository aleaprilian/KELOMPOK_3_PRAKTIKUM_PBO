package com.mycompany.praktikum5;

public class Mobil {
    //Atribut
    String merk;
    String warna;
    int tahunKeluar;

    //Constructor
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

    //Overloading
    public Mobil (){
        this.merk = merk;
        this.warna = warna;
        this.tahunKeluar = tahunKeluar;
    }
    
    //Method 
    public void panaskanMobil(){
        System.out.println("Mobil sedang dipanaskan");
    }
    
}
