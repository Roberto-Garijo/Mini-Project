package spdvi.dialogs;

import javax.swing.DefaultComboBoxModel;
import spdvi.Main;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;

public class FilterDialog extends javax.swing.JDialog {

    private Main main;
    private Helpers helpers = new Helpers();
    private DataAccess dataAccess = new DataAccess();
    private int rating;

    public FilterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        main = (Main) this.getParent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbMunicipality = new javax.swing.JComboBox<>();
        lblMunicipalityIcon = new javax.swing.JLabel();
        lblTypeIcon = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        btnApply = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmbMunicipality.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMunicipality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));

        lblMunicipalityIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMunicipalityIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/072-location.png"))); // NOI18N

        lblTypeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTypeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/034-library.png"))); // NOI18N

        cmbType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any" }));

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

        btnApply.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnApply.setText("Apply filter");
        btnApply.setFocusable(false);
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("Clear filter");
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTypeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lblMunicipalityIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblStar1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblStar2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblStar3))
                                .addComponent(btnClear))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblStar4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblStar5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblRating, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnApply)))))
                    .addComponent(cmbMunicipality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipalityIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTypeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApply)
                    .addComponent(btnClear))
                .addGap(13, 13, 13))
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

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        applyFilter();
    }//GEN-LAST:event_btnApplyActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadComboBoxes();
    }//GEN-LAST:event_formWindowOpened

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFilter();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(FilterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FilterDialog dialog = new FilterDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbMunicipality;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMunicipalityIcon;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    private javax.swing.JLabel lblTypeIcon;
    // End of variables declaration//GEN-END:variables

    private void setRating(int ratingParam) {
        rating = ratingParam;
        helpers.setRatingBig1(lblStar1, lblStar2, lblStar3, lblStar4, lblStar5, rating);
        lblRating.setText(rating + "");
    }

    private void applyFilter() {
        main.setTypeFilter(cmbType.getSelectedItem().toString());
        main.setMunicipalityFilter(cmbMunicipality.getSelectedItem().toString());
        main.setRatingFilter(rating);
        this.dispose();
    }

    private void loadComboBoxes() {
        DefaultComboBoxModel municipalities = new DefaultComboBoxModel<>();
        municipalities.addElement("Any");
        for (String distinctMunicipalyty : dataAccess.getDistinctMunicipalyties()) {
            municipalities.addElement(distinctMunicipalyty);
        }
        cmbMunicipality.setModel(municipalities);

        DefaultComboBoxModel types = new DefaultComboBoxModel<>();
        types.addElement("Any");
        for (String type : dataAccess.getDistinctTypes()) {
            types.addElement(type);
        }
        cmbType.setModel(types);
    }

    private void clearFilter() {
        main.setTypeFilter("Any");
        main.setMunicipalityFilter("Any");
        main.setRatingFilter(0);
        this.dispose();
    }
}
