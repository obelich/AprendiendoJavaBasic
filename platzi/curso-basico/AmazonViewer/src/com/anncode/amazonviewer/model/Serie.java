package com.anncode.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {

    private int id;
    private int sessionQuantity;
    private ArrayList<Chapter> chapters;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
        super(title, genre, creator, duration);
        this.sessionQuantity = sessionQuantity;
    }

    public int getId() {
        return id;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "\n :: SERIE :: " +
                "\n Title: " + getTitle() +
                "\n Generoe: " + getGenre() +
                "\n year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration();
    }
}
