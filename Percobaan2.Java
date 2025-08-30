package com.mycompany.praktikum2;

/**
 * @author Muhammad Firmansyah
 */
public class Praktikum2 {

    public static void main(String[] args) {
        //Menampilkan hello word
        System.out.println("Hello World");
        
        /*
        *Menampilkan nama
        */
        System.out.println("Nama Saya Muhammad Firmansyah");
        
        int umur;
        umur=19;
        
        String nama= "Muhammad Firmansyah";
        
        System.out.println("Nama saya : "+ nama);
        System.out.println("Umur saya : "+ umur);
        
        int x = 1, y = 3, z = 5;
        
        System.out.println(x + " " + y + " "+ z);
        
        double [] ipSemester = {3.9, 3.6, 3.7, 3.8}; 
        System.out.println("IP Semester 3 Saya adalah : " + ipSemester[2]);
        
        //konversi
        int intSemester1 = (int) ipSemester [2];
        System.out.println("Nilai IP Semester 3 dalam integer : " + intSemester1);
        
        long nilaiSangatBesar = 300000000000l;
        int intNilaiSangatBesar = (int) nilaiSangatBesar;
        System.out.println("Nilai Long sebelum di konversi ke integer adalah " + nilaiSangatBesar);
        System.out.println("Nilai Long setelah di konversi ke integer adalah " + intNilaiSangatBesar);
        
        //nilai konstanta
        
        final double PI = 3.14;
        //PI = 3.5;
        System.out.println("nilai PI = " + PI);

           }
}
