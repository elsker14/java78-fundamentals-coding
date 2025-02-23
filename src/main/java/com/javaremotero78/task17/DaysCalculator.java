package com.javaremotero78.task17;

/*
    Write an application that will read from the user the date of your next SDA classes and
    calculate how many days are left to them.

    Hint: read the date as String and parse it to LocalDate. Get the current date using
    LocalDate.now() method.

    Clase relevante:
    - formatters: DateTimeFormatter
    - dates: LocalDate
    - math: ChronoUnit
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti o data calendaristica (yyyy-MM-dd): "); // 2025-06-12
        String inputDate = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate currentDate = LocalDate.now();
            LocalDate futureDate = LocalDate.parse(inputDate, formatter);
            long daysLeft = ChronoUnit.DAYS.between(currentDate, futureDate);
            if (daysLeft <= 0) {
                System.out.println("Data introdusa este trecuta. Va rugam introduceti o data viitoare.");
            } else {
                System.out.println("Mai sunt " + daysLeft + " zile pana pe " + futureDate);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Formatul este invalid. Folositi yyyy-MM-dd.");
        }
    }
}
