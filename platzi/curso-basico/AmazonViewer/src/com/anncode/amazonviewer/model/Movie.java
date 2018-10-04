package com.anncode.amazonviewer.model;

public class Movie {

    //Cuando se esconde un dato se le llama encapsulamiento
    private int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }

    public Movie(String title, String genre, short year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }


    public void showData() {
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Year: " + this.year);
    }
}
