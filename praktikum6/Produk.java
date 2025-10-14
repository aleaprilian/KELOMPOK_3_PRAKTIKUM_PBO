
package com.mycompany.praktikum6;
//
public class Produk {
    public String nama;
    private int harga;
    protected int stok;
    private final String namaSupplier = "abang";
    //konstruktor
    public Produk (String nama, int harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    private void namaSupplier (){
        System.out.println("nama" + namaSupplier);
    }
    
    public void namaSupplierFix(){
        namaSupplier();
    }
    public void tampilkanInfo (){
        System.out.println("nama: " +nama);
        System.out.println("harga: " +harga);
        System.out.println("stok: " +stok);
    }
}
