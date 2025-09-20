package com.mycompany.latihan5;

public class Latihan5 {

    public static void main(String[] args) {
        
        Tas tas1 = new Tas();
        Tas tas2 = new Tas("hytam", "apayh", 2006);
        Tas tas3 = new Tas("pinky", "trsrh", 2024);
        tas1.tampilkanTas();
        tas2.tampilkanTas();
        tas3.tampilkanTas();

        tas1.isiTas("rubik");
        tas2.isiTas("laprak",3);
        tas3.isiTas("Laptop");
    }
}
