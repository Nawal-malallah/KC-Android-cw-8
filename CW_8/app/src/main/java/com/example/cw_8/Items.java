package com.example.cw_8;

import java.io.Serializable;

public class Items implements Serializable {

    private String name;
    private int price;
    private int photo;


    public Items(String name, int price, int photo) {
        this.name = name;
        this.price = price;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

