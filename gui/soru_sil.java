
package gui;
import data.*;
import javax.swing.JOptionPane;
import operations.*;

public class soru_sil extends javax.swing.JFrame {

    String id;

    QuestionOperations operations = new QuestionOperations(kullanici_girisi.database);

    public soru_sil() {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("SORU ID :");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); 
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("SORUYU ÇIKAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Calibri", 0, 14)); 
        btn_geri.setForeground(new java.awt.Color(51, 153, 255));
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
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_id))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_geri))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_geri)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    } 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
        this.id = txt_id.getText();
        if (id.isEmpty()) {

            JOptionPane.showMessageDialog(soru_sil.this, "BOŞ ALAN BIRAKILAMAZ....");
        } else {
            Question question = operations.getQuestion(Integer.parseInt(id));

            if (question != null) {
                if (operations.deleteQuestion(Integer.parseInt(id)))
                    JOptionPane.showMessageDialog(soru_sil.this, "SORU BAŞARIYLA SİLİNDİ....");

                else
                    JOptionPane.showMessageDialog(soru_sil.this, "SORU SİLİNEMEDİ....");
            } else {
                JOptionPane.showMessageDialog(soru_sil.this, "BÖYLE BİR ID İLE SORU YOK....");
            }


        } 

    }
    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {
        ogretmen_islemler Ogretmen_islemler = new ogretmen_islemler();
        Ogretmen_islemler.setVisible(true);
        dispose();
    } 

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(soru_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soru_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soru_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soru_sil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soru_sil().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btn_geri;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_id;

}