/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.smartcontrol;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
/**
 *
 * @author lenov
 */
public class QuizPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    AiSoalGenerator aiGenerator = new AiSoalGenerator();
    int indexJawabanBenar = 0;
    int kesempatan = 1;
    int detikTersisa = 0;
    int waktuHukumanAwal = 15;
    int waktuHukuman = waktuHukumanAwal;
    int waktuJeda;
    Timer timerHukuman;
    Timer timerKuis;
    

    
    
    public QuizPanel(MainFrame frameUtama){
        this.mainFrame = frameUtama;
        initComponents();

        this.addComponentListener(new java.awt.event.ComponentAdapter() {

            @Override
            public void componentShown(java.awt.event.ComponentEvent e) {

                System.out.println("Panel Kuis Terbuka! Mengambil Settingan...");

                waktuHukumanAwal = MainFrame.waktuHukuman; 
                soalBaru();

            }
            @Override
            public void componentHidden(java.awt.event.ComponentEvent e) {
                if(timerKuis != null) timerKuis.stop();
                if(timerHukuman != null) timerHukuman.stop();
            }
        });

    }

    private void soalBaru(){
        kunciSemuaTombol(false); 
        resetTombol();

        lblSoal.setText("Sedang mengambil soal dari AI...");

        lblTimer.setForeground(Color.BLACK);
        new Thread(()-> {      
            SoalData dataSoal = aiGenerator.ambilSoal(MainFrame.topik);
            SwingUtilities.invokeLater(()->{

                if(dataSoal != null){

                    lblSoal.setText("<html><div style ='text-align:center;width:400px;'>" + dataSoal.pertanyaan + "</div></html>");

                    btnA.setText(dataSoal.pilihan[0]);

                    btnB.setText(dataSoal.pilihan[1]);

                    btnC.setText(dataSoal.pilihan[2]);

                    btnD.setText(dataSoal.pilihan[3]);

                    indexJawabanBenar = dataSoal.indexJawaban;
                    kesempatan = 1;
                    mulaiTimerKuis(); // Timer mulai hitung mundur

                } else {
                    lblSoal.setText("Gagal memuat soal. Cek koneksi internet!");
                }

            });

        }).start();

    }
    
    // --- GANTI METHOD CEK JAWABAN YANG LAMA DENGAN INI ---
    private void cekJawaban(int pilihanUser, javax.swing.JButton tombol) {
        if (timerHukuman != null && timerHukuman.isRunning()) return;
        if(timerKuis != null) timerKuis.stop();
        
        if(pilihanUser == indexJawabanBenar){
            tombol.setBackground(Color.GREEN);
            kunciSemuaTombol(false);

            Timer delaySembunyi = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   masukModeIstirahat();
                }
            });
            delaySembunyi.setRepeats(false);
            delaySembunyi.start();
            
        } else {
            // === JAWABAN SALAH ===
            tombol.setBackground(Color.RED);
            tombol.setEnabled(false);
            kesempatan--;

            if (kesempatan <= 0) {
                mulaiHukuman(); // Tetap di layar, tapi dihukum
            } else {
                lblSoal.setText("Salah! Coba lagi.");
                if(timerKuis != null) timerKuis.start();
            }
        }
    } 

 
    private void masukModeIstirahat() {
        System.out.println("Jawaban Benar! Aplikasi akan sembunyi/istirahat.");
        mainFrame.setVisible(false); 
        int durasiIstirahatDetik = MainFrame.waktuKuis; 
        int durasiMs = durasiIstirahatDetik * 1000;
        
    
        Timer timerMuncul = new Timer(durasiMs, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(true);
                mainFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
                mainFrame.toFront();
                mainFrame.requestFocus();
                soalBaru();
            }
        });
        
        timerMuncul.setRepeats(false);
        timerMuncul.start();
    }
    

    
  
   private void mulaiTimerKuis(){
       if(timerKuis != null) timerKuis.stop();
       detikTersisa = 30; 
       lblTimer.setText("Waktu: " + detikTersisa);

       timerKuis = new Timer(1000, new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent e){
               detikTersisa--;
               lblTimer.setText("Waktu: " + detikTersisa);

               if(detikTersisa <= 10) lblTimer.setForeground(Color.RED);

               if(detikTersisa <= 0){
                   ((Timer)e.getSource()).stop();

                   lblTimer.setText("Waktu Habis!");
                   mulaiHukuman();
               }

           }

       });

       timerKuis.start();   

   }

   private void mulaiHukuman() {

        kunciSemuaTombol(false);

        lblSoal.setText("<html><h1>WAKTU HABIS / SALAH!</h1>Tunggu hukuman selesai...</html>");

        lblTimer.setForeground(Color.RED);

        waktuHukuman = waktuHukumanAwal; 
        timerHukuman = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lblTimer.setText("Hukuman: " + waktuHukuman + "s");
                waktuHukuman--;

                if (waktuHukuman < 0) {
                    ((Timer)e.getSource()).stop();
                    lblTimer.setText("Siap...");
                    soalBaru();
                }

            }

        });

        timerHukuman.start();

    }


    private void resetTombol() {

        Color defaultColor = javax.swing.UIManager.getColor("Button.background");

        btnA.setBackground(defaultColor);

        btnB.setBackground(defaultColor);

        btnC.setBackground(defaultColor);

        btnD.setBackground(defaultColor);

        btnA.setEnabled(true);

        btnB.setEnabled(true);

        btnC.setEnabled(true);

        btnD.setEnabled(true);

    }

    private void kunciSemuaTombol(boolean aktif) {
        btnA.setEnabled(aktif);
        btnB.setEnabled(aktif);
        btnC.setEnabled(aktif);
        btnD.setEnabled(aktif);

    }

    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        stopBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();
        lblTimer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        lblSoal = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));
        add(jPanel3, java.awt.BorderLayout.PAGE_END);

        headerPanel.setBackground(new java.awt.Color(94, 190, 242));
        headerPanel.setPreferredSize(new java.awt.Dimension(400, 50));

        stopBtn.setText("Stop");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });
        headerPanel.add(stopBtn);

        settingsBtn.setText("Settings");
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });
        headerPanel.add(settingsBtn);
        headerPanel.add(lblTimer);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.add(jLabel1);

        add(headerPanel, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        bottomPanel.setPreferredSize(new java.awt.Dimension(400, 30));
        bottomPanel.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        bottomPanel.add(btnA);

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        bottomPanel.add(btnB);

        btnC.setText("c");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        bottomPanel.add(btnC);

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        bottomPanel.add(btnD);

        add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerPanel.setLayout(new java.awt.GridBagLayout());
        centerPanel.add(lblSoal, new java.awt.GridBagConstraints());

        add(centerPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
           cekJawaban(0,btnA);
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
           cekJawaban(1,btnB);
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
          cekJawaban(2,btnC);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
          cekJawaban(3,btnD);
    }//GEN-LAST:event_btnDActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.gantiPanel("settings_panel");
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        if (timerKuis != null) timerKuis.stop(); // Pause

        javax.swing.JPanel panelSandi = new javax.swing.JPanel(new java.awt.GridLayout(2, 2, 5, 5));
        javax.swing.JTextField fUser = new javax.swing.JTextField();
        javax.swing.JPasswordField fPass = new javax.swing.JPasswordField();
        panelSandi.add(new javax.swing.JLabel("Username:"));
        panelSandi.add(fUser);
        panelSandi.add(new javax.swing.JLabel("Password:"));
        panelSandi.add(fPass);

        int jawab = JOptionPane.showConfirmDialog(this, panelSandi, "Akses Admin", JOptionPane.OK_CANCEL_OPTION);

        if (jawab == JOptionPane.OK_OPTION) {

            if (fUser.getText().equals(MainFrame.username) && 

                new String(fPass.getPassword()).equals(MainFrame.password)) {

                if(timerHukuman != null) timerHukuman.stop();
                mainFrame.gantiPanel("login_panel");

            } else {

                JOptionPane.showMessageDialog(this, "Password Salah!");
                if (timerKuis != null) timerKuis.start();
            }
        } else {
            if (timerKuis != null) timerKuis.start();

        }

    }//GEN-LAST:event_stopBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblSoal;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JButton stopBtn;
    // End of variables declaration//GEN-END:variables
}
