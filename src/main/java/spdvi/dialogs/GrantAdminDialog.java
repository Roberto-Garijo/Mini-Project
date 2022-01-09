package spdvi.dialogs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import spdvi.POJOs.User;
import spdvi.dataaccess.DataAccess;
import spdvi.util.Helpers;

public class GrantAdminDialog extends javax.swing.JDialog {

    private DataAccess dataAccess = new DataAccess();
    JList<User> lstUsers = new JList<>();
    ArrayList<User> users;
    private Helpers helpers = new Helpers();

    public GrantAdminDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        users = dataAccess.getUsers();
        scrUsers.setViewportView(lstUsers);
        lstUsers.setSelectionForeground(Color.BLACK);
        lstUsers.setFont(new java.awt.Font("Segoe UI", 0, 15));
        lstUsers.setSelectionBackground(new java.awt.Color(0, 204, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panUsers = new javax.swing.JPanel();
        scrUsers = new javax.swing.JScrollPane();
        btnAdmin = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panUsers.setBackground(new java.awt.Color(255, 255, 255));

        btnAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdmin.setText("Grant Admin");
        btnAdmin.setFocusable(false);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/135-search.png"))); // NOI18N
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panUsersLayout = new javax.swing.GroupLayout(panUsers);
        panUsers.setLayout(panUsersLayout);
        panUsersLayout.setHorizontalGroup(
            panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUsersLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnAdmin)
                        .addComponent(scrUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panUsersLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panUsersLayout.setVerticalGroup(
            panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUsersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmin)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        grantAdmin();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadUsers();
    }//GEN-LAST:event_formWindowOpened

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchUser();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        searchUser();
    }//GEN-LAST:event_lblSearchMouseClicked

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
            java.util.logging.Logger.getLogger(GrantAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrantAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrantAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrantAdminDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GrantAdminDialog dialog = new GrantAdminDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdmin;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel panUsers;
    private javax.swing.JScrollPane scrUsers;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void getUsers() {
        users = dataAccess.getUsers();
    }

    private void loadUsers() {
        DefaultListModel<User> userListModel = new DefaultListModel<>();
        for (User user : users) {
            if (!user.isIsAdmin()) {
                userListModel.addElement(user);
            }
        }
        lstUsers.setModel(userListModel);
    }

    public void searchUser() {
        String search = txtSearch.getText().toLowerCase();
        DefaultListModel<User> userListModel = new DefaultListModel<>();
        if (!search.isBlank() || !search.isEmpty()) {
            for (User user : users) {
                if (user.getUsername().toLowerCase().contains(search)) {
                    if (!user.isIsAdmin()) {
                        userListModel.addElement(user);
                    }
                }
            }
            lstUsers.setModel(userListModel);
        } else {
            loadUsers();
        }
    }

    private void grantAdmin() {
        User user = lstUsers.getSelectedValue();
        if (user == null) {
            helpers.showErrorMessage("Must select a user to grant admin.", this);
        } else {
            dataAccess.grantAdmin(user.getUsername());
            helpers.showInfoMessage(String.format("User %s is now admin.", user.getUsername()), this);
            getUsers();
            loadUsers();
        }
    }
}
