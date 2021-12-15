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
    int fk_registre;

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

    public int getRegistre() {
        return fk_registre;
    }

    public void setRegistre(int fk_registre) {
        this.fk_registre = fk_registre;
    }

    
    public Pictures(int id, URL url, int fk_registre) {
        this.id = id;
        this.url = url;
        this.fk_registre = fk_registre;
    }

    @Override
    public String toString() {
        return "Picture: " + id;
    }
}
