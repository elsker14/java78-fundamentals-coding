package com.javaremotero78.task13;

/*
    Write an application that "stutters", that is, reads the user's text (type String), and prints
    the given text, in which each word is printed twice.

    For example, for the input: "This is my test" the application should print
    "This This is is my my test test".
 */

/**
 * suprascrierea = este procedeul de a redefini implementarea unei metode intr-o relatie de mostenire intre clase
 * - clasa copil mosteneste o metoda pe care o redefineste dupa bunul plac fiind usor diferita fata de cea din clasa
 * parinte
 * - metodele de acest tip sunt marcate de anotatia @Override
 *
 * supraincarcarea = este procedeul de reutilizare a denumirii unei metode cu semnaturi diferite
 * - se poate intalni la nivel de clasa
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringStutters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un text: ");
        String input = sc.nextLine();

        // Split original string to an arrays of strings
        String[] wordsArray = input.split(" ");
        List<String> wordsList = new ArrayList<>(List.of(wordsArray));  // conversie de la array la list

        StringBuilder stutteredText = new StringBuilder();
        for(String it: wordsList) {
            // builder chain = e o modalitate de apelare continua a metodelor CARE intorc
            // ca si rezultat obiectul apelant
            stutteredText
                    .append(it)
                    .append(" ")
                    .append(it)
                    .append(" ");
        }
        System.out.println("Textul cu fiecare cuvant dublat este: \n"+ stutteredText);
    }
}
