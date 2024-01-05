package ru.itmo.java.basics.lab9;

//4. Опишите класс User с одним полем name. Добавьте конструктор, сеттер и геттер.
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
