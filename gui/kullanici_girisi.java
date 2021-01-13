package gui;


import java.util.ArrayList;
import javax.swing.JOptionPane;

import data.Database;

public class kullanici_girisi extends javax.swing.JFrame {

    public static Database database = null;




    public kullanici_girisi() {

        initComponents();

        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);


    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        btn_giris = new javax.swing.JButton();
        btn_giris_egitmen = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btn_giris.setFont(new java.awt.Font("Calibri", 0, 14));
        btn_giris.setForeground(new java.awt.Color(51, 153, 255));
        btn_giris.setText("SINAVA BAŞLA");
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        btn_giris_egitmen.setFont(new java.awt.Font("Calibri", 0, 14));
        btn_giris_egitmen.setForeground(new java.awt.Color(51, 153, 255));
        btn_giris_egitmen.setText("EĞİTMEN GİRİŞİ");
        btn_giris_egitmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giris_egitmenActionPerformed(evt);
            }
        });

        btn_cikis.setFont(new java.awt.Font("Calibri", 0, 14));
        btn_cikis.setForeground(new java.awt.Color(51, 153, 255));
        btn_cikis.setText("ÇIKIŞ");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_giris_egitmen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_giris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_giris)
                .addGap(39, 39, 39)
                .addComponent(btn_giris_egitmen)
                .addGap(39, 39, 39)
                .addComponent(btn_cikis)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    } 

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {
        sorular Sorular = new sorular();
        Sorular.setVisible(true);
        dispose();




    } 

    private void btn_giris_egitmenActionPerformed(java.awt.event.ActionEvent evt) {
        egitmen Egitmen = new egitmen();
        Egitmen.setVisible(true);
        dispose();
    } 

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {

        dispose();


    } 

    public static void main(String args[]) {
        database = new Database("sample", ".");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_girisi().setVisible(true);
            }
        });
    }

 
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_giris_egitmen;
  
}