/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibarang;

import static aplikasibarang.TestFrame.aa;
import static aplikasibarang.TestFrame.bb;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Satria_AR
 */
public class FrameTambah extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public FrameTambah() {
        initComponents();
    }
    public void close()
    {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSED);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }
public static ArrayList <Integer> nilaiPerubahan = new ArrayList<Integer>();
public static ArrayList <String> namaBarang = new ArrayList<String>();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jJumlah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSave = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nama Barang");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KERTAS A4", "kERTAS F4", "KERTAS PHOTO", "CD", "CUTTER", "SPIDOL", "TISU", "BATTERY AA", "BATTERY AAA", "BUKU EXPEDISI", "BUKU BATIK" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jumlah  Barang");

        jJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJumlahActionPerformed(evt);
            }
        });

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
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSave)
                    .addComponent(jButton1)))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJumlahActionPerformed

    }//GEN-LAST:event_jJumlahActionPerformed

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
        nilaiPerubahan.add(a);
        namaBarang.add (jComboBox1.getSelectedItem().toString());
        //dateNow = dateNowMethod();
        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("KERTAS A4"))
        {
            bb[0] = bb[0] + a;

        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("kERTAS F4"))
        {
            bb[1] = bb[1] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("KERTAS PHOTO"))
        {
            bb[2] = bb[2] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("CD"))
        {
            bb[3] = bb[3] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("CUTTER"))
        {
            bb[4] = bb[4] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("SPIDOL"))
        {
            bb[5] = bb[5] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("TISU"))
        {
            bb[6] = bb[6] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BATTERY AA"))
        {
            bb[7] = bb[7] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BATTERY AAA"))
        {
            bb[8] = bb[8] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BUKU EXPEDISI"))
        {
            bb[9] = bb[9] + a;
        }
        else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("BUKU BATIK"))
        {
            bb[10] = bb[10] + a;
        }

    }//GEN-LAST:event_jSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jJumlah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jSave;
    // End of variables declaration//GEN-END:variables
}
