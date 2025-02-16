package com.javaremotero78.task6;

/*
    Write an application that takes a number n from the user (type int) and calculates the
    sum of the harmonic series from 1 to n, according to the formula below:
    H=1+1/2+1/3+1/4+...+1/n
 */

import java.util.Scanner;

public class HarmonicSum {

    public static void main(String[] args) {

        /* Citire */
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        /* Logica business */
        double H = 0.0;
        for (int i = 1; i <= n; i++) {
            H += 1.0 / i;   // H = H + 1/i;
        }

        /* Afisare */
        System.out.println("harmonic sum H = " + H);
    }
}
