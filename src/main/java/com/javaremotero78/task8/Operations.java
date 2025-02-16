package com.javaremotero78.task8;

/*
     Write an application that implements a simple calculator. The application should:
     a. read first number (type float)
     b. read one of following symbols: + - / *
     c. read second number (type float)
     d. return a result of given mathematical operation
     If the user provides a symbol other than supported, the application should print "Invalid
     symbol".
     If the entered action cannot be implemented (i.e. it is inconsistent with the
     principles of mathematics), the application should print "Cannot calculate".
 */

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu primul numar: ");
        double a = sc.nextDouble();
        System.out.print("Introdu simbolul operatiei matematice (+-*/) : ");
        char simbol = sc.next().charAt(0);
        System.out.print("Introdu al doilea numar: ");
        double b = sc.nextDouble();

        Calculator calc = new Calculator();
        switch (simbol) {
            case '+':
                System.out.println(calc.adunare(a, b));
                break;
            case '-':
                System.out.println(calc.scadere(a, b));
                break;
            case '*':
                System.out.println(calc.inmultire(a, b));
                break;
            case '/':
                if (b == 0)
                    System.out.println("Nu se poate calcula, nu putem divide la 0");
                else
                    System.out.println(calc.impartire(a, b));
                break;
            default:
                System.out.println("Simbol invalid");
                break;
        }
    }
}
