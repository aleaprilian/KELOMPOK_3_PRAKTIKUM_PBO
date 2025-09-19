package com.mycompany.praktikum5;
/**
 *
 * @author Faridz Talbi
 */
public class Praktikum5 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("bmw", "Putih", 2006);
        Mobil mobil2 = new Mobil("supra", "Hitam", 2020);

        mobil1.tampilkanMobil();
        mobil2.tampilkanMobil();

        Mobil mobil3 = new Mobil();
        mobil3.tampilkanMobil();
        mobil3.panaskanMobil();

        Kalkulator cal = new Kalkulator();
        System.out.println("2 + 2 = " + cal.tambah(2, 2));
        System.out.println("2.0 + 2.0 = " + cal.tambah(2.0, 2.0));
        System.out.println(cal.tambah("hello ", "world"));
    }
}
