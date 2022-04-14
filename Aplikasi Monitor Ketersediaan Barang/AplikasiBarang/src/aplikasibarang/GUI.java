/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibarang;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Satria_AR
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 55, -1, -1));

        jButton2.setText("Kurang");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 55, -1, -1));

        jLabel1.setText("JUMLAH BARANG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 99, -1));

        jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalActionPerformed(evt);
            }
        });
        jPanel1.add(jtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 82, 47));

        jTableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Barang Tersedia"
            }
        ));
        jTableBarang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableBarangComponentShown(evt);
            }
        });
        jTableBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableBarangKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBarang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 390, 93));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void close()
    {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSED);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }

    private void jtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalActionPerformed
        String namaBarang[] = {"KERTAS A4", "KERTAS A5", "KERTAS PHOTO", "CD", "CUTTER","SPIDOL","TISU","BATTERY AA","BATTERY AAA","BUKU EXPEDISI","BUKU BATIK"};
        int sisaBarang[] = {2,4,6,7,8,9,0,3,2,7,9};
        int sum = namaBarang.length;
        String sumString = Integer.toString(sum);
        jtotal.setText(Integer.toString(sum));

        DefaultTableModel model = (DefaultTableModel)jTableBarang.getModel();
        Object[] data = new Object[6];
        for (int i = 0;i < namaBarang.length;i++ )
        {
            data[0] = namaBarang[i];
            data[1] = sisaBarang[i];
            model.addRow(data);
        }
    }//GEN-LAST:event_jtotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        FrameTambah Ftambah = new FrameTambah();
        Ftambah.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBarangKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBarangKeyTyped

    private void jTableBarangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableBarangComponentShown

    }//GEN-LAST:event_jTableBarangComponentShown
    
  

    //line arguments

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBarang;
    private javax.swing.JButton jtotal;
    // End of variables declaration//GEN-END:variables
}
