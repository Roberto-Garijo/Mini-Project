package spdvi.POJOs;

import java.util.Date;

public class Comment {
    int id;
    String text;
    Date dateTime;
    int rating;
    int idUser;
    int registre;
    
    String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRegistre() {
        return registre;
    }

    public void setRegistre(int registre) {
        this.registre = registre;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Comment(int id, String text, Date dateTime, int rating, int idUser, int registre) {
        this.id = id;
        this.text = text;
        this.dateTime = dateTime;
        this.rating = rating;
        this.idUser = idUser;
        this.registre = registre;
    }

    public Comment(int id, String text, Date dateTime, int rating, int idUser, int registre, String username) {
        this.id = id;
        this.text = text;
        this.dateTime = dateTime;
        this.rating = rating;
        this.idUser = idUser;
        this.registre = registre;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", rating=" + rating + ", registre=" + registre + '}';
    }
}
