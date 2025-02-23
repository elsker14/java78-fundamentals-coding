package com.javaremotero78.task19;

/*
    b. Poem class, representing poem, which consists of fields creator (type Author) and
    stropheNumbers (type int – numbers of strophes in poem)
 */

public class Poem {

    private int stropheNumbers;
    private String name;
    private Author creator;

    public Poem(int stropheNumbers, String name, Author creator) {
        this.stropheNumbers = stropheNumbers;
        this.name = name;
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }
}
