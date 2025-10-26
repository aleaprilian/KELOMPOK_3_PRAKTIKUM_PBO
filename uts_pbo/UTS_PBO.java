/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_pbo;
import java.util.Scanner;
/**
 *
 * @author Faridz Talbi
 */
public class UTS_PBO {
// Soal NO 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        do{
           System.out.println("STUDENT APP");
           System.out.println("MENU PILIHAN");
           System.out.println("1.Tampilkan Biodata");
           System.out.println("2.Hitung Umur Akademik");
           System.out.println("3.KELUAR");
           System.out.print("Masukkan Pilihan Anda: ");
           int pil = input.nextInt();
           switch (pil){
               case 1:
                   
                   
               case 2:
                   int tahunSekarang = 2025;
                   System.out.println();
               
               case 3:
                   System.out.println("Terimakasih sudah menggunakan Student App");
                   
               default: 
                   System.out.println("pilihan tidak valid"); 
                   break;
              }   
        } while(pil!=3);
    }    
}
