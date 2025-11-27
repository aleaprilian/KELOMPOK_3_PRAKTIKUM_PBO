/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum9;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
    MainJFrame frame = new MainJFrame ();
    frame.changeMainPanel(new TambahDataPanel());
    frame.setVisible(true);
    }
}
