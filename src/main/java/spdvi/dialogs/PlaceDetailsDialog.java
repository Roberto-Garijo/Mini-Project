package spdvi.dialogs;

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import spdvi.Main;
import spdvi.POJOs.Comment;
import spdvi.POJOs.Place;
import spdvi.dataaccess.AzureBlobs;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;
import spdvi.util.ImageUtils;

public class PlaceDetailsDialog extends javax.swing.JDialog implements Runnable {

    private Main main;
    private DataAccess dataAccess = new DataAccess();
    private Place place;
    private ArrayList<Comment> comments;
    private ArrayList<BufferedImage> pictures;
    private int commentIndex = 0;
    private int imageIndex = 0;
    private Helpers helpers = new Helpers();
    private AzureBlobs azureBlobs = new AzureBlobs();
    private ImageUtils imageUtils = new ImageUtils();

    public PlaceDetailsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        main = (Main) this.getParent();
        place = (Place) main.getSelectedPlace();
        comments = dataAccess.getComments(place);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPreviousImage = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblNextImage = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlDetails = new javax.swing.JPanel();
        lblMunicipality = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblWeb = new javax.swing.JLabel();
        pnlDescription = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        pnlComments = new javax.swing.JPanel();
        lblUserIcon = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComment = new javax.swing.JTextArea();
        lblPreviousComment = new javax.swing.JLabel();
        lblNextComment = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblCommentIndex = new javax.swing.JLabel();
        lblTotalComments = new javax.swing.JLabel();
        lblSlash = new javax.swing.JLabel();
        btnComment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Place name");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblPreviousImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/325-circle-left.png"))); // NOI18N
        lblPreviousImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPreviousImageMouseClicked(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/323-circle-right.png"))); // NOI18N
        lblNextImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPreviousImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNextImage)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreviousImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNextImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        pnlDetails.setBackground(new java.awt.Color(255, 255, 255));

        lblMunicipality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMunicipality.setForeground(new java.awt.Color(0, 0, 0));
        lblMunicipality.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/072-location.png"))); // NOI18N
        lblMunicipality.setText("Localization");

        lblType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(0, 0, 0));
        lblType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/034-library.png"))); // NOI18N
        lblType.setText("Museum");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/071-pushpin.png"))); // NOI18N
        lblAddress.setText("Calle");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/389-mail2.png"))); // NOI18N
        lblEmail.setText("asdf@asdf.as");

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblPhoneNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/067-phone.png"))); // NOI18N
        lblPhoneNumber.setText("999999999");

        lblWeb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWeb.setForeground(new java.awt.Color(0, 0, 0));
        lblWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/203-earth.png"))); // NOI18N
        lblWeb.setText("www.asdf.as");

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMunicipality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Details", pnlDetails);

        pnlDescription.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(255, 255, 255));
        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txaDescription.setForeground(new java.awt.Color(0, 0, 0));
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setWrapStyleWord(true);
        txaDescription.setBorder(null);
        jScrollPane2.setViewportView(txaDescription);

        javax.swing.GroupLayout pnlDescriptionLayout = new javax.swing.GroupLayout(pnlDescription);
        pnlDescription.setLayout(pnlDescriptionLayout);
        pnlDescriptionLayout.setHorizontalGroup(
            pnlDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDescriptionLayout.setVerticalGroup(
            pnlDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Description", pnlDescription);

        pnlComments.setBackground(new java.awt.Color(255, 255, 255));

        lblUserIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserIcon.setForeground(new java.awt.Color(0, 0, 0));
        lblUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/48px/114-user.png"))); // NOI18N
        lblUserIcon.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("-");
        lblUsername.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/218-star-full.png"))); // NOI18N

        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/218-star-full.png"))); // NOI18N

        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/218-star-full.png"))); // NOI18N

        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/218-star-full.png"))); // NOI18N

        lblStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/218-star-full.png"))); // NOI18N

        jScrollPane1.setBorder(null);

        txaComment.setEditable(false);
        txaComment.setColumns(20);
        txaComment.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txaComment.setLineWrap(true);
        txaComment.setRows(5);
        txaComment.setWrapStyleWord(true);
        txaComment.setBorder(null);
        jScrollPane1.setViewportView(txaComment);

        lblPreviousComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/325-circle-left.png"))); // NOI18N
        lblPreviousComment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPreviousCommentMouseClicked(evt);
            }
        });

        lblNextComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/323-circle-right.png"))); // NOI18N
        lblNextComment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextCommentMouseClicked(evt);
            }
        });

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("20-05-2020");

        lblCommentIndex.setForeground(new java.awt.Color(0, 0, 0));
        lblCommentIndex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommentIndex.setText("1");

        lblTotalComments.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalComments.setText("1");

        lblSlash.setForeground(new java.awt.Color(0, 0, 0));
        lblSlash.setText("/");

        javax.swing.GroupLayout pnlCommentsLayout = new javax.swing.GroupLayout(pnlComments);
        pnlComments.setLayout(pnlCommentsLayout);
        pnlCommentsLayout.setHorizontalGroup(
            pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCommentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlCommentsLayout.createSequentialGroup()
                        .addComponent(lblUserIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCommentsLayout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlCommentsLayout.createSequentialGroup()
                                .addComponent(lblStar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStar4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStar5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlCommentsLayout.createSequentialGroup()
                        .addComponent(lblPreviousComment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(lblCommentIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSlash)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalComments, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(lblNextComment)))
                .addContainerGap())
        );
        pnlCommentsLayout.setVerticalGroup(
            pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCommentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCommentsLayout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStar1)
                            .addComponent(lblStar2)
                            .addComponent(lblStar3)
                            .addComponent(lblStar4)
                            .addComponent(lblStar5)
                            .addComponent(lblDate)))
                    .addComponent(lblUserIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(pnlCommentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSlash)
                    .addComponent(lblCommentIndex)
                    .addComponent(lblTotalComments)
                    .addComponent(lblNextComment)
                    .addComponent(lblPreviousComment))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Comments", pnlComments);

        btnComment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComment.setText("Comment");
        btnComment.setFocusable(false);
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComment)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComment)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadData();
    }//GEN-LAST:event_formWindowOpened

    private void lblPreviousCommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreviousCommentMouseClicked
        commentIndex--;
        if (commentIndex < 0) {
            commentIndex = comments.size() - 1;
        }
        loadComment();
    }//GEN-LAST:event_lblPreviousCommentMouseClicked

    private void lblNextCommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextCommentMouseClicked
        commentIndex++;
        if (commentIndex > comments.size() - 1) {
            commentIndex = 0;
        }
        loadComment();
    }//GEN-LAST:event_lblNextCommentMouseClicked

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentActionPerformed
        newComment();
    }//GEN-LAST:event_btnCommentActionPerformed

    private void lblPreviousImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPreviousImageMouseClicked
        imageIndex--;
        if (imageIndex < 0) {
            imageIndex = pictures.size() - 1;
        }
        changePicture();
    }//GEN-LAST:event_lblPreviousImageMouseClicked

    private void lblNextImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextImageMouseClicked
        imageIndex++;
        if (imageIndex > pictures.size() - 1) {
            imageIndex = 0;
        }
        changePicture();
    }//GEN-LAST:event_lblNextImageMouseClicked

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
            java.util.logging.Logger.getLogger(PlaceDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceDetailsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlaceDetailsDialog dialog = new PlaceDetailsDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnComment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCommentIndex;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNextComment;
    private javax.swing.JLabel lblNextImage;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPreviousComment;
    private javax.swing.JLabel lblPreviousImage;
    private javax.swing.JLabel lblSlash;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    private javax.swing.JLabel lblTotalComments;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWeb;
    private javax.swing.JPanel pnlComments;
    private javax.swing.JPanel pnlDescription;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JTextArea txaComment;
    private javax.swing.JTextArea txaDescription;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        lblName.setText(place.getName());
        lblType.setText(place.getType());
        lblMunicipality.setText(place.getMunicipality());
        txaDescription.setText(place.getDescription());
        lblAddress.setText(String.format("<html><p style=\\\"width:100px\\\">%s</p></html>", place.getAddress()));
        lblPhoneNumber.setText(place.getPhoneNumber());
        lblWeb.setText(place.getWeb());
        lblEmail.setText(place.getEmail());
        loadComment();
        Thread imagesThread = new Thread(this);
        imagesThread.start();
    }

    private void loadComment() {
        if (comments.size() > 0) {
            lblTotalComments.setText(String.format("%d", comments.size()));
            lblCommentIndex.setText(String.format("%d", commentIndex + 1));
            txaComment.setText(comments.get(commentIndex).getText());
            lblUsername.setText(comments.get(commentIndex).getUsername());
            lblDate.setText(comments.get(commentIndex).getDateTime().toString());
            helpers.setRatingSmall(lblStar1, lblStar2, lblStar3, lblStar4, lblStar5, comments.get(commentIndex).getRating());
        }
    }

    private void newComment() {
        NewCommentDialog ncd = new NewCommentDialog((Frame) this.getParent(), true);
        ncd.setVisible(true);
        comments = dataAccess.getComments(place);
        loadComment();
    }

    private void loadImages() {
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loading.gif")));
        pictures = azureBlobs.downloadPlaceImages(place);
        ImageIcon icon = imageUtils.resizeImageIcon(pictures.get(imageIndex), lblImage.getWidth(), lblImage.getHeight());
        lblImage.setIcon(icon);
    }

    private void changePicture() {
        ImageIcon icon = imageUtils.resizeImageIcon(pictures.get(imageIndex), lblImage.getWidth(), lblImage.getHeight());
        lblImage.setIcon(icon);
    }

    @Override
    public void run() {
        loadImages();
    }
}
