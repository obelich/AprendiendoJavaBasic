package com.anncode.makereport;

import java.io.*;

public class Report {

    private String nameFile;
    private String content;
    private String title;
    private String extension;

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void makeReport() {
        if (  (getContent() != null) && (getNameFile() != null) && (getTitle() != null)   ) {

            try {
                File file = new File(getNameFile()+"."+getExtension());
                FileOutputStream fos = new FileOutputStream(file); //Los dato se convierten a un stream de bytes
                OutputStreamWriter  osw = new OutputStreamWriter(fos); // y el stream se convierte en caracteres
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write(getContent());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Ingrese todos los datos necesarios");
        }


    }


}
