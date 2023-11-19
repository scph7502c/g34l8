package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String profession;
    private int age;

    public Person(String name, String surname, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Person)) return false;

        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(profession, person.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, profession, age);
    }
    
}