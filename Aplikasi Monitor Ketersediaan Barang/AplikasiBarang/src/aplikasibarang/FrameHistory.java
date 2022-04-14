/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasibarang;

import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static aplikasibarang.TestFrame.bb;
import static aplikasibarang.FrameTambah.nilaiPerubahan;        // FrameTambah
import static aplikasibarang.FrameTambah.namaBarang;

import static aplikasibarang.FrameKurang.nilaiPerubahanKurang;  // FrameKurang
import static aplikasibarang.FrameKurang.namaBarangKurang;
import static aplikasibarang.FrameKurang.namaPengambil;
import java.util.ArrayList;
/**
 *
 * @author Satria_AR
 */
public class FrameHistory extends javax.swing.JFrame {
        Object[] dataTambah = new Object[6];
public static int sumOutputRow[] = {1,2,4,7,9,0,4,5};

    public FrameHistory() {
        initComponents();
    }

    public static String arrayNama[] = {};
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistoryTambah = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHistoryKurang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableHistoryTambah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Nama Barang", "Jumlah"
            }
        ));
        jTableHistoryTambah.setToolTipText("");
        jTableHistoryTambah.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableHistoryTambahComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHistoryTambah);
        if (jTableHistoryTambah.getColumnModel().getColumnCount() > 0) {
            jTableHistoryTambah.getColumnModel().getColumn(0).setHeaderValue("Tanggal");
            jTableHistoryTambah.getColumnModel().getColumn(1).setHeaderValue("Nama Barang");
            jTableHistoryTambah.getColumnModel().getColumn(2).setHeaderValue("Jumlah");
        }

        jTableHistoryKurang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Nama Barang", "Jumlah", "Nama Pengambil"
            }
        ));
        jTableHistoryKurang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableHistoryKurangComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(jTableHistoryKurang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(813, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void historYTambah()
    {
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateNow = DateTimeFormatter.ofPattern("dd-MM-yyyy");  // Untuk Tanggal
        String dateFormat = localDate.format(dateNow);

        DefaultTableModel model = (DefaultTableModel)jTableHistoryTambah.getModel();
        Object[] dataTambah = new Object[6];
 
        for (int a = 0; a < namaBarang.size();a++)
        {
            dataTambah[0] = dateFormat;
            dataTambah[1] = namaBarang.get(a);
            dataTambah[2] = nilaiPerubahan.get(a);
            model.addRow(dataTambah);
        }
        jTableHistoryTambah.setModel(model);
     }

    public void historYKurang()
    {
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dateNow = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        String dateFormat = localDate.format(dateNow);

        DefaultTableModel model = (DefaultTableModel)jTableHistoryKurang.getModel();
        Object[] dataKurang = new Object[6];
        for (int i = 0; i < namaBarangKurang.size();i++)
        {
            dataKurang[0] = dateFormat;
            dataKurang[1] = namaBarangKurang.get(i);
            dataKurang[2] = nilaiPerubahanKurang.get(i);
            dataKurang[3] = namaPengambil.get(i);
            model.addRow(dataKurang);
        }       
}
 
    
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TestFrame backMenu = new TestFrame();
        backMenu.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableHistoryTambahComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableHistoryTambahComponentShown
        
    }//GEN-LAST:event_jTableHistoryTambahComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        historYTambah();
        historYKurang();
    }//GEN-LAST:event_formComponentShown

    private void jTableHistoryKurangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableHistoryKurangComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableHistoryKurangComponentShown

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
            java.util.logging.Logger.getLogger(FrameHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableHistoryKurang;
    private javax.swing.JTable jTableHistoryTambah;
    // End of variables declaration//GEN-END:variables
}
