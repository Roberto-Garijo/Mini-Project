package spdvi.dialogs;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import spdvi.POJOs.Place;
import spdvi.dataaccess.AzureBlobs;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;
import spdvi.util.ImageUtils;

public class NewPlaceDialog extends javax.swing.JDialog {

    private JFileChooser fileChooser;
    private String[] images = new String[5];
    private int imageIndex = 0;
    private javax.swing.ImageIcon noImage = new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"));
    private ImageUtils imageUtils = new ImageUtils();
    private javax.swing.JLabel[] imageLabels = new javax.swing.JLabel[5];
    private DataAccess dataAccess = new DataAccess();
    private AzureBlobs azureBlobs = new AzureBlobs();
    private Helpers helpers = new Helpers();

    public NewPlaceDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        imageLabels[0] = lblAddImage1;
        imageLabels[1] = lblAddImage2;
        imageLabels[2] = lblAddImage3;
        imageLabels[3] = lblAddImage4;
        imageLabels[4] = lblAddImage5;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        lblDescription = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        cmbMunicipality = new javax.swing.JComboBox<>();
        lblType = new javax.swing.JLabel();
        lblMunicipality = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblWeb = new javax.swing.JLabel();
        txtWeb = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblAddImage = new javax.swing.JLabel();
        lblAddImage1 = new javax.swing.JLabel();
        lblAddImage2 = new javax.swing.JLabel();
        lblAddImage3 = new javax.swing.JLabel();
        lblAddImage4 = new javax.swing.JLabel();
        lblAddImage5 = new javax.swing.JLabel();
        btnClearText = new javax.swing.JButton();
        btnClearImages = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name*");

