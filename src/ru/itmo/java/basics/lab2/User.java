package ru.itmo.java.basics.lab2;

import java.util.Arrays;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
