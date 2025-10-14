
package com.mycompany.latihan6;

public class Rekening {
    public  String namaNasabah;
    private int saldo;

    Rekening(String namaNasabah,int saldo){
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;

    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        System.out.print("Saldo Nasabah : ");
        return saldo;
    }
}
