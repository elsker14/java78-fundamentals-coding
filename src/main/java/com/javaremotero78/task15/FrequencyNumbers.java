package com.javaremotero78.task15;

/*
    Write an application that reads  from the user 10 arbitrarily large numbers (variables of
    type int) and prints those that occurred at least twice.

    Input:
    10 (optional)
    10 11 11 2 3 45 2 2 3 10

    Output:
    10 11 3 2
 */

import java.util.*;

public class FrequencyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> duplicateNumbers = new ArrayList<>();

        System.out.print("Introduceti 10 numere: ");
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    duplicateNumbers.add(sc.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input invalid. Introduceti doar valori numerice intregi.");
//                    throw new InputMismatchException("Input invalid. Introduceti doar valori numerice intregi.");
                    sc.next();
                }
            }
        }

        // Calcularea frecventei folosind map
        Map<Integer, Integer> frequencyOfNumbers = new HashMap<>();
        /*
        Map = {(1,3); (2,2); (3,2); !!!(2,6)!!!}
        key = unic, restrictiv si indicat in a avea un tip de date USOR comparabil
        value = arbitrar, poate avea ORICE tip de date
         */
        for (Integer it : duplicateNumbers) {
            if (frequencyOfNumbers.containsKey(it)) {
                frequencyOfNumbers.put(it, frequencyOfNumbers.get(it) + 1); // actualizam aparitiile duplicitare
            } else {
                frequencyOfNumbers.put(it, 1);  // adaugam prima aparitie
            }

            // todo: alternativ la acest if, incercati cu getOrDefault() in loc de get
            // hint: map.put(it, map.getOrDefault()...)
        }
        // 10 11 11 2 3 45 2 2 3 10
        /*
        iteratia 0 -> 10 -> Map = {(10, 1)}
        iteratia 1 -> 11 -> Map = {(10, 1); (11, 1)}
        iteratia 2 -> 11 -> Map = {(10, 1); (11, 1+1)}
        iteratia 3 -> 2 -> Map = {(10, 1); (11, 2); (2,1)}
        iteratia 4 -> 3 -> Map = {(10, 1); (11, 2); (2,1); (3,1)}
        iteratia 4 -> 45 -> Map = {(10, 1); (11, 2); (2,1); (3,1); (45,1)}
        iteratia 5 -> 2 -> Map = {(10, 1); (11, 2); (2,1+1); (3,1); (45,1)}
        iteratia 6 -> 2 -> Map = {(10, 1); (11, 2); (2,2+1); (3,1); (45,1)}
        iteratia 7 -> 3 -> Map = {(10, 1); (11, 2); (2,3); (3,1+1); (45,1)}
        iteratia 8 -> 10 -> Map = {(10, 1+1); (11, 2); (2,3); (3,2); (45,1)}

        Mapa finala este Map = {(10, 2); (11, 2); (2,3); (3,2); (45,1)}
        Output: 10, 11, 2, 3
        */

        List<Integer> onlyDuplicateNumbers = new ArrayList<>();
        // System.out.print("Elementele duplicitare sunt: "); - lasat in coment ptc nu avem de unde sa stim, daca lista e goala
        for (Map.Entry<Integer, Integer> it : frequencyOfNumbers.entrySet()) {
            // entrySet = converteste mapa intr-un set de perechi
            // De ce? ptc setul poate fi iterat incremental
            if (it.getValue() > 1) {
                // System.out.print(it.getKey() + " "); - lasat in coment ptc nu avem de unde sa stim, daca lista e goala
                onlyDuplicateNumbers.add(it.getKey());
            }
        }

        if (!onlyDuplicateNumbers.isEmpty()) {
            System.out.print("Elementele duplicitare sunt: " + onlyDuplicateNumbers); // mesaj: [2, 3, 10, 11]
            // 10 11 11 2 3 45 2 2 3 10
        } else {
            System.out.println("Nu exista niciun numar duplicitar!");
            // 1 2 3 4 5 6 7 8 9 10
        }
    }
}
