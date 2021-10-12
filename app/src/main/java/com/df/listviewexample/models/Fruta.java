package com.df.listviewexample.models;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Fruta implements Serializable {
    private String name;
    private String shape;
    private String size;
    private String value;
    private String image;

    public Fruta(){}

    public Fruta(String name, String shape, String size, String value, String image) {
        this.name = name;
        this.shape = shape;
        this.size = size;
        this.value = value;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public String getSize() {
        return size;
    }

    public String getValue() {
        return value;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setImage(String image) {
        this.image = image;
    }
/*public Fruta(String name, String cylinderCapacity, String model, String value, String image) {
        this.name = name;
        this.cylinderCapacity = cylinderCapacity;
        this.model = model;
        this.value = value;
        this.image = image;
    }*/


}
