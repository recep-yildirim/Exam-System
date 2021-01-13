package gui;

import javax.swing.JOptionPane;
import data.*;
import java.util.HashMap;
import operations.*;

public class soru_guncelle extends javax.swing.JFrame {


    QuestionOperations operations = new QuestionOperations(kullanici_girisi.database);

    String id;
    String soru;
    String a_sikki;
    String b_sikki;
    String c_sikki;
    String d_sikki;
    String e_sikki;

    public soru_guncelle() {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        e2 = new javax.swing.JTextField();
        cevap2 = new javax.swing.JComboBox < > ();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b2 = new javax.swing.JTextField();
        l = new javax.swing.JLabel();
        txt_soru2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_id2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        a2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        btn_getir = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cevap2.setFont(new java.awt.Font("Calibri", 0, 12));
        cevap2.setForeground(new java.awt.Color(51, 102, 255));
        cevap2.setModel(new javax.swing.DefaultComboBoxModel < > (new String[] {
            "A",
            "B",
            "C",
            "D",
            "E"
        }));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18));
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("GÖNDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("A)");

        jLabel8.setText("B)");

        jLabel9.setText("C)");

        jLabel10.setText("D)");

        jLabel11.setText("E)");

        l.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        l.setForeground(new java.awt.Color(255, 0, 51));
        l.setText("SORUYU YAZINIZ:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("SORU ID:");

        txt_id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("ŞIKLAR:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("CEVAP:");

        btn_getir.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_getir.setForeground(new java.awt.Color(51, 102, 255));
        btn_getir.setText("SORUYU GETİR");
        btn_getir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getirActionPerformed(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btn_geri.setForeground(new java.awt.Color(51, 102, 255));
        btn_geri.setText("GERİ");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(47, 47, 47))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cevap2, 0, 103, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel11)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(c2)
                                                .addComponent(d2)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_getir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(l)
                                .addGap(18, 18, 18)
                                .addComponent(txt_soru2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 164, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(btn_geri))
                .addGap(25, 25, 25)
                .addComponent(btn_getir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_soru2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cevap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(166, 166, 166))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        this.id = txt_id2.getText();
        this.soru = txt_soru2.getText();
        this.a_sikki = a2.getText();
        this.b_sikki = b2.getText();
        this.c_sikki = c2.getText();
        this.d_sikki = d2.getText();
        this.e_sikki = e2.getText();

        if (id.isEmpty() || soru.isEmpty() || a_sikki.isEmpty() || b_sikki.isEmpty() || c_sikki.isEmpty() || d_sikki.isEmpty() || e_sikki.isEmpty()) {

            JOptionPane.showMessageDialog(soru_guncelle.this, "BOŞ ALAN BIRAKILAMAZ....");
        } else {

            Question question = new Question(Integer.parseInt(id), soru, createOptions(), getCevap());

            if (operations.updateQuestion(question))
                JOptionPane.showMessageDialog(soru_guncelle.this, "SORU BAŞARIYLA GÜNCELLENDİ....");

            else
                JOptionPane.showMessageDialog(soru_guncelle.this, "SORU GÜNCELLENEMEDİ....");

            setVisible(false);
            ogretmen_islemler Ogretmenler_islemler = new ogretmen_islemler();
            Ogretmenler_islemler.setVisible(true);

        }

    } 

    private void btn_getirActionPerformed(java.awt.event.ActionEvent evt) {
        if (txt_id2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(soru_guncelle.this, "ID ALANI BOŞ BIRAKILAMAZ....");
        }

        int id = Integer.parseInt(txt_id2.getText().trim());
        Question question = operations.getQuestion(id);

        if (question != null) {
            txt_soru2.setText(question.getDescription());
            a2.setText(question.getOptionByName('a'));
            b2.setText(question.getOptionByName('b'));
            c2.setText(question.getOptionByName('c'));
            d2.setText(question.getOptionByName('d'));
            e2.setText(question.getOptionByName('e'));
            cevap2.setSelectedIndex(getAnswerIndex(question.getTrueAnswer()));
        } else
            JOptionPane.showMessageDialog(soru_guncelle.this, "BÖYLE BİR ID İLE SORU YOK....");


    } 

    private int getAnswerIndex(char option) {
        char[] options = {
            'A',
            'B',
            'C',
            'D',
            'E'
        };

        for (int i = 0; i < 5; i++) {
            if (options[i] == option) {
                return i;
            }
        }

        return 0;
    }





    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btn_geriActionPerformed
        ogretmen_islemler Ogretmen_islemler = new ogretmen_islemler();
        Ogretmen_islemler.setVisible(true);
        dispose();
    } 

    private void txt_id2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txt_id2ActionPerformed
       
    } 
    public char getCevap() {
        return cevap2.getSelectedItem().toString().charAt(0);
    }



    public HashMap < Character, String > createOptions() {
        HashMap < Character, String > options = new HashMap < Character, String > ();

        options.put('a', a_sikki);
        options.put('b', b_sikki);
        options.put('c', c_sikki);
        options.put('d', d_sikki);
        options.put('e', e_sikki);

        return options;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soru_guncelle().setVisible(true);
            }
        });
    }


    private javax.swing.JTextField a2;
    private javax.swing.JTextField b2;
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_getir;
    private javax.swing.JTextField c2;
    private javax.swing.JComboBox < String > cevap2;
    private javax.swing.JTextField d2;
    private javax.swing.JTextField e2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l;
    private javax.swing.JTextField txt_id2;
    private javax.swing.JTextField txt_soru2;

}