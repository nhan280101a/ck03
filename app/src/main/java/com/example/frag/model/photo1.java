package com.example.frag.model;

public class photo1 {
    private int resourceId;
    private String name;
    private String about;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public photo1(int resourceId, String name, String about, String price) {
        this.resourceId = resourceId;
        this.name = name;
        this.about = about;
        this.price = price;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}


