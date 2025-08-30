/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_2;

/**
 *
 * @author Raja Muhammad Faridz Talbi 2407111265
 */
public class Praktikum_2 {

    public static void main(String[] args) {
        // menampilkan hello word 
        System.out.println("Hello World!");
        
        /* 
             untuk menampilkan nama 
        */
        System.out.println(" Nama saya Faridz ");
        
    int umur; // inisialisasi
        umur = 20; // deklarasi 
        
        String nama = " Raja Muhammad Faridz Talbi";
        
        System.out.println(" Nama Saya " + nama);
        System.out.println(" umur saya " + umur);
        
    int x = 1, y = 3, z = 5;
        
        System.out.println( x + "  " + y + "  "+ z );
    // array
    double[] IpSemester = {3.9, 4.0, 3.4};
        System.out.println(" ip semester 3 saya adalah: " + IpSemester[1]);
    
    // Konversi 
    
    int intSemester1 = (int) IpSemester[0];
        System.out.println(" Nilai Ip Semester 1 Integer : " + intSemester1);
        
    long nilaiSangatBesar = 300000000000l;
    int intNilaiSangatBesar = (int) nilaiSangatBesar;
        System.out.println(" Nilai Long Sebelum di konversi ke int ; " + nilaiSangatBesar);
        System.out.println(" Nilai Long yang di konversi ke int ; " + intNilaiSangatBesar);
        
        
    //konstanta
    final double PI = 3.14;
        //PI = 3.17;
        System.out.println(" Nilai PI : " + PI);
        
    }
}
