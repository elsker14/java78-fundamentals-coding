package com.javaremotero78.task3;

import java.util.Scanner;

/*
    Write a program for solving a quadratic equation. The program should take three integers
    (coefficients of the quadratic equation a, b, c) and calculate the roots  of the
    equation ax^2 + bx + c = 0;
    If delta ∆ comes out negative, print "Delta negative" and exit the program.
    Formulas you’ll need:
    delta = b^2 - 4ac
    x1,2 = (-b +- sqrt(delta))/2a

 */
public class QuadEq {

    public static void main(String[] args) {

        /* Citire */
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        /* Business logic + Afisare */
        double delta = Math.pow(b, 2 ) - (4 * a * c);
        System.out.println("delta = " + delta);

        // Daca delta e negativ, se termina programul
        if(delta < 0){
            System.out.println("Delta este negativ! Oopsie!");
            return; // return; = va inchide complet programul, prin urmare tot ceea ce e sub el, e ignorat
        }

        // Daca delta e pozitiv, calculam radacinile patrate
        double x1, x2;
        if(delta == 0) {
            x1 = x2 = -b / (2.0 * a);
            System.out.println("Root x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("Root x1 = " + x1);
            System.out.println("Root x2 = " + x2);
        }
    }
}

/*
    delta   = b^2 - 4ac
            = 25 - 4*2*3 = 25 - 24 = 1
    ax^2 + bx + c = 0
    x = -1 -> 2 - 5 + 3 = 0 => -3 + 3 = 0, adevarat
 */
