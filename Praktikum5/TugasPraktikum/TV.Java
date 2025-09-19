package com.mycompany.tugaspraktikum5;

public class TV {
    String merk;
    int ukuran;
    String tipeLayar;
    int tahunProduksi;
    
    public TV() {
        this.merk = "Samsung";
        this.ukuran = 43;
        this.tipeLayar = "OLED";
        this.tahunProduksi = 2023;
    }
    public TV(String merk, int ukuran, String tipeLayar, int tahunProduksi) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.tipeLayar = tipeLayar;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void info() {
        System.out.println("Merk          : " + merk);
        System.out.println("Ukuran Layar  : " + ukuran + " Inch" );
        System.out.println("Tipe layar    : " + tipeLayar);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
    
    public void info(String pemilik){
        System.out.println("TV milik " + pemilik + " adalah : " + merk + "ukuran " + ukuran + " Inch " + tipeLayar);
    }
}
 
