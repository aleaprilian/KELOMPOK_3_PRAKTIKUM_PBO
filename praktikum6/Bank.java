package com.mycompany.latihan6;

public class Bank {
    private int saldo;
    static String namaBank = "BRI";

    Bank(int saldo){
        this.saldo = saldo;
    }

    //method untuk mengambil nilai variabel static
    public static void tampilNamaBank() {
        System.out.println("Nama Bank : " + namaBank);
    }

    //method untuk mengambil nilai variabel private
    public int getSaldo(){
        return saldo;

    }
}    
