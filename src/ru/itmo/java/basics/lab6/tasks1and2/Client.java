package ru.itmo.java.basics.lab6.tasks1and2;

//1. Абстрактные классы
//Создайте несколько классов: класс Клиент;

//В класс Клиент добавьте: наследование класса Человек;
public class Client extends Human {
    //строковое поле «название банка»
    private String bankName;

    //конструктор для установки всех значений
    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    //реализация функции для вывода информации
    @Override
    public void printInfo() {
        System.out.println("Клиент " + this.getFirstName() + " " + this.getLastName() + " обслуживается в банке " + this.bankName);
    }

    public String getBankName() {
        return bankName;
    }
}
