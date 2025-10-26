/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo;

/**
 *
 * @author Faridz Talbi
 */
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    int tahunMasuk;
    
    public Mahasiswa(String nama, String nim, String prodi, int tahunMasuk){
        this.nama = nama;
        this.nim  = nim;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }
        
    public void tampilBio(){
        System.out.println("Nama " + nama + ", Program Studi " + prodi + ", Tahun masuk ");
    }
    
    public void tampilBio (String nama){
        System.out.println("Nama" + nama + ", NIM " + nim);
        
    }
    
    
    
}
