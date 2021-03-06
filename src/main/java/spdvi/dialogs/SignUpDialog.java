package spdvi.dialogs;

import java.awt.Frame;
import spdvi.POJOs.User;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;

public class SignUpDialog extends javax.swing.JDialog {

    private DataAccess dataAccess = new DataAccess();
    private Helpers helper = new Helpers();
    private boolean showPassword1 = false;
    private boolean showPassword2 = false;

    private String email = "";
    private String password = "";
    private String password2 = "";
    private String username = "";

    public SignUpDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        pswPassword1 = new javax.swing.JPasswordField();
        pswPassword2 = new javax.swing.JPasswordField();
        lblHideShowPassword = new javax.swing.JLabel();
        lblHideShowPassword1 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/389-mail2.png"))); // NOI18N
        lblEmail.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setToolTipText("Valid e-mail address");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/114-user.png"))); // NOI18N
        lblUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setToolTipText("Unique username");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/142-key.png"))); // NOI18N
        lblPassword.setText("Password");

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword1.setText("Repeat password");

        pswPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pswPassword2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHideShowPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"))); // NOI18N
        lblHideShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideShowPasswordMouseClicked(evt);
            }
        });

        lblHideShowPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideShowPassword1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"))); // NOI18N
        lblHideShowPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideShowPassword1MouseClicked(evt);
            }
        });

        lblLogin.setText("Already have an account?");

        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pswPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(lblEmail)
                                    .addComponent(lblUsername)
                                    .addComponent(lblPassword)
                                    .addComponent(lblPassword1)
                                    .addComponent(pswPassword2))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHideShowPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHideShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pswPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblPassword1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHideShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pswPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1))
                    .addComponent(lblHideShowPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(btnLogin))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        signUp();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblHideShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideShowPasswordMouseClicked
        showPassword1 = !showPassword1;
        helper.showHidePassword(pswPassword1, lblHideShowPassword, showPassword1);
    }//GEN-LAST:event_lblHideShowPasswordMouseClicked

    private void lblHideShowPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideShowPassword1MouseClicked
        showPassword2 = !showPassword2;
        helper.showHidePassword(pswPassword2, lblHideShowPassword1, showPassword2);
    }//GEN-LAST:event_lblHideShowPassword1MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUpDialog dialog = new SignUpDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHideShowPassword;
    private javax.swing.JLabel lblHideShowPassword1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pswPassword1;
    private javax.swing.JPasswordField pswPassword2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void signUp() {
        username = txtUsername.getText();
        password = pswPassword1.getText();
        password2 = pswPassword2.getText();
        email = txtEmail.getText();
        String encryptedPassword = helper.encryptPassword(password);
        if (checkAvaliable()) {
            ConfirmEmailDialog ced = new ConfirmEmailDialog((Frame) this.getParent(), true);
            ced.setEmail(email);
            ced.setVisible(true);
            if (ced.isVerefiedCode()) {
                dataAccess.createUser(new User(1, username, encryptedPassword, email, false));
            }
            this.dispose();
        }
    }

    private boolean checkAvaliable() {
        return checkEmailFormat() && checkUsername() && checkPassword() && checkUsedCredentials();
    }

    private boolean checkUsedCredentials() {
        if(dataAccess.userExists(username, email)) {
            helper.showErrorMessage("An account with this username or E-mail already exists", this);
            return false;
        }
        return true;
    }

    private boolean checkUsername() {
        if (username.isBlank() || username.isEmpty()) {
            helper.showErrorMessage("Username is required", this);
            return false;
        }
        return true;
    }

    private boolean checkEmailFormat() {
        if (email.isBlank() || email.isEmpty()) {
            helper.showErrorMessage("Invalid E-mail", this);
            return false;
        }
        if (!email.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}")) {
            helper.showErrorMessage("Invalid E-mail", this);
            return false;
        }
        return true;
    }

    private boolean checkPassword() {
        if (password.isBlank() || password.isEmpty() || password2.isBlank() || password2.isEmpty()) {
            helper.showErrorMessage("Password fields can't be empty", this);
            return false;
        }
        if (!password.equals(password2)) {
            helper.showErrorMessage("Passwords do not match", this);
            return false;
        }
        return true;
    }

    private void login() {
        LoginDialog loginDialog = new LoginDialog((Frame) this.getParent(), true);
        this.dispose();
        loginDialog.setVisible(true);
    }

    public String getEmail() {
        email = txtEmail.getText();
        return email;
    }
}
