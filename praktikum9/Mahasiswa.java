/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum9;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nama;
    private String NIM;
    private String Prodi;
    private String jenisKelamin;
    private boolean active;

    public static ArrayList <Mahasiswa> mahasiswas = new ArrayList<>();
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Mahasiswa(String nama, String NIM, String Prodi, String jenisKelamin, boolean active) {
        this.nama = nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.jenisKelamin = jenisKelamin;
        this.active = active;
    }
    
    
}
