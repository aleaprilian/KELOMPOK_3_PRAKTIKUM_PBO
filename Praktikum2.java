package com.mycompany.praktikum3;

import java.util.Scanner;

/**
 *
 * @author ale 
 */
public class Praktikum3 {

    public static void main(String[] args) {
        
        // Operator Aritmatika
        int a = 10, b = 2;
        System.out.println("Tambah (+) : " + (a + b));
        System.out.println("Kurang (-) : " + (a - b));
        System.out.println("Kali (*) : " + (a * b));
        System.out.println("Bagi (/) : " + (a / b));
        System.out.println("Modulus (%) : " + (a % b));
        
        // Operator Perbandingan
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        
        // Operator Logika
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
        
        // Operator Assignment
        int i = 10;
        i+= 2;
        System.out.println("i += 2 : " + i);
        
        // Operator Ternary
        int nilai = 80;
        char grade = (nilai >= 80) ? 'A' : (nilai >= 75) ? 'B' : 'C';
        System.out.println("Nilai : " + grade);
        
        // Operator Bitwise
        int m = 12, n = 10;
        System.out.println("m & n = " + (m & n));
        
        // Penggunaan System.out
        System.out.println("Hello Word");
        System.out.print("Hello Word");
        System.out.println();
        
        // Output printf
        String nama = "ale";
        int umur = 25;
        double tinggi = 175.0f;
        System.out.printf("Halo saya %s, umur %d, tinggi %.1f cm", nama, umur, tinggi);
        System.out.println();
        
        // Input Menggunakan Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        nama = input.nextLine();
        System.out.print("Masukan NIM: ");
        String nim = input.nextLine();
        
        System.out.println("Hallo nama saya " + nama);
        System.out.println("Nim saya " + nim);

        
        try {
            System.out.print("Masukkan umur : ");
            int umurUser = input.nextInt();
       
            System.out.println("Umur anda adalah : " + umurUser);
        }
        catch (Exception e) {
            System.out.println("Anda salah input");
        }
        
        // Class Wrapper
        String str = "18";
        int primitifInt = 100;
        int anotherWrapper = 200;
        int intUmur = Integer.parseInt(str);
        System.out.print("string : " + intUmur);
        Integer wrapperInt = primitifInt; // Autoboxing
        int anotherPrimitif = anotherWrapper; // Unboxing

        System.out.println();
        
        // Enumerasi
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        
        Hari hariIni = Hari.RABU ; 
        if (hariIni == Hari.RABU){
            System.out.println("benar, hari ini hari " + Hari.RABU);
        }
    }
}