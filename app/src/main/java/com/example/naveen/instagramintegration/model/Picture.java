package com.example.naveen.instagramintegration.model;

import java.io.Serializable;

/**
 * Created by Naveen on 5/28/2016.
 */
public class Picture implements Serializable {
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    private String URL;


}
