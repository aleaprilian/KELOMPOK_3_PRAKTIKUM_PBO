package com.mycompany.smartcontrol;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CekModel {
    
    // TEMPEL API KEY KAMU DI SINI
    private static final String API_KEY = "AIzaSyCtQKsGVmeS9s7lCXAua797kbxkfUZ95C4"; 

    public static void main(String[] args) {
        System.out.println("Sedang mengecek daftar model yang tersedia...");
        
        try {
            // Kita minta daftar menu (List Models) ke Google
            String url = "https://generativelanguage.googleapis.com/v1beta/models?key=" + API_KEY;
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET() // Kita cuma mau LIHAT (GET), bukan kirim soal
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("--- DAFTAR MODEL YANG BISA KAMU PAKAI ---");
            System.out.println(response.body());
            System.out.println("-----------------------------------------");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}