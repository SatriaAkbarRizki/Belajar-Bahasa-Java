/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibarang;
import static aplikasibarang.TestFrame.aa;
import static aplikasibarang.TestFrame.bb;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Satria_AR
 */
public class FrameKurang extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public FrameKurang() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0, getWidth(), getHeight(),20, 30));
    }
public static ArrayList <String> namaBarangKurang = new ArrayList<String>();
public static ArrayList <String> namaPengambil = new ArrayList<String>();
public static ArrayList <Integer> nilaiPerubahanKurang = new ArrayList<Integer>();   // INI BELUM DI MASUKKAN KE ARRAT LIST SAMA CLASS KURANG BLM DI KONFIGURASI


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();
        jButtonMinimize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jnamaPengambil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jJumlah = new javax.swing.JTextField();
        jSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 233, 233));
        jPanel1.setPreferredSize(new java.awt.Dimension(473, 375));

        jButtonClose.setBackground(new java.awt.Color(255, 51, 51));
        jButtonClose.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClose.setText("X");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonMinimize.setBackground(new java.awt.Color(51, 51, 255));
        jButtonMinimize.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jButtonMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMinimize.setText("-");
        jButtonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 0, 13)); // NOI18N
        jLabel1.setText("Nama Pengambil");

        jnamaPengambil.setBackground(new java.awt.Color(248, 243, 243));
        jnamaPengambil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnamaPengambilActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Mono", 0, 13)); // NOI18N
        jLabel3.setText("Nama Barang");

        jComboBox1.setBackground(new java.awt.Color(248, 243, 243));
        jComboBox1.setFont(new java.awt.Font("Liberation Mono", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KERTAS A4", "kERTAS F4", "KERTAS PHOTO", "CD", "CUTTER", "SPIDOL", "TISU", "BATTERY AA", "BATTERY AAA", "BUKU EXPEDISI", "BUKU BATIK" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jumlah Barang");

        jJumlah.setBackground(new java.awt.Color(248, 243, 243));

        jSave.setBackground(new java.awt.Color(255, 0, 51));
        jSave.setFont(new java.awt.Font("Liberation Mono", 0, 13)); // NOI18N
        jSave.setForeground(new java.awt.Color(255, 255, 255));
        jSave.setText("Save");
        jSave.setPreferredSize(new java.awt.Dimension(72, 22));
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Liberation Mono", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jnamaPengambil)
                            .addComponent(jComboBox1, 0, 145, Short.MAX_VALUE)
                            .addComponent(jJumlah))
                        .addGap(91, 91, 91)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jnamaPengambil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(473, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void namaOrang()
    {
           String nama = jnamaPengambil.getText();
            namaPengambil.add(nama);
            namaString = nama;
    }
public static String namaString;

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizeActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizeActionPerformed

    private void jnamaPengambilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnamaPengambilActionPerformed

    }//GEN-LAST:event_jnamaPengambilActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        TestFrame perubahan = new TestFrame();
        int a = Integer.parseInt(jJumlah.getText());
        namaOrang();
        nilaiPerubahanKurang.add(a);
        namaBarangKurang.add(jComboBox1.getSelectedItem().toString());
        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("KERTAS A4"))
        {
            bb[0] = bb[0] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("kERTAS F4"))
        {
            bb[1] = bb[1] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("KERTAS PHOTO"))
        {
            bb[2] = bb[2] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("CD"))
        {
            bb[3] = bb[3] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("CUTTER"))
        {
            bb[4] = bb[4] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("SPIDOL"))
        {
            bb[5] = bb[5] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("TISU"))
        {
            bb[6] = bb[6] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BATTERY AA"))
        {
            bb[7] = bb[7] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BATTERY AAA"))
        {
            bb[8] = bb[8] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BUKU EXPEDISI"))
        {
            bb[9] = bb[9] - a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BUKU BATIK"))
        {
            bb[10] = bb[10] - a;
        }
    }//GEN-LAST:event_jSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jJumlah.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Mohon Isikan Jumlah Barang");
        }
        else
        {
            //close();
            TestFrame backMenu = new TestFrame();
            //backMenu.setVisible(true);
            backMenu.show();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameKurang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameKurang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameKurang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameKurang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameKurang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jJumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jSave;
    private javax.swing.JTextField jnamaPengambil;
    // End of variables declaration//GEN-END:variables
}
