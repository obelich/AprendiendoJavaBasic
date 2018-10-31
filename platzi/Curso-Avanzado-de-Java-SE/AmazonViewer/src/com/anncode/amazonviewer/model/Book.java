package com.anncode.amazonviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Book extends Publication implements IVisualizable {

    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial, authors);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "\n :: BOOKs ::" +
                "\n Title: " + getTitle() +
                "\n Editorial: " + getEditorial() +
                "\n Edition Date: " + getEditionDate();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    public void view() {
        setReaded(true);
        Date dateI= startToSee(new Date());

        for (int i = 0; i < 10000; i++) {
            System.out.println("...........");
        }

        //Termine de verla
        stopToSee(dateI, new Date());
        System.out.println();
        System.out.println("Leiste: " + toString());
        System.out.println("Por: " + getTimeReaded() + " milisegundos");

    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if ( dateF.getSeconds() > dateI.getSeconds() ) {
            setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
        } else {
            setTimeReaded(0);
        }
    }

    public static ArrayList<Book> makeBookList() {
        ArrayList<Book> books = new ArrayList();
        String[] authors = new String[3];
        for (int i = 0; i < 3; i++) {
            authors[i] = "author "+i;
        }

        for (int i = 1; i <= 5; i++) {
            books.add(new Book("Book " + i, new Date(), "editorial " + i, authors));
        }

        return books;
    }
}
