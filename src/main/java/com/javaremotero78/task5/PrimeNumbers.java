package com.javaremotero78.task5;

/*
    Write an application that takes a positive number from the user (type int) and prints all
    prime numbers greater than 1 and less than the given number.
 */

import java.util.*;

public class PrimeNumbers {

    public static void main(String[] args) {

        /* Citire */
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        /* Logica business */
        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                // Verificare numar prim
                boolean flag = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }

                if (flag) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input, n trebuie sa fie mai mare sau egal cu 1");
        }
    }
}
