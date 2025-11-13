package org.day2;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public String describe() {
        return "Person[id=" + id + ", name=" + name + "]";
    }
}
