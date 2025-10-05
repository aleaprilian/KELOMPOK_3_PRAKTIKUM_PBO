package com.mycompany.praktikum6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Faridz Talbi
 */
public class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private String namaSupplier = "Faridz";
    static int jumlahProduk = 0;

    public Produk(String nama,double harga,int stok){
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
            jumlahProduk++;
    }

    public String getNama(){
        return this.nama;
    }

    private void namaSupplier(){                            //method private
        System.out.println("Nama Supplier : "  + namaSupplier);
    }


    public void namaSupplierFix(){
        namaSupplier();
    }       //method perantara

    public void tampilkanInfo(){
        System.out.println("Nama Produk : " + nama);        //method public
        System.out.println("Harga Produk : " + harga);
        System.out.println("Stok Produk : " + stok);
    }

    public String setNamaSupplier(String namaSupplier) {
        return this.namaSupplier = namaSupplier;

    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double hargaBaru){
        if(hargaBaru>0){
            this.harga = hargaBaru;
        }else if(hargaBaru == 0){
            this.harga = hargaBaru;
            System.out.println("Produk ini gratis.");
        }else{
            System.out.println("Harga produk tidak boleh negatif.");
        }

    }
        public static void infoJumlahProduk(){
        System.out.println("Total produk yang telah dibuat : " + jumlahProduk);
        }


    }