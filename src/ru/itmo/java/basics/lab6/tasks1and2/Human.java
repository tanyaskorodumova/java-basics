package ru.itmo.java.basics.lab6.tasks1and2;

//1. Абстрактные классы
//Создайте несколько классов: абстрактный класс Человек;
public abstract class Human implements Printable{
    //В класс Человек добавьте:
    //поля: имя, фамилия
    private String firstName;
    private String lastName;

    //конструктор для установки значений
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //метод для получение имени
    public String getFirstName() {
        return this.firstName;
    }

    //метод для получение фамилии
    public String getLastName() {
        return this.lastName;
    }

    //абстрактный метод для вывода всей информации
    //после выполнения задания 2 метод вынесен в интрфейс
    //public abstract void printInfo();

}
