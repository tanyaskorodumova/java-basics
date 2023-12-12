package ru.itmo.java.basics.lab3;

//1. Допишите в класс «Study» конструктор, что будет принимать один параметр и будет устанавливать
// значение этого параметра в поле «course».
public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}
