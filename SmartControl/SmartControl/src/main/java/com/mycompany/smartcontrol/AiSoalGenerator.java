package com.mycompany.smartcontrol;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.util.Random; 

public class AiSoalGenerator {

    // API Key Google Gemini (Pastikan kuota API masih ada)
    private static final String API_KEY = "AIzaSyCBUaZMz4lBRRhtisunoTx5nUyrgqJrCXc"; 
    private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-flash-latest:generateContent?key=" + API_KEY;

    // --- FUNGSI UTAMA YANG DIPANGGIL DARI LUAR ---
    public SoalData ambilSoal(String topikRequest) {
        
        System.out.println("Memproses permintaan soal topik: " + topikRequest);
        
        // 1. COBA MINTA KE AI (ONLINE)
        String jsonMentah = kirimRequestKeAI(topikRequest);
        
        // 2. JIKA BERHASIL (ADA INTERNET & API OKE)
        if (jsonMentah != null) {
            SoalData hasilAI = bersihkanDanAmbilData(jsonMentah);
            if (hasilAI != null) {
                return hasilAI; // Kembalikan soal dari AI
            }
        }

        // 3. JIKA GAGAL / TIDAK ADA INTERNET -> PAKAI MODE OFFLINE
        System.out.println("Internet/API Bermasalah. Beralih ke Matematika Offline...");
        return generateSoalMatematikaOffline();
    }

    // --- FUNGSI REQUEST KE GOOGLE GEMINI AI ---
    private String kirimRequestKeAI(String topik) {
        try {
            // Prompt khusus agar AI memberikan format JSON yang konsisten
            String prompt = "Buatkan 1 soal kuis pilihan ganda untuk anak SD tentang topik: " + topik + ". "
                    + "Soal harus pendek, seru, dan jelas. "
                    + "Jawab HANYA dengan JSON raw (tanpa markdown). "
                    + "Format wajib: { \"soal\": \"isi pertanyaan\", \"pilihan\": [\"A\", \"B\", \"C\", \"D\"], \"jawaban_benar\": 0 } "
                    + "(jawaban_benar adalah angka index 0-3).";

            // Rakit Body JSON untuk dikirim ke Google
            String jsonBody = "{" +
                              "  \"contents\": [{" +
                              "    \"parts\": [{" +
                              "      \"text\": \"" + prompt + "\"" +
                              "    }]" +
                              "  }]" +
                              "}";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Content-Type", "application/json")
                    .POST(BodyPublishers.ofString(jsonBody))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.out.println("Error API Code: " + response.statusCode());
                return null; // Memicu mode offline
            }
        } catch (Exception e) {
            System.out.println("Koneksi Error: " + e.getMessage());
            return null; // Memicu mode offline
        }
    }
    
    // --- FUNGSI PARSING DATA JSON (Manual String Manipulation) ---
    private SoalData bersihkanDanAmbilData(String jsonKotor) {
        SoalData hasil = new SoalData();
        try {
            // Bersihkan format markdown jika AI menambahkan ```json
            String content = jsonKotor;
            int startMarker = content.indexOf("\"text\": \"");
            if (startMarker == -1) return null;
            
            content = content.substring(startMarker + 9); 
            int endMarker = content.indexOf("}\n          ]"); 
            if (endMarker == -1) endMarker = content.lastIndexOf("\"", content.length() - 5);
            if (endMarker != -1) content = content.substring(0, endMarker);

            // Unescape karakter aneh
            content = content.replace("\\n", " ").replace("\\\"", "\"").replace("```json", "").replace("```", "").trim();

            // Ambil Pertanyaan
            hasil.pertanyaan = ambilIsi(content, "\"soal\": \"", "\",");
            
            // Ambil Kunci Jawaban
            String strIndex = ambilIsi(content, "\"jawaban_benar\": ", "}");
            hasil.indexJawaban = Integer.parseInt(strIndex.replaceAll("[^0-9]", ""));
            
            // Ambil Pilihan Ganda
            String arrayMentah = ambilIsi(content, "\"pilihan\": [", "]");
            String[] splitPilihan = arrayMentah.split(",");
            for (int i = 0; i < 4; i++) {
                if (i < splitPilihan.length) {
                    hasil.pilihan[i] = splitPilihan[i].replace("\"", "").trim();
                } else {
                    hasil.pilihan[i] = "-";
                }
            }
            return hasil;
        } catch (Exception e) {
            System.out.println("Gagal Parsing JSON: " + e.getMessage());
            return null;
        }
    }

    // Helper untuk memotong string
    private String ambilIsi(String sumber, String awalan, String akhiran) {
        int start = sumber.indexOf(awalan);
        if (start == -1) return "";
        start += awalan.length();
        int end = sumber.indexOf(akhiran, start);
        if (end == -1) return sumber.substring(start);
        return sumber.substring(start, end);
    }

    // --- FUNGSI GENERATOR MATEMATIKA OFFLINE (Randomizer) ---
    private SoalData generateSoalMatematikaOffline() {
        SoalData data = new SoalData();
        Random rand = new Random();

        // 1. Acak Angka (1 sampai 20)
        int a = rand.nextInt(20) + 1; 
        int b = rand.nextInt(20) + 1; 
        
        // 2. Acak Operator (True = Tambah, False = Kurang)
        boolean isTambah = rand.nextBoolean(); 
        int jawabanBenarAngka;
        
        if (isTambah) {
            data.pertanyaan = "Berapakah hasil dari " + a + " + " + b + " ?";
            jawabanBenarAngka = a + b;
        } else {
            // Biar hasilnya tidak negatif (anak SD bingung kalau negatif)
            if (a < b) { int temp = a; a = b; b = temp; } 
            
            data.pertanyaan = "Berapakah hasil dari " + a + " - " + b + " ?";
            jawabanBenarAngka = a - b;
        }

        // 3. Tentukan Posisi Jawaban Benar (0-3)
        data.indexJawaban = rand.nextInt(4);

        // 4. Isi Pilihan Ganda (1 Benar, 3 Salah)
        for (int i = 0; i < 4; i++) {
            if (i == data.indexJawaban) {
                data.pilihan[i] = String.valueOf(jawabanBenarAngka);
            } else {
                int jawabanSalah;
                do {
                    // Buat jawaban salah (Jawaban Benar +/- 5)
                    int pengganggu = rand.nextInt(10) - 5; 
                    jawabanSalah = jawabanBenarAngka + pengganggu;
                    // Pastikan beda dan tidak negatif
                } while (jawabanSalah == jawabanBenarAngka || jawabanSalah < 0);
                
                data.pilihan[i] = String.valueOf(jawabanSalah);
            }
        }
        
        return data;
    }
}