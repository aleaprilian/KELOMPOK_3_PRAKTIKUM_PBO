/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizulang;

/**
 *
 * @author Faridz Talbi
 */
public class KaryawanTetap extends Karyawan implements IDapatGaji {
    private double gajiBulanan;

    public KaryawanTetap(String nama, String nip, double gajiBulanan) {
        super(nama, nip);
        this.gajiBulanan = gajiBulanan;
    }
    public double getGajiBulanan() {
        return gajiBulanan;
    }
    public void setGajiBulanan(double gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getNip() {
        return super.getNip();
    }

    @Override
    public void setNip(String nip) {
        super.setNip(nip);
    }

    @Override
    public void tampilkanSlipGaji() {
        System.out.println("Nama Karyawan : " + getNama() );
        System.out.println("NIP: " + getNip());
        System.out.println("Status: Karyawan Tetap");
    }

}
