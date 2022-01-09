package spdvi.util;

import java.awt.Color;
import java.awt.Component;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

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
            default:
                star1.setIcon(starEmptyBig);
                star2.setIcon(starEmptyBig);
                star3.setIcon(starEmptyBig);
                star4.setIcon(starEmptyBig);
                star5.setIcon(starEmptyBig);
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
            default:
                star1.setIcon(starEmptySmall);
                star2.setIcon(starEmptySmall);
                star3.setIcon(starEmptySmall);
                star4.setIcon(starEmptySmall);
                star5.setIcon(starEmptySmall);
                break;

        }
    }

    public String encryptPassword(String md5) {
        StringBuffer sb = new StringBuffer();

        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");

            byte[] array = md.digest(md5.getBytes());

            for (int i = 0; i < 5; i++) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.print(sb.toString());
        return sb.toString();
    }

    public void showErrorMessage(String message, Component parent) {
        JOptionPane.showMessageDialog(parent,
                message,
                "Something went wrong...",
                JOptionPane.ERROR_MESSAGE);
        System.out.println(message);
    }
    
    public void showInfoMessage(String message, Component parent) {
        JOptionPane.showMessageDialog(parent,
                message,
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(message);
    }
    
    public int showConfirmationMessage(String message, Component parent) {
        int dialogResult = JOptionPane.showConfirmDialog(parent, 
                message, 
                "Confirm action", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if(dialogResult == JOptionPane.YES_OPTION){
            return 1;
        } else return 0;
    }

    public void sendConfirmationCode(String email, String emailCode) {
        String artMail = "artbalearempresa@gmail.com";
        String contrasena = "root2002";
        System.out.println(emailCode);
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props);
        session.getProperties().put("mail.smtp.ssl.trust", "smtp.gmail.com");

        try {
            // Define message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(artMail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Art Balear account confirmation code");
            message.setText("Introduce the following code: " + emailCode);
            // Envia el mensaje
            Transport transport = session.getTransport("smtp");
            transport.connect(artMail, contrasena);
            transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transport.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public void wrongInput(javax.swing.JTextField txt) {
        txt.setBackground(new java.awt.Color(255, 204, 204));
    }

    public void resetBackground(javax.swing.JTextField txt) {
        txt.setBackground(Color.white);
    }
}
