package com.motuziene;

public class Person {
    private String name;
    private String surName;

    public Person() {
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person(String name) {

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
