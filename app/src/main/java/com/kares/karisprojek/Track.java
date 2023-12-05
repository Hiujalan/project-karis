package com.kares.karisprojek;

public class Track {
    private String Judul, Desk;
    private int img;

    public Track(String Judul, String Desk, int img) {
        this.Judul = Judul;
        this.Desk = Desk;
        this.img = img;
    }

    public String getJudul() {
        return Judul;
    }


    public String getDesk() {
        return Desk;
    }

    public void setDesk(String desk) {
        this.Desk = desk;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}




