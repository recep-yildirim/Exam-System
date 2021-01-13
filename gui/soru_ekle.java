package gui;

import java.util.HashMap;
import javax.swing.JOptionPane;
import data.*;
import operations.*;

public class soru_ekle extends javax.swing.JFrame {
    String id;
    String soru;
    String a_sikki;
    String b_sikki;
    String c_sikki;
    String d_sikki;
    String e_sikki;


    QuestionOperations operations = new QuestionOperations(kullanici_girisi.database);

    public soru_ekle() {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        l = new javax.swing.JLabel();
        txt_soru = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_gonder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        cevap = new javax.swing.JComboBox < > ();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l.setFont(new java.awt.Font("Calibri", 0, 14));
        l.setForeground(new java.awt.Color(255, 0, 51));
        l.setText("SORUYU YAZINIZ:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("SORU ID:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("ŞIKLAR:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("CEVAP:");

        btn_gonder.setFont(new java.awt.Font("Calibri", 0, 18));
        btn_gonder.setForeground(new java.awt.Color(51, 102, 255));
        btn_gonder.setText("GÖNDER");
        btn_gonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gonderActionPerformed(evt);
            }
        });

        jLabel1.setText("A)");

        jLabel8.setText("B)");

        jLabel9.setText("C)");

        jLabel10.setText("D)");

        jLabel11.setText("E)");

        cevap.setFont(new java.awt.Font("Calibri", 0, 12));
        cevap.setForeground(new java.awt.Color(51, 102, 255));
        cevap.setModel(new javax.swing.DefaultComboBoxModel < > (new String[] {
            "A",
            "B",
            "C",
            "D",
            "E"
        }));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18));
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("GERİ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(l)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_soru, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c)
                                        .addComponent(d)))))
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_gonder, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_soru, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btn_gonder)
                .addGap(134, 134, 134))
        );

        pack();
    } 

    private void btn_gonderActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btn_gonderActionPerformed
        this.id = txt_id.getText();
        this.soru = txt_soru.getText();
        this.a_sikki = a.getText();
        this.b_sikki = b.getText();
        this.c_sikki = c.getText();
        this.d_sikki = d.getText();
        this.e_sikki = e.getText();




        if (id.isEmpty() || soru.isEmpty() || a_sikki.isEmpty() || b_sikki.isEmpty() || c_sikki.isEmpty() || d_sikki.isEmpty() || e_sikki.isEmpty()) {

            JOptionPane.showMessageDialog(soru_ekle.this, "BOŞ ALAN BIRAKILAMAZ....");
        } else {

            Question question = new Question(Integer.parseInt(id), soru, createOptions(), getCevap());
            if (operations.addQuestion(question))
                JOptionPane.showMessageDialog(soru_ekle.this, "SORU BAŞARIYLA EKLENDİ....");

            else
                JOptionPane.showMessageDialog(soru_ekle.this, "SORU EKLENEMEDİ....");


            setVisible(false);
            ogretmen_islemler Ogretmenler_islemler = new ogretmen_islemler();
            Ogretmenler_islemler.setVisible(true);

        }


    } 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        ogretmen_islemler Ogretmen_islemler = new ogretmen_islemler();
        Ogretmen_islemler.setVisible(true);
        dispose();
    } 

    public char getCevap() {
        return cevap.getSelectedItem().toString().charAt(0);
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
                new soru_ekle().setVisible(true);
            }
        });
    }

   
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JButton btn_gonder;
    private javax.swing.JTextField c;
    private javax.swing.JComboBox < String > cevap;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
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
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_soru;

}