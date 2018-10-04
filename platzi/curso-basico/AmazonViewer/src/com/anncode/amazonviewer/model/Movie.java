package com.anncode.amazonviewer.model;

public class Movie extends Film {

    //Cuando se esconde un dato se le llama encapsulamiento
    private int id;
    private int timeViewed;

    //El constructor auto generado se tiene que hacer despues de agregar la herencia
    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    public void showData() {
//        System.out.println("Title: " + this.title);
//        System.out.println("Genre: " + this.genre);
//        System.out.println("Year: " + this.year);
    }

    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
}
