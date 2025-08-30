package com.mycompany.praktikum2;

/**
 *
 * @author T. Syarifah Gita Azzahra (2407126242)
 */
public class Praktikum2 {

    public static void main(String[] args) {
        //Menampilkan hello word
        System.out.println("Hello World");
        
        /*
        *Menampilkan nama
        */
        System.out.println("nama saya gita");
        
        int umur;
        umur=20;
        
        String nama= "gita";
        
        System.out.println("nama saya : "+ nama);
        System.out.println("umur saya : "+ umur);
        
        int x = 1, y = 3, z = 5;
        
        System.out.println(x + " " + y + " "+ z);
        
        double [] ipSemester = {3.9, 3.7, 4.0, 4.0};
        
        System.out.println("IP semester 4 saya adalah : " + ipSemester[0]);
        
        //konversi
        int intSemester1 = (int) ipSemester [0];
        System.out.println("nilai IP semester 1 integer : " + intSemester1);
        
        long nilaiSangatBesar = 300000000000l;
        int intNilaiSangatBesar = (int) nilaiSangatBesar;
        System.out.println("Nilai Long Sebelum di konversi ke int ; " + nilaiSangatBesar);
        System.out.println("Nilai Long yang di konversi ke int ; " + intNilaiSangatBesar);
        
        //nilai konstanta
        
        final double PI = 3.14;
        //PI = 3.5;
        System.out.println("nilai PI: " + PI);
           }
}
