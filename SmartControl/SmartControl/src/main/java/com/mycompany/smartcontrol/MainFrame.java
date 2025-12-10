/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.smartcontrol;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.*;
import java.util.Properties;


/**
 *
 * @author lenov
 */
public class MainFrame extends javax.swing.JFrame {
CardLayout cardLayout = new CardLayout();
JPanel mainContainer = new JPanel(cardLayout);

public static String username;
public static String password;
public static String topik = "Matematika";
public static int waktuHukuman = 15;
public static int waktuKuis = 30;
public static boolean sedangKuis = false;

public void  setUsername(String newUsn){
    MainFrame.username = newUsn;
}

public void setPass(String newPass){
    MainFrame.password = newPass;
}


public MainFrame() {
        muatData(); 
        initComponents();
        
        
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setLayout(new java.awt.BorderLayout());
        this.add(mainContainer, java.awt.BorderLayout.CENTER);
        cardLayout = new java.awt.CardLayout();
        mainContainer.setLayout(cardLayout);
   
        mainContainer.add(new LoginPanel(this), "login_panel");
        mainContainer.add(new QuizPanel(this), "quiz_panel");
        mainContainer.add(new SettingsPanel(this), "settings_panel");
        
     
        cardLayout.show(mainContainer, "login_panel");


        this.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
           
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                if (sedangKuis) {
                } else {
                    System.exit(0);
                }
            }

            @Override
            public void windowIconified(java.awt.event.WindowEvent e) {
                if (sedangKuis) {
                    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                }
            }
         
            @Override
            public void windowDeactivated(java.awt.event.WindowEvent e) {
                if (sedangKuis) {
                    toFront();
                }
            }
        });
    }
    
    public void gantiPanel(String namaPanel){
        cardLayout.show(mainContainer, namaPanel);
        if (namaPanel.equals("quiz_panel")) {
            sedangKuis = true;             
            this.setAlwaysOnTop(true);     
            
        } else {
            sedangKuis = false;            
            this.setAlwaysOnTop(false);   
            sedangKuis = false;            
        }
    }

  
   
    public static void simpanData(String u, String p, String t, int wKuis, int wHukum) {
        try {
            java.util.Properties prop = new java.util.Properties();
            prop.setProperty("username", u);
            prop.setProperty("password", p);
            prop.setProperty("topik", t);
            prop.setProperty("waktuKuis", String.valueOf(wKuis));
            prop.setProperty("waktuHukuman", String.valueOf(wHukum));
            
            java.io.FileOutputStream output = new java.io.FileOutputStream("settings.txt");
            prop.store(output, "Konfigurasi SmartControl");
            output.close();
 
            username = u;
            password = p;
            topik = t;
            waktuKuis = wKuis;
            waktuHukuman = wHukum;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    private void muatData() {
        try {
            File file = new File("settings.txt");
 
            if (file.exists()) {
                FileInputStream input = new FileInputStream(file);
                Properties prop = new Properties();
                prop.load(input);
                
                username = prop.getProperty("username");
                password = prop.getProperty("password");
                username = prop.getProperty("username", "admin");
                password = prop.getProperty("password", "admin");

                topik = prop.getProperty("topik", "Matematika");
                
                String wKuisStr = prop.getProperty("waktuKuis", "30");
                waktuKuis = Integer.parseInt(wKuisStr);

                String wHukumStr = prop.getProperty("waktuHukuman", "300");
                waktuHukuman = Integer.parseInt(wHukumStr);
                
                input.close();
                System.out.println("Data lama ditemukan! User: " + username);
            } else {
                System.out.println("File belum ada. Menggunakan default (admin).");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
