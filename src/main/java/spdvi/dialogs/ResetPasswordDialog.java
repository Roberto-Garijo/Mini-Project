package spdvi.dialogs;

import spdvi.Main;
import spdvi.POJOs.User;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;

public class ResetPasswordDialog extends javax.swing.JDialog {

    Main main;
    private Helpers helpers = new Helpers();
    private DataAccess dataAccess = new DataAccess();
    private boolean showPassword1 = false;
    private boolean showPassword2 = false;
    private boolean showPassword3 = false;
    
    public ResetPasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        main = (Main) this.getParent();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        pswPassword1 = new javax.swing.JPasswordField();
        lblHideShowPassword = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        pswPassword2 = new javax.swing.JPasswordField();
        lblHideShowPassword1 = new javax.swing.JLabel();
        btnNewPass = new javax.swing.JButton();
        lblPassword2 = new javax.swing.JLabel();
        pswPassword3 = new javax.swing.JPasswordField();
        lblHideShowPassword2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/142-key.png"))); // NOI18N
        lblPassword.setText("Actual password");

        pswPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHideShowPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"))); // NOI18N
        lblHideShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideShowPasswordMouseClicked(evt);
            }
        });

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword1.setText("Repeat new password");

        pswPassword2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHideShowPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideShowPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"))); // NOI18N
        lblHideShowPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideShowPassword1MouseClicked(evt);
            }
        });

        btnNewPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewPass.setText("Set new password");
        btnNewPass.setFocusable(false);
        btnNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPassActionPerformed(evt);
            }
        });

        lblPassword2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword2.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/142-key.png"))); // NOI18N
        lblPassword2.setText("New password");

        pswPassword3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHideShowPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideShowPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"))); // NOI18N
        lblHideShowPassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideShowPassword2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnNewPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword2)
                    .addComponent(lblPassword)
                    .addComponent(lblPassword1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pswPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHideShowPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pswPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHideShowPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pswPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHideShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblPassword)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHideShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHideShowPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHideShowPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnNewPass)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHideShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideShowPasswordMouseClicked
        showPassword1 = !showPassword1;
        helpers.showHidePassword(pswPassword1, lblHideShowPassword, showPassword1);
    }//GEN-LAST:event_lblHideShowPasswordMouseClicked

    private void lblHideShowPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideShowPassword1MouseClicked
        showPassword2 = !showPassword2;
        helpers.showHidePassword(pswPassword2, lblHideShowPassword1, showPassword2);
    }//GEN-LAST:event_lblHideShowPassword1MouseClicked

    private void btnNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPassActionPerformed
        changePassword();
    }//GEN-LAST:event_btnNewPassActionPerformed

    private void lblHideShowPassword2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideShowPassword2MouseClicked
        showPassword3 = !showPassword3;
        helpers.showHidePassword(pswPassword3, lblHideShowPassword2, showPassword3);
    }//GEN-LAST:event_lblHideShowPassword2MouseClicked

    private boolean checkPassword() {
        if(!main.getLoggedInUser().getPassword().equals(helpers.encryptPassword(pswPassword1.getText()))) {
            helpers.showErrorMessage("Please enter your actual password", this);
            return false;
        }
        if (pswPassword1.getText().isBlank() || pswPassword1.getText().isEmpty() || pswPassword2.getText().isBlank() || pswPassword2.getText().isEmpty() || pswPassword3.getText().isBlank() || pswPassword3.getText().isEmpty()) {
            helpers.showErrorMessage("Password fields can't be empty", this);
            return false;
        }
        if (!pswPassword2.getText().equals(pswPassword3.getText())) {
            helpers.showErrorMessage("Passwords do not match", this);
            return false;
        }
        return true;
    }
    
    
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
            java.util.logging.Logger.getLogger(ResetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResetPasswordDialog dialog = new ResetPasswordDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnNewPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHideShowPassword;
    private javax.swing.JLabel lblHideShowPassword1;
    private javax.swing.JLabel lblHideShowPassword2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JPasswordField pswPassword1;
    private javax.swing.JPasswordField pswPassword2;
    private javax.swing.JPasswordField pswPassword3;
    // End of variables declaration//GEN-END:variables

    private void changePassword() {
        if(checkPassword()) {
            User u = new User(main.getLoggedInUser().getId(), main.getLoggedInUser().getUsername(), helpers.encryptPassword(pswPassword3.getText()), main.getLoggedInUser().getEmail(), main.getLoggedInUser().isIsAdmin());
            main.setLoggedInUser(u);
            dataAccess.updatePassword(helpers.encryptPassword(pswPassword3.getText()), main.getLoggedInUser().getEmail());
            helpers.showInfoMessage("Password updated successfully!", this);
            this.dispose();
        }
    }
}
