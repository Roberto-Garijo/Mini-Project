package spdvi.POJOs;

import java.util.Date;

public class Comment {
    int id;
    String text;
    Date dateTime;
    int rating;
    int idUser;
    int registre;

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

    public Comment(int id, String text, Date dateTime, int rating, int idUser, int registre) {
        this.id = id;
        this.text = text;
        this.dateTime = dateTime;
        this.rating = rating;
        this.idUser = idUser;
        this.registre = registre;
    }


    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", rating=" + rating + ", registre=" + registre + '}';
    }
}
