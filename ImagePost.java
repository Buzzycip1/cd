package com.campusdual.redsoclal;


import java.awt.*;

public class ImagePost extends Post{
    private String dimension;

    public ImagePost (String title, String dimension) {
        super(title);
        this.dimension = dimension;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }


}
