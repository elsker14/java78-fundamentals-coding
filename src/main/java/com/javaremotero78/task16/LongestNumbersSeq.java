package com.javaremotero78.task16;

/*
    Write an application that takes 10 numbers from the user (type int) and write the length
    of the longest such subsequence of these numbers, which is increasing.

    For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
    as the length of the longest increasing subsequence (underlined in the example).
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LongestNumbersSeq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersInput = new ArrayList<>();

        System.out.print("Introduceti dimensiunea listei: ");
        int dim = sc.nextInt();
        System.out.print("Introduceti " + dim + " numere intregi: ");
        for (int i = 0; i < dim; i++) {
            while(true) {
                try {
                    numbersInput.add(sc.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    // e reprezinta instanta clasei de exceptie InputMismatchException, adica e un obiect
                    System.out.println("Input invalid, introduceti doar valori intregi");
                    sc.next(); // curata inputul invalid ramas in urma afisarii -> caracterul alb si invizibil new line (enter)
                }
            }
        }

        System.out.println(numbersInput);
    }
}
