/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz_pbo;

import java.util.Scanner;

/**
 *
 * @author lenov
 */
public class QUIZ_PBO {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
       

      System.out.print("Masukkan Nama  : ");
      String inputNama = input.nextLine();
      System.out.print("Masukkan Umur  : ");
      int umur = input.nextInt();
      System.out.println(" Nama  : " + inputNama + " Umur : " +umur);
      input.nextLine();
      System.out.print("Masukkan Nama Siswa  : ");
      String inputSiswa = input.next();
      System.out.println("Halo" + inputSiswa + " ,Selamat Belajar Java!.");
      
      
        
      enum Warna{
          MERAH,HIJAU,BIRU
      } 
       
      for(Warna warnaPil : Warna.values()){
          System.out.println(warnaPil);
      }
      
        System.out.print("Masukkan Berat Badan : ");
       int Berat = input.nextInt();
       System.out.print("Masukkan Tinggi Badan : ");
       int TinggiBadan = input.nextInt();
       int TinggiMeter = TinggiBadan/10;
       
       System.out.print("Nilai BMI ANDA: " + (Berat*(TinggiMeter*TinggiMeter)));
       
       input.nextLine();
      int [] arr = new int[4];
      int inputKas = input.nextInt();
      System.out.print("Masukkan Uang Kas : ");
              for(int i = 0; i < 4;i++){
                  arr[i] = input.nextInt();
              }
              for(int i = 0; i < 4;i++){
                  System.out.print(arr[i]);
              }
       
       double totalBelanja = 50000;
       int diskon = 10;
       double TotBayar = 45000;
       System.out.print("Total Belanja :  : "  +  "Rp" + totalBelanja + " Diskon : " + diskon + " % " + "Total Bayar : " +"Rp"+ TotBayar);
       
        System.out.println("KALKULATOR NILAI : 1.Luas Persegi, 2.Luas Lingkaran, 3.Luas Segitiga, 4.Keluar");
      System.out.print("Masukkan Pilihan : ");
      int inputKal = input.nextInt();
      switch(inputKal){
          case 1 : 
       System.out.print("Masukkan sisi  : ");
      int sisi1 = input.nextInt();
      System.out.print("Luas Persegi : " +  (sisi1 * sisi1));
        break;
          case 2 :
      System.out.print("Masukkan Jari-Jari  : ");
      float jari1 = input.nextFloat();
      System.out.print("Luas Lingkaran : " +  (3.14 * (jari1*jari)));
            break;
          case 3 : 
      System.out.print("Masukkan Alas  : ");
      int Alas1 = input.nextInt();
      System.out.print("Masukkan Tinggi  : ");
      int Tinggi1 = input.nextInt();
      System.out.print("Luas Segita : " +  (Alas1 * Tinggi1/2));
            break;
      
          default :
       System.out.print("Program Selesai ");
                      break;
     
      }
       
       
              
      System.out.print("Masukkan sisi  : ");
      int sisi = input.nextInt();
      System.out.print("Masukkan Jari-Jari  : ");
      float jari = input.nextFloat();
      System.out.print("Masukkan Alas  : ");
      int Alas = input.nextInt();
      System.out.print("Masukkan Tinggi  : ");
      int Tinggi = input.nextInt();
      
      System.out.print("Luas Persegi : " +  (sisi * sisi));
      System.out.print("Luas Segita : " +  (Alas * Tinggi/2));
      System.out.print("Luas Lingkaran : " +  (3.14 * (jari*jari)));
      
     
       
              
     
      
     
      //nomor 8
      
    }
}
