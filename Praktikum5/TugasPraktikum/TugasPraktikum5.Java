package com.mycompany.tugaspraktikum5;

public class TugasPraktikum5 {
    public static void main(String[] args) {
        TV tvPertama = new TV();
        TV tvKedua = new TV("LG ", 75, "OLED ", 2022);
        TV tvKetiga = new TV("TCL ", 50, "OLED ", 2024);

        tvPertama.info();
        tvKedua.info("Talbi");
        tvKetiga.info("Faridz");   
    }
}
