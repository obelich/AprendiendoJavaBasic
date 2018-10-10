package com.anncode.amazonviewer.model;

import java.util.ArrayList;
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
        if ( dateF.getTime() > dateI.getTime() ) {
            setTimeViewed((int)(dateF.getTime() - dateI.getTime() ));
        } else {
            setTimeViewed(0);
        }
    }

    public static ArrayList<Movie> makeMoviesList() {
        ArrayList<Movie> movies = new ArrayList();

        for (int i = 1; i <= 5 ; i++) {
            movies.add(new Movie("Movie " + i, "Genero "+ i, "Creador "+ i, 120, (short)(2014+i)  ));

        }

        return movies;
    }


    @Override
    public void view() {
        setViewed(true);
        Date dateI = startToSee(new Date());

        for (int i = 0; i < 10000; i++) {

            System.out.println("...........");
        }

        //Termianr de ver la pelicula
        stopToSee(dateI, new Date() );
        System.out.println();
        System.out.println( "Viste: "+ toString());
        System.out.println("Por: " + getTimeViewed() + " Milisegundos");
    }
}