        txaDescription.setColumns(20);
        txaDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txaDescription.setLineWrap(true);
        txaDescription.setRows(5);
        txaDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaDescription);

        lblDescription.setForeground(new java.awt.Color(0, 0, 0));
        lblDescription.setText("Description*");

        cmbType.setEditable(true);

        cmbMunicipality.setEditable(true);

        lblType.setForeground(new java.awt.Color(0, 0, 0));
        lblType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/034-library.png"))); // NOI18N
        lblType.setText("Type*");

        lblMunicipality.setForeground(new java.awt.Color(0, 0, 0));
        lblMunicipality.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/072-location.png"))); // NOI18N
        lblMunicipality.setText("Municipality*");

        lblAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/071-pushpin.png"))); // NOI18N
        lblAddress.setText("Address");

        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/389-mail2.png"))); // NOI18N
        lblEmail.setText("E-mail");

        lblWeb.setForeground(new java.awt.Color(0, 0, 0));
        lblWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/203-earth.png"))); // NOI18N
        lblWeb.setText("Web");

        lblPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblPhoneNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/067-phone.png"))); // NOI18N
        lblPhoneNumber.setText("Phone number");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblAddImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/267-plus.png"))); // NOI18N
        lblAddImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddImageMouseClicked(evt);
            }
        });

        lblAddImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"))); // NOI18N

        lblAddImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"))); // NOI18N

        lblAddImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"))); // NOI18N

        lblAddImage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"))); // NOI18N

        lblAddImage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblAddImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblAddImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnClearText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/368-clear-formatting.png"))); // NOI18N
        btnClearText.setText("Clear text");
        btnClearText.setFocusable(false);
        btnClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTextActionPerformed(evt);
            }
        });

        btnClearImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/015-images.png"))); // NOI18N
        btnClearImages.setText("Clear images");
        btnClearImages.setFocusable(false);
        btnClearImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearImagesActionPerformed(evt);
            }
        });

        btnClearAll.setBackground(new java.awt.Color(255, 0, 0));
        btnClearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/173-bin.png"))); // NOI18N
        btnClearAll.setText("Clear all");
        btnClearAll.setFocusable(false);
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        btnUpload.setBackground(new java.awt.Color(0, 255, 0));
        btnUpload.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/196-cloud-upload.png"))); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.setFocusable(false);
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClearText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress)
                            .addComponent(txtEmail)
                            .addComponent(txtPhoneNumber)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMunicipality)))
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtWeb))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblType)
                    .addComponent(lblMunicipality))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWeb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPhoneNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearImages, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void btnClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTextActionPerformed
        clearText();
    }//GEN-LAST:event_btnClearTextActionPerformed

    private void btnClearImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearImagesActionPerformed
        clearImages();
    }//GEN-LAST:event_btnClearImagesActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        clearText();
        clearImages();
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        uploadPlace();
    }//GEN-LAST:event_btnUploadActionPerformed

    private void lblAddImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddImageMouseClicked
        addImage();
    }//GEN-LAST:event_lblAddImageMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadComboBoxes();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(NewPlaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPlaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPlaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPlaceDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewPlaceDialog dialog = new NewPlaceDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnClearImages;
    private javax.swing.JButton btnClearText;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> cmbMunicipality;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddImage;
    private javax.swing.JLabel lblAddImage1;
    private javax.swing.JLabel lblAddImage2;
    private javax.swing.JLabel lblAddImage3;
    private javax.swing.JLabel lblAddImage4;
    private javax.swing.JLabel lblAddImage5;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMunicipality;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblWeb;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables

    private void clearText() {
        txtName.setText("");
        txaDescription.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtWeb.setText("");
        cmbMunicipality.setSelectedIndex(0);
        cmbType.setSelectedIndex(0);
    }

    private void clearImages() {
        for (int i = 0; i < 5; i++) {
            images[i] = "";
            imageLabels[i].setIcon(noImage);
            imageIndex = 0;
            lblAddImage.setEnabled(true);
        }
    }

    private void uploadPlace() {
        if (checkCorrectPlace()) {
            Place place = new Place();
            place.setRegistre(dataAccess.getPlaceRegistre());
            place.setName(txtName.getText());
            place.setAddress(txtAddress.getText());
            place.setDescription(txaDescription.getText());
            place.setEmail(txtEmail.getText());
            place.setVisible(true);
            place.setMunicipality(cmbMunicipality.getSelectedItem().toString());
            place.setType(cmbType.getSelectedItem().toString());
            place.setWeb(txtWeb.getText());
            dataAccess.newPlace(place);
            for (String image : images) {
                if (!image.isBlank() || !image.isEmpty()) {
                    File imageFile = new File(image);
                    azureBlobs.uploadImage(imageFile);
                    dataAccess.insertImage(imageFile.getName(), place.getRegistre());
                }
            }
            helpers.showInfoMessage("Place uploaded successfully!", this);
        }
    }

    private void addImage() {
        if (imageIndex != 5) {
            fileChooser = new JFileChooser();
            int returnOption = fileChooser.showOpenDialog(this);
            if (returnOption == JFileChooser.APPROVE_OPTION) {
                if (checkImageName()) {
                    helpers.showErrorMessage("This image name already exists", this);
                } else {
                    images[imageIndex] = fileChooser.getSelectedFile().getAbsolutePath();
                    imageUtils.setLabelIconImage(imageLabels[imageIndex], images[imageIndex]);
                }
                imageIndex++;
            }
        }
    }

    private void loadComboBoxes() {
        DefaultComboBoxModel municipalities = new DefaultComboBoxModel<>();
        for (String distinctMunicipalyty : dataAccess.getDistinctMunicipalyties()) {
            municipalities.addElement(distinctMunicipalyty);
        }
        cmbMunicipality.setModel(municipalities);
        DefaultComboBoxModel types = new DefaultComboBoxModel<>();
        for (String type : dataAccess.getDistinctTypes()) {
            types.addElement(type);
        }
        cmbType.setModel(types);
    }

    private boolean checkImageName() {
        if (azureBlobs.checkImages(fileChooser.getSelectedFile().getName())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkCorrectPlace() {
        String name = txtName.getText();
        String description = txaDescription.getText();
        String municipality = cmbMunicipality.getSelectedItem().toString();
        String type = cmbType.getSelectedItem().toString();
        if (name.isBlank() || name.isEmpty()) {
            helpers.showErrorMessage("Must have a name", this);
            return false;
        }
        if (description.isBlank() || description.isEmpty()) {
            helpers.showErrorMessage("Must have a description", this);
            return false;
        }
        if (municipality.isBlank() || municipality.isEmpty()) {
            helpers.showErrorMessage("Introduce municipality", this);
            return false;
        }
        if (type.isBlank() || type.isEmpty()) {
            helpers.showErrorMessage("Introduce a place type", this);
            return false;
        }
        if (images[0] == null || images[0].isBlank() || images[0].isEmpty()) {
            helpers.showErrorMessage("Must have at least one picture", this);
            return false;
        }
        return true;
    }
}
