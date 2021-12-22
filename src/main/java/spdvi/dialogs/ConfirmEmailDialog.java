package spdvi.dialogs;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import spdvi.dataaccess.DataAccess;
import spdvi.dialogs.SignUpDialog;

public class ConfirmEmailDialog extends javax.swing.JDialog {

    private String artMail = "artbalearempresa@gmail.com";
    private String contrasena = "root2002";//esto tambien es una aberracion >:(
    private String emailCode;

    DataAccess dataAccess = new DataAccess();

    public ConfirmEmailDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmationCode = new javax.swing.JTextField();
        lblCheckButton = new javax.swing.JLabel();
        btnResend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("We have sent a verification code to your E-mail.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter the code below to create your account");

        txtConfirmationCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmationCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmationCodeKeyPressed(evt);
            }
        });

        lblCheckButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCheckButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/273-checkmark.png"))); // NOI18N
        lblCheckButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckButtonMouseClicked(evt);
            }
        });

        btnResend.setText("Resend code");
        btnResend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtConfirmationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmationCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnResend)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void lblCheckButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckButtonMouseClicked
        checkCode();
    }//GEN-LAST:event_lblCheckButtonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sendConfirmationCode();
    }//GEN-LAST:event_formWindowOpened

    private void txtConfirmationCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmationCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkCode();
        }
    }//GEN-LAST:event_txtConfirmationCodeKeyPressed

    private void btnResendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResendActionPerformed
        sendConfirmationCode();
    }//GEN-LAST:event_btnResendActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmEmailDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmEmailDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmEmailDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmEmailDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfirmEmailDialog dialog = new ConfirmEmailDialog(new javax.swing.JFrame(), true);
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

    public int generateCode() {
        double fiveDigits = 10000 + Math.random() * 90000;
        return (int) fiveDigits;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCheckButton;
    private javax.swing.JTextField txtConfirmationCode;
    // End of variables declaration//GEN-END:variables

    private void checkCode() {
        if (txtConfirmationCode.getText().length() == 5 && txtConfirmationCode.getText().equals(emailCode)) {
            //dataAccess.createUser();
            this.dispose();
        } else {
            System.err.println("not valid");
        }
    }

    private void sendConfirmationCode() {
        emailCode = String.valueOf(generateCode());
        SignUpDialog sud = new SignUpDialog((Frame) this.getParent(), true);
        System.out.println(emailCode);
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props);
        session.getProperties().put("mail.smtp.ssl.trust", "smtp.gmail.com");

        try {
            // Define message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(artMail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(sud.getEmail()));//esto es una aberracion, hay que pasar el email por parámetro de alguna forma
            message.setSubject("Confirmación de cuenta");
            message.setText("Introduce el siguiente codigo de verificación: " + emailCode);
            // Envia el mensaje
            Transport transport = session.getTransport("smtp");
            transport.connect(artMail, contrasena);
            transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transport.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
