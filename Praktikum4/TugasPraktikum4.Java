package com.mycompany.praktikum4;
 import java.util.Scanner;

/**
 *
 * @author Fraidz
 */
public class TugasPraktikum4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("KALKULATOR LUAS BANGUN DATAR");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> { 
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    double luasPersegi = sisi * sisi;
                    System.out.println("Luas Persegi = " + luasPersegi);
                }

                case 2 -> { 
                    System.out.print("Masukkan panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = input.nextDouble();
                    double luasPP = panjang * lebar;
                    System.out.println("Luas Persegi Panjang = " + luasPP);
                }

                case 3 -> {
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();
                    double luasLingkaran = 3.14 * r * r;
                    System.out.println("Luas Lingkaran = " + luasLingkaran);
                }

                case 4 -> { 
                    System.out.print("Masukkan alas: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    double luasSegitiga = 0.5 * alas * tinggi;
                    System.out.println("Luas Segitiga = " + luasSegitiga);
                }

                case 5 -> System.out.println("Terima kasih sudah menggunakan kalkulator!");

                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

    }
}
