package com.anncode.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie {

    private int id;
    private int sessionNumber;
    private Serie serie;


    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber, Serie serie) {
        super(title, genre, creator, duration, year);
        this.setSessionNumber(sessionNumber);
        this.setSerie(serie);

    }

    @Override
    public int getId() {
        return this.id;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public String toString() {
        return "\n :: CHAPTER :: " +
                "\n Title: " + getTitle() +
                "\n year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration();
    }

    public static ArrayList<Chapter> makeChaptersList(Serie serie) {
        ArrayList<Chapter> chapters = new ArrayList();

        for (int i = 1; i <= 5 ; i++) {
            chapters.add(new Chapter("Capitulo " + i, "Genero "+ i, "Creador "+ i, 45, (short)(2014+i), i, serie   ));

        }
        return chapters;
    }

    @Override
    public void view() {
        super.view();
        ArrayList<Chapter> chapters = getSerie().getChapters();
        int chapterviewdCounter = 0;
        for (Chapter chapter : chapters) {
            if (chapter.getIsViewed()) {

            }
            
        }
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
