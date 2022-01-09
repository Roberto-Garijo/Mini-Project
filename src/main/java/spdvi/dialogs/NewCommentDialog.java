package spdvi.dialogs;

import java.sql.Date;
import java.time.LocalDate;
import spdvi.Main;
import spdvi.POJOs.Comment;
import spdvi.POJOs.Place;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;

public class NewCommentDialog extends javax.swing.JDialog {

    int rating = 1;
    Helpers helpers = new Helpers();
    Main main;
    DataAccess dataAccess = new DataAccess();

    public NewCommentDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        main = (Main) this.getParent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComment = new javax.swing.JTextArea();
        lblChars = new javax.swing.JLabel();
        btnDiscard = new javax.swing.JButton();
        btnPublish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New comment");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblStar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/218-star-full.png"))); // NOI18N
        lblStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStar1MouseClicked(evt);
            }
        });

        lblStar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/216-star-empty.png"))); // NOI18N
        lblStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStar2MouseClicked(evt);
            }
        });

        lblStar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/216-star-empty.png"))); // NOI18N
        lblStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStar3MouseClicked(evt);
            }
        });

        lblStar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/216-star-empty.png"))); // NOI18N
        lblStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStar4MouseClicked(evt);
            }
        });

        lblStar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/216-star-empty.png"))); // NOI18N
        lblStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStar5MouseClicked(evt);
            }
        });

        lblRating.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblRating.setForeground(new java.awt.Color(0, 0, 0));
        lblRating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRating.setText("1");

        txaComment.setColumns(20);
        txaComment.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txaComment.setLineWrap(true);
        txaComment.setRows(5);
        txaComment.setWrapStyleWord(true);
        txaComment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txaCommentKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txaComment);

        lblChars.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChars.setText("0/255");

        btnDiscard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/173-bin.png"))); // NOI18N
        btnDiscard.setText("Discard");
        btnDiscard.setFocusable(false);
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });

        btnPublish.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPublish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/108-bubble.png"))); // NOI18N
        btnPublish.setText("Publish");
        btnPublish.setFocusable(false);
        btnPublish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRating, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(140, 140, 140))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChars, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnDiscard)
                .addGap(38, 38, 38)
                .addComponent(btnPublish)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChars)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPublish)
                    .addComponent(btnDiscard))
                .addGap(34, 34, 34))
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

    private void lblStar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar1MouseClicked
        setRating(1);
    }//GEN-LAST:event_lblStar1MouseClicked

    private void lblStar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar2MouseClicked
        setRating(2);
    }//GEN-LAST:event_lblStar2MouseClicked

    private void lblStar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar3MouseClicked
        setRating(3);
    }//GEN-LAST:event_lblStar3MouseClicked

    private void lblStar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar4MouseClicked
        setRating(4);
    }//GEN-LAST:event_lblStar4MouseClicked

    private void lblStar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar5MouseClicked
        setRating(5);
    }//GEN-LAST:event_lblStar5MouseClicked

    private void txaCommentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txaCommentKeyTyped
        int chars = txaComment.getText().length() + 1;
        lblChars.setText(String.format("%d/255", chars));
        if (chars > 255) {
            //txaComment.setBackground(Color.red);
            btnPublish.setEnabled(false);
        } else {
            //txaComment.setBackground(Color.white);
            btnPublish.setEnabled(true);
        }
    }//GEN-LAST:event_txaCommentKeyTyped

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDiscardActionPerformed

    private void btnPublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishActionPerformed
        if (txaComment.getText().isBlank() || txaComment.getText().isEmpty()) {
            helpers.showInfoMessage("Write some text to the comment", this);
        } else {
            Place place = (Place) main.getSelectedPlace();
            dataAccess.newComment(new Comment(1, txaComment.getText(), Date.valueOf(LocalDate.now()), rating, main.getLoggedInUser().getId(), place.getRegistre()));
            helpers.showInfoMessage("Comment posted", this);
            this.dispose();
        }
    }//GEN-LAST:event_btnPublishActionPerformed

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
            java.util.logging.Logger.getLogger(NewCommentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCommentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCommentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCommentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewCommentDialog dialog = new NewCommentDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnPublish;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChars;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    private javax.swing.JTextArea txaComment;
    // End of variables declaration//GEN-END:variables

    private void setRating(int ratingParam) {
        rating = ratingParam;
        helpers.setRatingBig1(lblStar1, lblStar2, lblStar3, lblStar4, lblStar5, rating);
        lblRating.setText(rating + "");
    }
}
