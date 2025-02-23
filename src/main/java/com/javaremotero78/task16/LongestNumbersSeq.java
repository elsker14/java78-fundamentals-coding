package com.javaremotero78.task16;

/*
    Write an application that takes 10 numbers from the user (type int) and write the length
    of the longest such subsequence of these numbers, which is increasing.

    For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
    as the length of the longest increasing subsequence (underlined in the example).

    1 3 8 4 2 5 6 11 13 7
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
            while (true) {
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

        System.out.println("Numerele citite sunt: " + numbersInput);
        System.out.println("Dimensiunea celei mai lungi secvente de numere este: " + countLongestSeq(numbersInput, dim));
        System.out.println("Secventea cea mai lunga de numere este: " + retrieveLongestSeq(numbersInput, dim));
        System.out.println("Dimensiunea celei mai lungi secvente de numere este: " + retrieveLongestSeq(numbersInput, dim).size());
    }


    /*
    10
    1 2 3 2 4 6 8 9 9 8
    seq1: 1 2 3
    seq2: 2 4 6 8 9

    - daca pornim cu i = 0, comparam numbersInput.get(i) < numbersInput.get(i+1), dim - 1
    - daca pornim cu i = 1, comparam numbersInput.get(i-1) < numbersInput.get(i), dim

    i = 1 -> 1 < 2 ? true -> maxLength = 2, storedMaxLength = 2
    i = 2 -> 2 < 3 ? true -> maxLength = 3, storedMaxLength = 3
    i = 3 -> 3 < 2 ? false -> maxLength = 1, storedMaxLength = 3
    i = 4 -> 2 < 4 ? true -> maxLength = 2, storedMaxLength = 3
    i = 5 -> 4 < 6 ? true -> maxLength = 3, storedMaxLength = 3
    i = 6 -> 6 < 8 ? true -> maxLength = 4, storedMaxLength = 4
    ...
    output final: maxLength = 1, storedMaxLength = 5
     */

    private static int countLongestSeq(List<Integer> numbersInput, int dim) {
        int maxLength = 1, storedMaxLength = 0;

        for (int i = 1; i < dim; i++) {
            if (numbersInput.get(i - 1) < numbersInput.get(i)) {
                maxLength++;

                storedMaxLength = Math.max(maxLength, storedMaxLength);
            } else {
                maxLength = 1;
            }
        }
        return storedMaxLength;
    }

    private static List<Integer> retrieveLongestSeq(List<Integer> numbersInput, int dim) {
        List<Integer> longestSeq = new ArrayList<>();
        List<Integer> currentSeq = new ArrayList<>();

        currentSeq.add(numbersInput.getFirst());
        for (int i = 0; i < dim - 1; i++) {
            if (numbersInput.get(i) < numbersInput.get(i + 1)) {
                currentSeq.add(numbersInput.get(i+1));

                if (currentSeq.size() > longestSeq.size()) {
                    longestSeq = new ArrayList<>(currentSeq);
                }
            } else {
                currentSeq.clear();
                currentSeq.add(numbersInput.get(i+1));
            }
        }

        return longestSeq;
    }
}
