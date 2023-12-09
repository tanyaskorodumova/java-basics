package ru.itmo.java.basics.lab2;

import java.util.Date;

//2. Создать класс, который обозначает какую-либо сущность.
// Определить у него несколько конструкторов - конструктор без параметров и конструктор со всеми параметрами.
// Определить для него несколько параметров.
public class User {
    private String userName;
    private String email;
    private int age;
    private Date birthday;
    private String[] interests;

    //Конструктор без параметров
    public User() {

    }

    //Конструктор со всеми параметрами
    public User(String userName, String email, int age, Date birthday, String[] interests) {
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
        this.interests = interests;
    }
}
