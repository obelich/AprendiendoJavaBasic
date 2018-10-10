package com.anncode.amazonviewer;

import com.anncode.amazonviewer.model.Chapter;
import com.anncode.amazonviewer.model.Movie;
import com.anncode.amazonviewer.model.Serie;
import com.anncode.makereport.Report;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {

        int exit = 0;
        do {
            System.out.println("Bienvenidos Amazon Viewer");
            System.out.println("");
            System.out.println("Selecciona el # de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());
            sc.nextInt();
//            int response = 1;
            switch (response) {
                case 0:
                    exit = 0;
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    System.out.println();
                    System.out.println("....!! Selecciona una opcion!!....");
                    System.out.println();
                    break;

            }

        } while (exit != 0);

    }

    static ArrayList<Movie> movies = Movie.makeMoviesList();
    public static void showMovies() {
        int exit = 1;

        do {

            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();

            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " +  movies.get(i).isViewed()   );
            }

            System.out.println("0. Regresar al Menu");
            System.out.println();

            //Leer el numero seleccionado
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                exit = 0;
                showMenu();
            }

            if (response > 0) {

                Movie movieSelected = movies.get(response-1);
                movieSelected.setViewed(true);
                Date dateI = movieSelected.startToSee(new Date());

                for (int i = 0; i < 10000; i++) {

                    System.out.println("...........");
                }

                //Termianr de ver la pelicula
                movieSelected.stopToSee(dateI, new Date() );
                System.out.println();
                System.out.println( "Viste: "+movieSelected);
                System.out.println("Por: " + movieSelected.getTimeViewed() + " Milisegundos");

            }



        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 1;
        ArrayList<Serie> series = Serie.makeSeriesList();

        do {

            System.out.println();
            System.out.println(" :: SERIES ::");
            System.out.println();

            for (int i = 0; i < series.size(); i++) {
                System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
            }

            System.out.println("0. Regresar al menu");
            System.out.println();


            //Leer el numero seleccionado
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                showMenu();
            }

            showChapters(series.get(response-1).getChapters() );



        } while (exit != 0);

    }

    public static void showBooks() {

        int exit = 0;

        do {

            System.out.println();
            System.out.println(" :: BOOKS ::");
            System.out.println();

        } while (exit != 0);
    }

    public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
        int exit = 0;

        do {

            System.out.println();
            System.out.println(" :: CHAPTERS ::");
            System.out.println();

            for (int i = 0; i < chaptersOfSerieSelected.size(); i++) {
                System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
            }

            System.out.println("0. Regresar al menu");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                showSeries();
            }

            Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
            chapterSelected.setViewed(true);
            Date dateI= chapterSelected.startToSee(new Date());

            for (int i = 0; i < 10000; i++) {
                System.out.println("...........");
            }

            //Termine de verla
            chapterSelected.stopToSee(dateI, new Date());
            System.out.println();
            System.out.println("Viste: " + chapterSelected);
            System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos"  );


        } while (exit != 0);

    }

    public static void showMagazines() {

        int exit = 0;

        do {

            System.out.println();
            System.out.println(" :: MATAZINES ::");
            System.out.println();

        } while (exit != 0);
    }

    public static void makeReport() {


        Report report = new Report();
        report.setNameFile("exportacion");
        report.setExtension("txt");
        report.setTitle(":: VISTOS ::");
        String contentReport = "";

        for (Movie movie : movies) {
            if (movie.getIsViewed() ) {
                contentReport += movie.toString() + "\n";
            }
        }

        report.setContent(contentReport);

        report.makeReport();
        System.out.println("Reporte Generado");
        showMenu();
    }

    //Haciendo sobre carga de metodo
    public static void makeReport(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
        String dateString = df.format(date);
        Report report = new Report();

        report.setNameFile("reporte-" + dateString);

        report.setExtension("txt");
        report.setTitle(":: VISTOS ::");
        String contentReport = "";

        for (Movie movie : movies) {
            if (movie.getIsViewed() ) {
                contentReport += movie.toString() + "\n";
            }
        }

        report.setContent(contentReport);

        report.makeReport();
        System.out.println("Reporte Generado");
        showMenu();

    }

}
