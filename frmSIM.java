/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuas;

/**
 *
 * @author Ni Luh Putu Trisna Kantina Dewi_20103001
 */
public class frmSIM extends javax.swing.JFrame {

    /**
     * Creates new form frmSIM
     */
    public frmSIM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menu1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        frMHS = new javax.swing.JMenu();
        frDSN = new javax.swing.JMenu();
        frMTK = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menu1.add(jMenu1);

        frMHS.setText("Data Mahasiswa");
        frMHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frMHSMouseClicked(evt);
            }
        });
        frMHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMHSActionPerformed(evt);
            }
        });
        menu1.add(frMHS);

        frDSN.setText("Data Dosen");
        frDSN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frDSNMouseClicked(evt);
            }
        });
        frDSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frDSNActionPerformed(evt);
            }
        });
        menu1.add(frDSN);

        frMTK.setText("Data Matkul");
        frMTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frMTKMouseClicked(evt);
            }
        });
        frMTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frMTKActionPerformed(evt);
            }
        });
        menu1.add(frMTK);

        setJMenuBar(menu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void frMHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frMHSMouseClicked
        new frmhs().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_frMHSMouseClicked

    private void frMHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMHSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frMHSActionPerformed

    private void frDSNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frDSNMouseClicked
        new frdsn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_frDSNMouseClicked

    private void frDSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frDSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frDSNActionPerformed

    private void frMTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frMTKMouseClicked
        new frmtk().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_frMTKMouseClicked

    private void frMTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frMTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frMTKActionPerformed

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
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSIM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu frDSN;
    private javax.swing.JMenu frMHS;
    private javax.swing.JMenu frMTK;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menu1;
    // End of variables declaration//GEN-END:variables
}
