package spdvi.POJOs;

public class Place {
    int registre;
    String name;
    String description;
    String municipality;
    String address;
    String email;
    String web;
    String phoneNumber;
    boolean isVisible;
    String type;
    int comments;
    int avgRating;

    public Place() {
    }

    public Place(int registre, String name, String description, String municipality, String address, String email, String web, String phoneNumber, boolean isVisible, String type) {
        this.registre = registre;
        this.name = name;
        this.description = description;
        this.municipality = municipality;
        this.address = address;
        this.email = email;
        this.web = web;
        this.phoneNumber = phoneNumber;
        this.isVisible = isVisible;
        this.type = type;
    }

    public Place(int registre, String name, String description, String municipality, String address, String email, String web, String phoneNumber, String type) {
        this.registre = registre;
        this.name = name;
        this.description = description;
        this.municipality = municipality;
        this.address = address;
        this.email = email;
        this.web = web;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public Place(int registre, String name, String description, String municipality, String address, String email, String web, String phoneNumber, boolean isVisible, String type, int comments, int avgRating) {
        this.registre = registre;
        this.name = name;
        this.description = description;
        this.municipality = municipality;
        this.address = address;
        this.email = email;
        this.web = web;
        this.phoneNumber = phoneNumber;
        this.isVisible = isVisible;
        this.type = type;
        this.comments = comments;
        this.avgRating = avgRating;
    }
    

    public int getRegistre() {
        return registre;
    }

    public void setRegistre(int registre) {
        this.registre = registre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }
    
    
    @Override
    public String toString() {
        return name + " - " + type;
    }
}
