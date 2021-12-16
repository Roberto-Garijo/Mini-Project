package spdvi;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import spdvi.POJOs.Place;
import spdvi.dataaccess.DataAccess;
import spdvi.dialogs.AdminDialog;
import spdvi.dialogs.FilterDialog;
import spdvi.dialogs.InfoDialog;
import spdvi.dialogs.LoginDialog;
import spdvi.dialogs.SignUpDialog;
import spdvi.dialogs.UserSettingsDialog;

public class Main extends javax.swing.JFrame {

    ArrayList<Place> places;

    Color defaultColor = new Color(0, 204, 255);
    Color hoverColor = new Color(0, 128, 160);
    JList lstPlaces;
    DataAccess dataAccess = new DataAccess();

    public Main() {
        initComponents();
        initApp();
//        SignUpDialog sup = new SignUpDialog(this, true);
//        sup.setVisible(true);
        LoginDialog ld = new LoginDialog(this, true);
        ld.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlUser = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        pnlLogOut = new javax.swing.JPanel();
        lblLogOut = new javax.swing.JLabel();
        pnlOption = new javax.swing.JPanel();
        lblOption = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        scrPlaceList = new javax.swing.JScrollPane();
        lblPlaceImage = new javax.swing.JLabel();
        lblPlaceName = new javax.swing.JLabel();
        pnlRating = new javax.swing.JPanel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();
        lblLocationIcon = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblTypeIcon = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblCommentsIcon = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblFilter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        pnlMenu.setBackground(new java.awt.Color(0, 204, 255));

        pnlUser.setBackground(new java.awt.Color(0, 204, 255));
        pnlUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlUserMouseExited(evt);
            }
        });

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/114-user.png"))); // NOI18N

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlInfo.setBackground(new java.awt.Color(0, 204, 255));
        pnlInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlInfoMouseExited(evt);
            }
        });

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/269-info.png"))); // NOI18N

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlAdmin.setBackground(new java.awt.Color(0, 204, 255));
        pnlAdmin.setToolTipText("");
        pnlAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAdminMouseExited(evt);
            }
        });

        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/119-user-tie.png"))); // NOI18N

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlLogOut.setBackground(new java.awt.Color(0, 204, 255));
        pnlLogOut.setToolTipText("Log out");
        pnlLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLogOutMouseExited(evt);
            }
        });

        lblLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/277-exit.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogOutLayout = new javax.swing.GroupLayout(pnlLogOut);
        pnlLogOut.setLayout(pnlLogOutLayout);
        pnlLogOutLayout.setHorizontalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        pnlLogOutLayout.setVerticalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogOutLayout.createSequentialGroup()
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlOption.setBackground(new java.awt.Color(0, 204, 255));
        pnlOption.setToolTipText("");

        lblOption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlOptionLayout = new javax.swing.GroupLayout(pnlOption);
        pnlOption.setLayout(pnlOptionLayout);
        pnlOptionLayout.setHorizontalGroup(
            pnlOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOption, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        pnlOptionLayout.setVerticalGroup(
            pnlOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOption, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(pnlLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitle.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("BALEARIC ART PLACES");

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

        lblPlaceImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/330x210.png"))); // NOI18N

        lblPlaceName.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        lblPlaceName.setForeground(new java.awt.Color(51, 51, 51));
        lblPlaceName.setText("Place name");

        pnlRating.setBackground(new java.awt.Color(255, 255, 255));

        lblStar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/216-star-empty.png"))); // NOI18N
        pnlRating.add(lblStar1);

        lblStar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/216-star-empty.png"))); // NOI18N
        pnlRating.add(lblStar2);

        lblStar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/216-star-empty.png"))); // NOI18N
        pnlRating.add(lblStar3);

        lblStar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/216-star-empty.png"))); // NOI18N
        pnlRating.add(lblStar4);

        lblStar5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/216-star-empty.png"))); // NOI18N
        pnlRating.add(lblStar5);

        lblLocationIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/072-location.png"))); // NOI18N

        lblLocation.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(51, 51, 51));
        lblLocation.setText("Location");

        lblTypeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/034-library.png"))); // NOI18N

        lblType.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lblType.setForeground(new java.awt.Color(51, 51, 51));
        lblType.setText("Type");

        lblCommentsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/32px/109-bubbles.png"))); // NOI18N

        lblComments.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lblComments.setForeground(new java.awt.Color(51, 51, 51));
        lblComments.setText("1234 comments");

        jButton1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jButton1.setText("Check it out!");
        jButton1.setEnabled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/348-filter.png"))); // NOI18N
        lblFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFilterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrPlaceList, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlRating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPlaceName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainLayout.createSequentialGroup()
                                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLocationIcon)
                                        .addComponent(lblTypeIcon)
                                        .addComponent(lblCommentsIcon, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblComments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblPlaceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jButton1)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrPlaceList, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(lblPlaceImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPlaceName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLocationIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTypeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCommentsIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComments, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminMouseEntered
        pnlAdmin.setBackground(hoverColor);
    }//GEN-LAST:event_pnlAdminMouseEntered

    private void pnlInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInfoMouseEntered
        pnlInfo.setBackground(hoverColor);
    }//GEN-LAST:event_pnlInfoMouseEntered

    private void pnlInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInfoMouseExited
        pnlInfo.setBackground(defaultColor);
    }//GEN-LAST:event_pnlInfoMouseExited

    private void pnlAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminMouseExited
        pnlAdmin.setBackground(defaultColor);
    }//GEN-LAST:event_pnlAdminMouseExited

    private void pnlLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogOutMouseExited
        pnlLogOut.setBackground(defaultColor);
    }//GEN-LAST:event_pnlLogOutMouseExited

    private void pnlUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUserMouseEntered
        pnlUser.setBackground(hoverColor);
    }//GEN-LAST:event_pnlUserMouseEntered

    private void pnlUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUserMouseExited
        pnlUser.setBackground(defaultColor);
    }//GEN-LAST:event_pnlUserMouseExited

    private void pnlLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogOutMouseEntered
        pnlLogOut.setBackground(hoverColor);
    }//GEN-LAST:event_pnlLogOutMouseEntered

    private void pnlUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUserMouseClicked
        System.out.println("user");
        openUserDialog();
    }//GEN-LAST:event_pnlUserMouseClicked

    private void lblFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFilterMouseClicked
        openFilterDialog();
    }//GEN-LAST:event_lblFilterMouseClicked

    private void pnlInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInfoMouseClicked
        openInfoDialog();
    }//GEN-LAST:event_pnlInfoMouseClicked

    private void pnlAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdminMouseClicked
        openAdminDialog();
    }//GEN-LAST:event_pnlAdminMouseClicked

    private void pnlLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogOutMouseClicked
        logout();
    }//GEN-LAST:event_pnlLogOutMouseClicked

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        searchPlace();
    }//GEN-LAST:event_lblSearchMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchPlace();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblCommentsIcon;
    private javax.swing.JLabel lblFilter;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLocationIcon;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblPlaceImage;
    private javax.swing.JLabel lblPlaceName;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblTypeIcon;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlLogOut;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlOption;
    private javax.swing.JPanel pnlRating;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JScrollPane scrPlaceList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initApp() {
        //metodos que se ejecutarán al iniciar el programa
        setLocationRelativeTo(null);
        lstPlaces = new JList<Place>();
        scrPlaceList.setViewportView(lstPlaces);
        lstPlaces.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPlacesValueChanged(evt);
            }
        });
        loadPlaces();
    }

    private void openUserDialog() {
        UserSettingsDialog usd = new UserSettingsDialog(this, false);
        usd.setVisible(true);
    }

    private void openFilterDialog() {
        FilterDialog fd = new FilterDialog(this, true);
        fd.setVisible(true);
    }

    private void openInfoDialog() {
        InfoDialog id = new InfoDialog(this, true);
        id.setVisible(true);
    }

    private void openAdminDialog() {
        AdminDialog ad = new AdminDialog(this, false);
        ad.setVisible(true);
    }

    private void logout() {

    }

    private void searchPlace() {
        String search = txtSearch.getText().toLowerCase();
        if (!search.isBlank() || !search.isEmpty()) {
            DefaultListModel dlm = new DefaultListModel();
            for (Place place : places) {
                if (place.getName().toLowerCase().contains(search)) {
                    dlm.addElement(place);
                }
            }
            lstPlaces.setModel(dlm);
        } else {
            listAllPlaces();
        }
    }

    private void loadPlaces() {
        places = new ArrayList<Place>();
        places = dataAccess.getPlaces();
//        Place p = new Place();
//        p.setRegistre(1);
//        p.setName("Capulla");
//        p.setType("Museo");
//        p.setDescription("Description");
//        p.setMunicipality("Palma");
//        places.add(p);
//        Place a = new Place();
//        a.setRegistre(1);
//        a.setName("Pepe");
//        a.setType("Arte");
//        a.setDescription("Description");
//        a.setMunicipality("Inca");
//        places.add(a);
        listAllPlaces();
    }

    private void lstPlacesValueChanged(javax.swing.event.ListSelectionEvent evt) {
        System.out.println(lstPlaces.getSelectedValue());
        updatePlacePreview();
    }

    private void updatePlacePreview() {
        Place p = (Place) lstPlaces.getSelectedValue();
        if (p != null) {
            lblPlaceName.setText(p.getName());
            lblType.setText(p.getType());
            lblLocation.setText(p.getMunicipality());
        }
    }

    private void listAllPlaces() {
        DefaultListModel dlm = new DefaultListModel();
        for (Place place : places) {
            dlm.addElement(place);
        }
        lstPlaces.setModel(dlm);
    }
}
