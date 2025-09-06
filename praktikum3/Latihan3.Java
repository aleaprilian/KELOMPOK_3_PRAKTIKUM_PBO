package com.mycompany.praktikum3;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan sisi sejajar a: ");
            double a = input.nextDouble();

            System.out.print("Masukkan sisi sejajar b: ");
            double b = input.nextDouble();

            System.out.print("Masukkan tinggi trapesium: ");
            double tAlas = input.nextDouble();

            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = input.nextDouble();

            double luasAlas = (a + b) / 2 * tAlas;
            double volume = luasAlas * tinggiPrisma;

            System.out.println("Luas alas trapesium adalah: " + luasAlas);
            System.out.println("Volume prisma trapesium adalah: " + volume);

        } catch (Exception e) {
            System.out.println("Mohon masukkan angka yang valid!");
        }

    }
}
