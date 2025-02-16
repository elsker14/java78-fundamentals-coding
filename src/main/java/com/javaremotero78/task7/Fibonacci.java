package com.javaremotero78.task7;

/*
    Write an application that will take a positive number from the user (type int)
    and calculate the Fibonacci number at the indicated index.
    For example, if the number equals 5, your program should print the fifth Fibonacci number.
    In Fibonacci sequence, each number is the sum of the two preceding ones.
    For example, the first few Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34...
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Citeste indexul elementului din sirul Fibonacci: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Input invalid, n >= 0");
        } else {
            System.out.println("Al " + n + "-lea numar fibonacci este: " + getFibonacciByIndex(n));
        }
    }

    private static int getFibonacciByIndex(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
