package spdvi.util;

public class Helpers {

    public Helpers() {
    }
    
    public void showHidePassword(javax.swing.JPasswordField pwsField, javax.swing.JLabel icon, boolean show) {
        if (show) {
            pwsField.setEchoChar((char)0);
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/207-eye.png")));
        } else {
            pwsField.setEchoChar((char)'•');
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png")));
        }
    }
}
