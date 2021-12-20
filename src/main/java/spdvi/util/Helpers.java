package spdvi.util;

public class Helpers {

    javax.swing.ImageIcon starFullBig = new javax.swing.ImageIcon(getClass().getResource("/icons/32px/218-star-full.png"));
    javax.swing.ImageIcon starEmptyBig = new javax.swing.ImageIcon(getClass().getResource("/icons/32px/216-star-empty.png"));
    javax.swing.ImageIcon starFullSmall = new javax.swing.ImageIcon(getClass().getResource("/icons/16px/218-star-full.png"));
    javax.swing.ImageIcon starEmptySmall = new javax.swing.ImageIcon(getClass().getResource("/icons/16px/216-star-empty.png"));

    public Helpers() {
    }

    public void showHidePassword(javax.swing.JPasswordField pwsField, javax.swing.JLabel icon, boolean show) {
        if (show) {
            pwsField.setEchoChar((char) 0);
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/207-eye.png")));
        } else {
            pwsField.setEchoChar((char) '●');
            icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16px/210-eye-blocked.png")));
        }
    }

    public void setRatingBig1(javax.swing.JLabel star1, javax.swing.JLabel star2, javax.swing.JLabel star3, javax.swing.JLabel star4, javax.swing.JLabel star5, int rating) {
        switch (rating) {
            case 1:
                star1.setIcon(starFullBig);
                star2.setIcon(starEmptyBig);
                star3.setIcon(starEmptyBig);
                star4.setIcon(starEmptyBig);
                star5.setIcon(starEmptyBig);
                break;
            case 2:
                star1.setIcon(starFullBig);
                star2.setIcon(starFullBig);
                star3.setIcon(starEmptyBig);
                star4.setIcon(starEmptyBig);
                star5.setIcon(starEmptyBig);
                break;
            case 3:
                star1.setIcon(starFullBig);
                star2.setIcon(starFullBig);
                star3.setIcon(starFullBig);
                star4.setIcon(starEmptyBig);
                star5.setIcon(starEmptyBig);
                break;
            case 4:
                star1.setIcon(starFullBig);
                star2.setIcon(starFullBig);
                star3.setIcon(starFullBig);
                star4.setIcon(starFullBig);
                star5.setIcon(starEmptyBig);
                break;
            case 5:
                star1.setIcon(starFullBig);
                star2.setIcon(starFullBig);
                star3.setIcon(starFullBig);
                star4.setIcon(starFullBig);
                star5.setIcon(starFullBig);
                break;
        }
    }
    
    public void setRatingSmall(javax.swing.JLabel star1, javax.swing.JLabel star2, javax.swing.JLabel star3, javax.swing.JLabel star4, javax.swing.JLabel star5, int rating) {
        switch (rating) {
            case 1:
                star1.setIcon(starFullSmall);
                star2.setIcon(starEmptySmall);
                star3.setIcon(starEmptySmall);
                star4.setIcon(starEmptySmall);
                star5.setIcon(starEmptySmall);
                break;
            case 2:
                star1.setIcon(starFullSmall);
                star2.setIcon(starFullSmall);
                star3.setIcon(starEmptySmall);
                star4.setIcon(starEmptySmall);
                star5.setIcon(starEmptySmall);
                break;
            case 3:
                star1.setIcon(starFullSmall);
                star2.setIcon(starFullSmall);
                star3.setIcon(starFullSmall);
                star4.setIcon(starEmptySmall);
                star5.setIcon(starEmptySmall);
                break;
            case 4:
                star1.setIcon(starFullSmall);
                star2.setIcon(starFullSmall);
                star3.setIcon(starFullSmall);
                star4.setIcon(starFullSmall);
                star5.setIcon(starEmptySmall);
                break;
            case 5:
                star1.setIcon(starFullSmall);
                star2.setIcon(starFullSmall);
                star3.setIcon(starFullSmall);
                star4.setIcon(starFullSmall);
                star5.setIcon(starFullSmall);
                break;
        }
    }
}
