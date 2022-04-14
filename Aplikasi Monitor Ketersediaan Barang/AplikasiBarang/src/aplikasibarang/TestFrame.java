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
import static aplikasibarang.FrameKurang.namaString;


/**
 *
 * @author Satria_AR
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TestFrame() {
        initComponents();
    }
public static String aa[] = {"KERTAS A4", "KERTAS F5", "KERTAS PHOTO", "CD", "CUTTER","SPIDOL","TISU","BATTERY AA","BATTERY AAA","BUKU EXPEDISI","BUKU BATIK"};
public static int bb[] = {2,4,6,7,8,9,0,3,2,7,9};


    public void baranG()
    {

        String namaBarang[] = TestFrame.aa;
        int sisaBarang [] = TestFrame.bb;
        int sum = namaBarang.length;
        String sumString = Integer.toString(sum);
        jtotal.setText(Integer.toString(sum));   // jumlah barang

        DefaultTableModel model = (DefaultTableModel)jTableBarang.getModel();
        Object[] data = new Object[6];
        for (int i = 0;i < namaBarang.length;i++ )
        {
            data[0] = namaBarang[i];
            data[1] = sisaBarang[i];
            model.addRow(data);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBarang = new javax.swing.JTable();
        jButtonKurang = new javax.swing.JButton();
        jhistorY = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jLabel1.setText("JUMLAH BARANG");

        jtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtotalActionPerformed(evt);
            }
        });

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

        jButtonKurang.setText("Kurang");
        jButtonKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKurangActionPerformed(evt);
            }
        });

        jhistorY.setText("History");
        jhistorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhistorYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jhistorY, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addGap(672, 672, 672)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jhistorY, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addGap(375, 375, 375)))
        );

        setSize(new java.awt.Dimension(813, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close()
    {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSED);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        baranG();
    }//GEN-LAST:event_formComponentShown

    private void jhistorYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhistorYActionPerformed
        FrameHistory Fhistory = new FrameHistory();
        Fhistory.show();
        dispose();
        //jhistorY.setText(namaString);
    }//GEN-LAST:event_jhistorYActionPerformed

    private void jButtonKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKurangActionPerformed
        //close();
        FrameKurang Fkurang = new FrameKurang();
        Fkurang.show();
        dispose();
        //Fkurang.setVisible(true);
    }//GEN-LAST:event_jButtonKurangActionPerformed

    private void jTableBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBarangKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBarangKeyTyped

    private void jTableBarangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableBarangComponentShown

    }//GEN-LAST:event_jTableBarangComponentShown

    private void jtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtotalActionPerformed

    }//GEN-LAST:event_jtotalActionPerformed

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        //close();
        FrameTambah Ftambah = new FrameTambah();
        Ftambah.show();
        //Ftambah.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTambahActionPerformed
    
  

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKurang;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBarang;
    private javax.swing.JButton jhistorY;
    private javax.swing.JButton jtotal;
    // End of variables declaration//GEN-END:variables
}
