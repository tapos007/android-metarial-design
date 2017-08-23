package com.example.tapos.cardviewtutorial.app.model;

import com.example.tapos.cardviewtutorial.R;

import java.util.ArrayList;

/**
 * Created by tapos on 8/23/2017.
 */

public class Landscape {
    private int imageID;
    private String title;
    private String description;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static ArrayList<Landscape> getData(){
        ArrayList<Landscape> dataList = new ArrayList<>();
        int[] images = getImages();
        for (int i = 0; i < images.length; i++) {
            Landscape landscape = new Landscape();
            landscape.setImageID(images[i]);
            landscape.setTitle("Landscape"+ i);
            dataList.add(landscape);
        }
        return  dataList;
    }

    private static int[] getImages() {
        int[] images = {
                R.drawable.image_1,
                R.drawable.image_2,
                R.drawable.image_3,
                R.drawable.image_4,
                R.drawable.image_5,
                R.drawable.image_6,
                R.drawable.image_7,
                R.drawable.image_8,
                R.drawable.image_9,
                R.drawable.image_10,
                R.drawable.image_12,
                R.drawable.image_13,
                R.drawable.image_14,
                R.drawable.image_15,
                R.drawable.image_16,
                R.drawable.image_17,
                R.drawable.image_18,
                R.drawable.image_19,
                R.drawable.image_20,
                R.drawable.image_21,
                R.drawable.image_22,
                R.drawable.image_23,
                R.drawable.image_24,
                R.drawable.image_25,
                R.drawable.image_26,
                R.drawable.image_27,
                R.drawable.image_28,
                R.drawable.image_29,
                R.drawable.image_30,
                R.drawable.image_31,
                R.drawable.image_32,
                R.drawable.image_33
        };
        return  images;
    }

}
