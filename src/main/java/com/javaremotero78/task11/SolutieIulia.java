package com.javaremotero78.task11;

import java.util.Objects;
import java.util.Scanner;

public class SolutieIulia {

    public static final String stop = "Enough!";
    // constanta!
    // public = modificator de access (privat, protected, default)
    // static = e un cuvant cheie care ne permite sa cream variabile/constante/obiecte/metode/etc care nu tin
    // de definitia instantei de clasa
    // final = e un cuvant cheie care creeaza o resursa IMUTABILA = constanta

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("textele sunt:");
        String urm = scanner.next();

        String pre = "";
        while (!Objects.equals(urm, stop)) {
            if (pre.length() < urm.length()) {
                pre = urm;
            }

            urm = scanner.next();
        }

        // verificare empty!
        if(!pre.isEmpty())
            System.out.println("cuvatul este " + pre);
        else
            System.out.println("Nu a fost introdus niciun cuvant!");

        // trebuie sa aveti in vedere EDGE CASES!
        // mereu testati happy flows
        // apoi testati bad flows
        // in final testati edge cases
    }

}
