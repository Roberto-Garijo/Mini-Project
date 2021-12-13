/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi.POJOs;

import java.net.URL;

/**
 *
 * @author Alumne
 */
public class Pictures {
    int id;
    URL url;
    String registre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    
    public Pictures(int id, URL url, String registre) {
        this.id = id;
        this.url = url;
        this.registre = registre;
    }

    @Override
    public String toString() {
        return "Picture: " + id;
    }
}
