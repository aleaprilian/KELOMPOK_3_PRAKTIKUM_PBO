
package com.mycompany.latihan5;

public class Tas {
    String warna;
    String merk;
    int tahunProduksi;
    
    public Tas(){
        this.warna = "tidak tahu";
        this.merk = "tidak tahu";
        this.tahunProduksi = 0;
    }
    
    public Tas (String warna, String merk, int tahunProduksi){
        this.warna = warna;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    
    public void tampilkanTas(){
        System.out.println("warna: "+ warna);
        System.out.println("merk: "+ merk);
        System.out.println("tahun produksi: "+ tahunProduksi);
        System.out.println();
    }
    
    public void isiTas(String barang){
        System.out.println(barang + " dimasukan ke dalam tas");
    }
    public void isiTas(String barang, int jumlah){
        System.out.println(jumlah + " " + barang + " dimasukan ke dalam tas");
    }
    
}
