/*
 * @autor Muhammad Firmansyah
 */

 public class LatihanLaprak2 {
    public static void main(String[] args){
        // Biodata
        String nama = "Muhammad Firmansyah";
        String alamat = "JL. Bangau Sakti";
        String goldar = "X";
        int umur;
        umur = 19;
        double [] ipSemester = {3.9, 3.6, 3.7, 3.8};

        // Konstanta
        final String nim = "2407127220";

        // Konversi
        byte byteSemester3 = (byte) ipSemester[2];

        System.out.println("Nama Saya "+ nama);
        System.out.println("Umur Saya "+ umur);
        System.out.println("NIM Saya "+ nim);
        System.out.println("Alamat Saya "+ alamat);
        System.out.println("Golongan darah Saya "+ goldar);
        System.out.println("IP Semester 3 Saya "+ ipSemester[2]);
        System.out.println("Nilai IP Semester 3 Saya jika dikonversi ke byte = "+ byteSemester3);

    }
 }
