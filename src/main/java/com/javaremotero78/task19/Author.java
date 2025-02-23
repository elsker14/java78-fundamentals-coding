package com.javaremotero78.task19;

/*
    a. Author class, representing an author – poem writer, which consists of fields surname
    and nationality (both of type String)

    this = pointer la clasa curenta astfel incat sa se poata identifica mai usor si direct atributele si metodele clasei
    obiect

    super = pointer la clasa parinte pt a putea accesa atribute/metode fara o instanta auxiliara a acesteia
 */

public class Author {

    // atribute
    private String surname;
    private String nationality;

    // constructori
    public Author() {
        this.surname = "";
        this.nationality = null;
    }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    // getters/setters
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // overrides
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // comportament
    /* --- aici puteti crea metode personalizate in functie de atributele clasei --- */
}
