package com.javaremotero78.task19;

/*
     Write an application that consists of few classes:
     a. Author class, representing an author – poem writer, which consists of fields surname
    and nationality (both of type String)
     b. Poem class, representing poem, which consists of fields creator (type Author) and
    stropheNumbers (type int – numbers of strophes in poem)
     c. Main class, with main method, inside which you will:
         i.Create three instances of Poem class, fill them with data (using constructor
        and/or setters) and store them in array
         ii.Write a surname of an author, that wrote the longest poem (let your application
        calculate it!)
 */

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Jianu", "Roman");
        Author author2 = new Author("Iancu", "German");
        Author author3 = new Author("Yuki", "Italian");

        Poem poem1 = new Poem(5, "Super super", author1);
        Poem poem2 = new Poem(15, "Super wow", author2);
        Poem poem3 = new Poem(25, "Wow super", author3);

        List<Poem> allPoems = List.of(poem1, poem2, poem3);
        Poem longestPoem = allPoems.getFirst();
        for(Poem it : allPoems) {
            if(it.getStropheNumbers() > longestPoem.getStropheNumbers() ) {
                longestPoem = it;
            }
        }

        System.out.println("Autorul cu poemul cel mai lung este: " + longestPoem.getCreator().getSurname());    // method chaining calls
    }
}
