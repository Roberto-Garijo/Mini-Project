package spdvi.dialogs;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import spdvi.util.ImageUtils;

public class InfoDialog extends javax.swing.JDialog {

    private ImageUtils imageUtils = new ImageUtils();

    private int index = 0;

    private String[] texts = {
        "Pagina uno de la guia",
        "Página dos de la guia",
        "asdfasdfasdfassdfasdfasd asdf asdf asdfadsf asdfasdfasf",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, "
    };

    private String[] images = {
        "ruta foto 1",
        "ruta foto 2"
    };

    public InfoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        changePage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAbout = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        pnlGuide = new javax.swing.JPanel();
        lblText = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblArrowLeft = new javax.swing.JLabel();
        lblArrowRight = new javax.swing.JLabel();
        lblPage = new javax.swing.JLabel();
        pnlGithub = new javax.swing.JPanel();
        btnGithub = new javax.swing.JButton();
        lblPau = new javax.swing.JLabel();
        lblAlejo = new javax.swing.JLabel();
        lblRoberto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnlAbout.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        lblVersion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(0, 0, 0));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("Version 1.0");

        javax.swing.GroupLayout pnlAboutLayout = new javax.swing.GroupLayout(pnlAbout);
        pnlAbout.setLayout(pnlAboutLayout);
        pnlAboutLayout.setHorizontalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblVersion)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        pnlAboutLayout.setVerticalGroup(
            pnlAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAboutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVersion)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", pnlAbout);

        pnlGuide.setBackground(new java.awt.Color(255, 255, 255));

        lblText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblText.setText("<html><p style=\\\"width:180px\\\">text</p></html>");
        lblText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"))); // NOI18N

        lblArrowLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrowLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/325-circle-left.png"))); // NOI18N
        lblArrowLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArrowLeftMouseClicked(evt);
            }
        });

        lblArrowRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArrowRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/323-circle-right.png"))); // NOI18N
        lblArrowRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArrowRightMouseClicked(evt);
            }
        });

        lblPage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPage.setText("1 / 2");

        javax.swing.GroupLayout pnlGuideLayout = new javax.swing.GroupLayout(pnlGuide);
        pnlGuide.setLayout(pnlGuideLayout);
        pnlGuideLayout.setHorizontalGroup(
            pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuideLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGuideLayout.createSequentialGroup()
                        .addComponent(lblArrowLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArrowRight, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGuideLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlGuideLayout.setVerticalGroup(
            pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuideLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblArrowLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblArrowRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Guide", pnlGuide);

        pnlGithub.setBackground(new java.awt.Color(255, 255, 255));

        btnGithub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/433-github.png"))); // NOI18N
        btnGithub.setText("Open Github page");
        btnGithub.setFocusable(false);
        btnGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGithubActionPerformed(evt);
            }
        });

        lblPau.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPau.setForeground(new java.awt.Color(0, 0, 0));
        lblPau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devs/pau.png"))); // NOI18N
        lblPau.setText("Pau Prats - pauprats2002");

        lblAlejo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAlejo.setForeground(new java.awt.Color(0, 0, 0));
        lblAlejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devs/alejo.png"))); // NOI18N
        lblAlejo.setText("Alejo Pinto - AlejoPinto01");

        lblRoberto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRoberto.setForeground(new java.awt.Color(0, 0, 0));
        lblRoberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devs/roberto.png"))); // NOI18N
        lblRoberto.setText("Roberto Garijo - Roberto-Garijo");

        javax.swing.GroupLayout pnlGithubLayout = new javax.swing.GroupLayout(pnlGithub);
        pnlGithub.setLayout(pnlGithubLayout);
        pnlGithubLayout.setHorizontalGroup(
            pnlGithubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGithubLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(btnGithub)
                .addGap(186, 186, 186))
            .addGroup(pnlGithubLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlGithubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoberto)
                    .addComponent(lblAlejo)
                    .addComponent(lblPau))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGithubLayout.setVerticalGroup(
            pnlGithubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGithubLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblPau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlejo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRoberto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnGithub)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Github", pnlGithub);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblArrowLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArrowLeftMouseClicked
        index--;
        if (index < 0) {
            index = texts.length - 1;
        }
        changePage();
    }//GEN-LAST:event_lblArrowLeftMouseClicked

    private void lblArrowRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArrowRightMouseClicked
        index++;
        if (index > texts.length - 1) {
            index = 0;
        }
        changePage();
    }//GEN-LAST:event_lblArrowRightMouseClicked

    private void btnGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGithubActionPerformed
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/Roberto-Garijo/Mini-Project"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(InfoDialog.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InfoDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGithubActionPerformed

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
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InfoDialog dialog = new InfoDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGithub;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAlejo;
    private javax.swing.JLabel lblArrowLeft;
    private javax.swing.JLabel lblArrowRight;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPage;
    private javax.swing.JLabel lblPau;
    private javax.swing.JLabel lblRoberto;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel pnlAbout;
    private javax.swing.JPanel pnlGithub;
    private javax.swing.JPanel pnlGuide;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

    private void changePage() {
        lblPage.setText(String.format("%d / %d", index + 1, texts.length));
        lblText.setText(String.format("<html><p style=\\\"width:180px\\\">%s</p></html>", texts[index]));
    }
}
