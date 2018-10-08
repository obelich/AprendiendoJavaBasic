package com.anncode.amazonviewer;

import com.anncode.amazonviewer.model.Movie;

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

    public static void showMovies() {
        int exit = 0;
        ArrayList<Movie> movies = Movie.makeMoviesList();

        do {

            System.out.println();
            System.out.println(" :: MOVIES ::");
            System.out.println();

            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " +  movies.get(i).isViewed()   );
            }

            System.out.println("0. Regresar al Menu");
            System.out.println();

        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 0;

        do {

            System.out.println();
            System.out.println(" :: SERIES ::");
            System.out.println();

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

    public static void showChapters() {
        int exit = 0;

        do {

            System.out.println();
            System.out.println(" :: CHAPTERS ::");
            System.out.println();

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

    }

    //Haciendo sobre carga de metodo
    public static void makeReport(Date date) {

    }

}
