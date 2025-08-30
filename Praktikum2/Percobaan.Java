/**
 *
 * @author Muhammad Firmansyah
 */
public class Praktikum2 {
    public static void main (String[]args){

        // menampilkan "Hello World"
         System.out.println("Hello World");

         /*
          * menampilkan nama
          */
        System.out.println("Nama Saya Muhammad Firmansyah");

        int umur;
        umur = 19;

        String nama = "Muhammad Firmansyah";

        System.out.println("Nama Saya "+ nama);
        System.out.println("Umur Saya "+ umur);

        int x = 1, y = 3, z = 5;
        System.out.println(x + " " + y + " " + z);
        
        double [] ipSemester = {3.9, 3.6, 3.7, 3.8};
        System.out.println("IP Semester 3 Saya adalah : "+ ipSemester[2] );

        // konversi
        int intSemester1 = (int) ipSemester[2];
        System.out.println("Nilai IP Semester 3 dalam integer adalah "+ intSemester1);

        long nilaiSangatBesar = 300000000000L;
        int intnilaiSangatBesar = (int) nilaiSangatBesar;
        System.out.println("Nilai long sebelum dikonversi ke integer adalah "+ nilaiSangatBesar);
        System.out.println("Nilai long setelah dikonversi ke integer adalah "+ intnilaiSangatBesar);

         // nilai Konstanta
       final double PI = 3.14;
       // PI = 3.5;
       System.out.println("Nilai PI = " + PI);

    }

}
