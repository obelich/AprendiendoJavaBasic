package com.anncode.makereport;

public class Main {

    public static void main(String[] args) {

        Report report = new Report();
        report.setNameFile("reporte");
        report.setTitle(":: REPORTE ::\n");
        report.setExtension("txt");
        String content = "";
        for (int i = 0; i < 5; i++) {
            content += "\n Reporte : " + i;
        }
        report.setContent(content);
        report.makeReport();
    }
}
