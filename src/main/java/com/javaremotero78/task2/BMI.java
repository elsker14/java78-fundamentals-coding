package com.javaremotero78.task2;

/*
     Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
    Your application should read two variables: weight (in kilograms, type float) and height
    (in centimeters, type int). BMI should be calculated given following formula:

     BMI = weight/height^2

     The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
    values. Your program should write "BMI optimal" or "BMI not optimal", according to the
    assumptions above.
 */

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        /* Citire */
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdu valoarea inaltimii (cm): ");
        float height = sc.nextFloat();
        System.out.print("Introdu valoarea greutatii (kg): ");
        float weight = sc.nextFloat();

        /* Logica business */
        float heightMeters = height / 100.0f;   // convertim inaltimea din cm in m, 1m = 100cm
        double bmi = weight / Math.pow(heightMeters, 2); // = heightMeters^2 = heightMeters * heightMeters

        /* Afisare */
        System.out.println("BMI: " + bmi);

        if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI este optim");
        } else {
            System.out.println("BMI nu este optim");
        }

    }
}
