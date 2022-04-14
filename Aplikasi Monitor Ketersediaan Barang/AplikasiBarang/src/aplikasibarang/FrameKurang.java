/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibarang;
import static aplikasibarang.TestFrame.aa;
import static aplikasibarang.TestFrame.bb;
import java.util.ArrayList;
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
    }
public static ArrayList <String> namaBarangKurang = new ArrayList<String>();
public static ArrayList <String> namaPengambil = new ArrayList<String>();
public static ArrayList <Integer> nilaiPerubahanKurang = new ArrayList<Integer>();   // INI BELUM DI MASUKKAN KE ARRAT LIST SAMA CLASS KURANG BLM DI KONFIGURASI


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jnamaPengambil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jJumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSave = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nama Pengambil");

        jLabel2.setText("Jumlah Barang");

        jnamaPengambil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnamaPengambilActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Barang");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KERTAS A4", "kERTAS F4", "KERTAS PHOTO", "CD", "CUTTER", "SPIDOL", "TISU", "BATTERY AA", "BATTERY AAA", "BUKU EXPEDISI", "BUKU BATIK" }));

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSave.setText("Save");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
                    .addComponent(jJumlah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnamaPengambil))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jnamaPengambil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jSave))
                .addGap(27, 27, 27))
        );

        setSize(new java.awt.Dimension(416, 339));
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

    private void jnamaPengambilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnamaPengambilActionPerformed

    }//GEN-LAST:event_jnamaPengambilActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jJumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jSave;
    private javax.swing.JTextField jnamaPengambil;
    // End of variables declaration//GEN-END:variables
}
