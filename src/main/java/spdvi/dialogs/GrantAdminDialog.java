package spdvi.dialogs;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import spdvi.POJOs.User;
import spdvi.dataaccess.DataAccess;

public class GrantAdminDialog extends javax.swing.JDialog {
    private DataAccess dataAccess = new DataAccess();
    JList<User> lstUsers = new JList<>();
    
    public GrantAdminDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jScrollPane1.setViewportView(lstUsers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panUsers = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panUsers.setBackground(new java.awt.Color(255, 255, 255));

        btnAdmin.setText("Grant Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panUsersLayout = new javax.swing.GroupLayout(panUsers);
        panUsers.setLayout(panUsersLayout);
        panUsersLayout.setHorizontalGroup(
            panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUsersLayout.createSequentialGroup()
                .addGroup(panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUsersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panUsersLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnAdmin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panUsersLayout.setVerticalGroup(
            panUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        User user = lstUsers.getSelectedValue();
        dataAccess.grantAdmin(user.getUsername());
        updateListView();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultListModel<User> userListModel = new DefaultListModel<>();
        for(User user : dataAccess.getUsers()) {
            if(!user.isIsAdmin()) {
                userListModel.addElement(user);
            }
        }
        lstUsers.setModel(userListModel);
    }//GEN-LAST:event_formWindowOpened

    public void updateListView() {
        DefaultListModel<User> userListModel = new DefaultListModel<>();
        for(User u : dataAccess.getUsers()) {
            if(!u.isIsAdmin()) {
                userListModel.addElement(u);
            }
        }
        lstUsers.setModel(userListModel);
    }
    
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panUsers;
    // End of variables declaration//GEN-END:variables
}
