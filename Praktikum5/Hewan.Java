package com.mycompany.praktikum5;

/**
 *
 * @author Faridz Talbi
 */
abstract public class Hewan {
    String nama;

    Hewan(String nama){
        this.nama = nama;
    }

    abstract void suara();

    void info(){
        System.out.println("Nama hewan: " + this.nama);
    }
}
