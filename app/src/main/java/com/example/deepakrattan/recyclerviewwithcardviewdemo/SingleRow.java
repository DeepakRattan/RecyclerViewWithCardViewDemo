package com.example.deepakrattan.recyclerviewwithcardviewdemo;

/**
 * Created by deepak.rattan on 2/13/2018.
 */

public class SingleRow {
    private int image;
    private String name,designation;

    public SingleRow(int image, String name, String designation) {
        this.image = image;
        this.name = name;
        this.designation = designation;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}
