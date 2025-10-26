/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizulang;

/**
 *
 * @author Faridz Talbi
 */
public class Karyawan {
    private String nama;
    private String nip;
    
    public Karyawan(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
        
    }
    
    public String getNip(){
        return nip;
    }
    
     public void setNip(String nip){
        this.nip = nip; 
    }
}
