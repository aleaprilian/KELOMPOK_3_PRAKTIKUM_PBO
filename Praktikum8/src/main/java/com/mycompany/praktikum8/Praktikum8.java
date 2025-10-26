/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum8;

import javax.swing.*;

/**
 *
 * @author Faridz Talbi
 */
public class Praktikum8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        JFrame frame = new JFrame("contoh JFrame");
        
        // set ukuran
        frame.setSize(400,300);
        
        // mengatur saat operasi di tutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Frame terlihat
        frame.setVisible(true);
        
        // muncul di tengah
        frame.setLocationRelativeTo(null);
        
        JLabel label = new JLabel("Contoh Label", SwingConstants.CENTER);
        frame.add(label);
        
        JButton button = new JButton("Click Me");
        frame.add(button);
    }
}
