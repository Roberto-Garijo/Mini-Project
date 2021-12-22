package spdvi.dialogs;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import spdvi.Main;
import spdvi.POJOs.User;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;

public class LoginDialog extends javax.swing.JDialog {

    private boolean showPassword = false;
    private Helpers helper = new Helpers();
    private DataAccess dataAccess = new DataAccess();

    private Main main;

    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        close();
        setLocationRelativeTo(null);
        main = (Main) this.getParent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        lblForgotPassword = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pswPassword = new javax.swing.JPasswordField();
        lblHideShowPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Username / E-mail");

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setToolTipText("Valid e-mail address");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");

        btnLogIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogIn.setText("Log in");
        btnLogIn.setFocusable(false);
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        lblForgotPassword.setForeground(java.awt.SystemColor.textHighlight);
        lblForgotPassword.setText("Forgot password?");
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseExited(evt);
            }
        });

        lblRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Register now");

        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        pswPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswPasswordKeyPressed(evt);
            }
        });

        lblHideShowPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHideShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"))); // NOI18N
        lblHideShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideShowPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnLogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSignUp))
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblForgotPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHideShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHideShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(btnLogIn)
                .addGap(18, 18, 18)
                .addComponent(lblForgotPassword)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegister)
                    .addComponent(btnSignUp))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        logIn();
    }//GEN-LAST:event_btnLogInActionPerformed

    private void lblHideShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideShowPasswordMouseClicked
        showPassword = !showPassword;
        helper.showHidePassword(pswPassword, lblHideShowPassword, showPassword);
    }//GEN-LAST:event_lblHideShowPasswordMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        signUp();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void pswPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logIn();
        }
    }//GEN-LAST:event_pswPasswordKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pswPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void lblForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseEntered
        lblForgotPassword.setForeground(new java.awt.Color(68, 172, 255));
    }//GEN-LAST:event_lblForgotPasswordMouseEntered

    private void lblForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseExited
        lblForgotPassword.setForeground(java.awt.SystemColor.textHighlight);
    }//GEN-LAST:event_lblForgotPasswordMouseExited

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        forgotPassword();
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDialog dialog = new LoginDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblHideShowPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    public void close() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private void logIn() {
        //login
        if(txtUser.getText().isBlank() || txtUser.getText().isEmpty() || pswPassword.getText().isBlank() || pswPassword.getText().isEmpty()) {
            System.out.println("Los campos no pueden estar vacios");
        } else{
            if (checkUser() == true) {
                main.setLoggedIn(true);
                this.dispose();
            } else System.out.print("Usuario no registrado");
        }
    }

    private void signUp() {
        SignUpDialog sud = new SignUpDialog((Frame) this.getParent(), true);
        this.dispose();
        sud.setVisible(true);
    }

    private boolean checkUser() {
        String password = helper.encryptPassword(pswPassword.getText());
        String userName = txtUser.getText();

        for (User u : dataAccess.getUsers()) {
            if (password.equals(u.getPassword()) && userName.equals(u.getUsername())) {
                System.out.println("Usuario logeado");
                main.setLoggedInUser(u);
                return true;
            }
        }
        return false;
    }

    private void forgotPassword() {
        ForgotPasswordDialog fpd = new ForgotPasswordDialog((Frame) this.getParent(), true);
        fpd.setVisible(true);
    }
}
