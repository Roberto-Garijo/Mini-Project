package spdvi.dialogs;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import spdvi.Main;
import spdvi.POJOs.Place;
import spdvi.dataaccess.DataAccess;

public class ChangeVisibilityDialog extends javax.swing.JDialog {

    private Main main;
    private DataAccess dataAccess = new DataAccess();
    private JList<Place> lstPlaces = new JList<>();
    private ArrayList<Place> places;
    private javax.swing.ImageIcon visibleIcon = new javax.swing.ImageIcon(getClass().getResource("/icons/16px/207-eye.png"));
    private javax.swing.ImageIcon invisibleIcon = new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png"));

    public ChangeVisibilityDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initApp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        scrPlaceList = new javax.swing.JScrollPane();
        btnVisibility = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnl.setBackground(new java.awt.Color(255, 255, 255));

        btnVisibility.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/207-eye.png"))); // NOI18N
        btnVisibility.setText("Change Visibility");
        btnVisibility.setFocusable(false);
        btnVisibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisibilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVisibility)
                    .addComponent(scrPlaceList, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(scrPlaceList, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVisibility)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultListModel<Place> placesDlm = new DefaultListModel<>();
        for (Place place : places) {
            placesDlm.addElement(place);
        }
        lstPlaces.setModel(placesDlm);
    }//GEN-LAST:event_formWindowOpened

    private void btnVisibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisibilityActionPerformed
        updateVisibility();
    }//GEN-LAST:event_btnVisibilityActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeVisibilityDialog dialog = new ChangeVisibilityDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVisibility;
    private javax.swing.JPanel pnl;
    private javax.swing.JScrollPane scrPlaceList;
    // End of variables declaration//GEN-END:variables

    private void initApp() {
        setLocationRelativeTo(null);
        main = (Main) this.getParent();
        places = main.getPlaces();
        scrPlaceList.setViewportView(lstPlaces);
        lstPlaces.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPlacesValueChanged(evt);
            }
        });
        lstPlaces.setSelectionBackground(new java.awt.Color(0, 204, 255));
        lstPlaces.setSelectionForeground(Color.BLACK);
        lstPlaces.setFont(new java.awt.Font("Segoe UI", 0, 15));
    }

    private void lstPlacesValueChanged(ListSelectionEvent evt) {
        Place selectedPlace = (Place) lstPlaces.getSelectedValue();
        if (!evt.getValueIsAdjusting()) {
            updateIcon(selectedPlace.isVisible());
        }
    }

    private void updateIcon(boolean visible) {
        if (visible) {
            btnVisibility.setIcon(visibleIcon);
        } else {
            btnVisibility.setIcon(invisibleIcon);
        }
    }

    private void updateVisibility() {
        Place place = lstPlaces.getSelectedValue();
        dataAccess.setVisible(place.getRegistre(), !place.isVisible());
        place.setVisible(!place.isVisible());
        updateIcon(place.isVisible());
    }
}
