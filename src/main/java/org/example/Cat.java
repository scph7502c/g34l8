package org.example;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String getCatName() {
        return super.getName();
    }
}