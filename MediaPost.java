package com.campusdual.redsoclal;

public class MediaPost extends Post{

    private String quality;
    private int duration;

    public MediaPost(String title, String quality, int duration) {
        super(title);
        this.quality = quality;
        this.duration = duration;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



