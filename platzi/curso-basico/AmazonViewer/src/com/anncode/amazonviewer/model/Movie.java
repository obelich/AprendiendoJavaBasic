package com.anncode.amazonviewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable {

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

    //Los metodos con final o static no pueden ser sobreescritos
    @Override
    public String toString() {
        return "\n :: MOVIE :: " +
                "\n Title: " + getTitle() +
                "\n Genero: " + getGenre() +
                "\n Year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if ( dateF.getSeconds() > dateI.getSeconds() ) {
            setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
        } else {
            setTimeViewed(0);
        }
    }
}
