package spdvi.dialogs;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import spdvi.Main;

public class AdminDialog extends javax.swing.JDialog {
    Main main;

    public AdminDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        main = (Main) this.getParent();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAdminPanel = new javax.swing.JLabel();
        btnNewPlace = new javax.swing.JButton();
        btnDisablePlaced = new javax.swing.JButton();
        btnEditPlace = new javax.swing.JButton();
        btnGrantAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAdminPanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/119-user-tie.png"))); // NOI18N
        lblAdminPanel.setText("Admin panel");

        btnNewPlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/267-plus.png"))); // NOI18N
        btnNewPlace.setText("New place");
        btnNewPlace.setFocusable(false);
        btnNewPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPlaceActionPerformed(evt);
            }
        });

        btnDisablePlaced.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/268-minus.png"))); // NOI18N
        btnDisablePlaced.setText("Disable place");
        btnDisablePlaced.setFocusable(false);
        btnDisablePlaced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisablePlacedActionPerformed(evt);
            }
        });

        btnEditPlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/006-pencil.png"))); // NOI18N
        btnEditPlace.setText("Edit place");
        btnEditPlace.setFocusable(false);
        btnEditPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPlaceActionPerformed(evt);
            }
        });

        btnGrantAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/118-user-check.png"))); // NOI18N
        btnGrantAdmin.setText("Grant admin");
        btnGrantAdmin.setFocusable(false);
        btnGrantAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrantAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGrantAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAdminPanel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNewPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisablePlaced, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAdminPanel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisablePlaced, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrantAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPlaceActionPerformed
        NewPlaceDialog npd = new NewPlaceDialog((Frame) this.getParent(), true);
        npd.setVisible(true);
    }//GEN-LAST:event_btnNewPlaceActionPerformed

    private void btnDisablePlacedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisablePlacedActionPerformed
        ChangeVisibilityDialog cvd = new ChangeVisibilityDialog((Frame) this.getParent(), true);
        cvd.setVisible(true);
    }//GEN-LAST:event_btnDisablePlacedActionPerformed

    private void btnEditPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPlaceActionPerformed
        SelectEditPlaceDialog sepd = new SelectEditPlaceDialog((Frame) this.getParent(), true);
        sepd.setVisible(true);
    }//GEN-LAST:event_btnEditPlaceActionPerformed

    private void btnGrantAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrantAdminActionPerformed
        GrantAdminDialog gad = new GrantAdminDialog((Frame) this.getParent(), true);
        gad.setVisible(true);
    }//GEN-LAST:event_btnGrantAdminActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminDialog dialog = new AdminDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisablePlaced;
    private javax.swing.JButton btnEditPlace;
    private javax.swing.JButton btnGrantAdmin;
    private javax.swing.JButton btnNewPlace;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdminPanel;
    // End of variables declaration//GEN-END:variables
}
