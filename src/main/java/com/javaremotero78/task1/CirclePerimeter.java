package com.javaremotero78.task1;

/*
    Write an application that will read diameter of a circle (variable of type float) and
    calculate perimeter of given circle.
    Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    psvm = shortcut pt public static void main(...) { }
    sout = shortcut pt System.out.println();
 */

import java.util.Scanner;

public class CirclePerimeter {

    public static void main(String[] args) {

        /* Definire scanner + Citire diametru */
        Scanner sc = new Scanner(System.in);
        // sc stie sa citeasca valori de la consola prin introducerea lor de la tastatura

        System.out.print("Introdu valoarea diamerului de cerc: ");
        float diametru = sc.nextFloat();

        /* Solutia 1 - piC = variabila constanta hardcodata */
        // Definim valoarea lui pi
        final float piC = 3.141f;
        // f converteste valoarea default double la float

        // Calculam perimetrul cercului
        double perimeterC = piC * diametru;

        // Afisam perimetrul
        System.out.println("Perimeter C: " + perimeterC);

        /* Solutia 2 */
        final double piM = Math.PI;
        double perimeterM = piM * diametru;
        System.out.println("Perimeter M: " + perimeterM);
    }
}
