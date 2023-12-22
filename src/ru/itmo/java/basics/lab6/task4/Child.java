package ru.itmo.java.basics.lab6.task4;

public class Child extends Parent{
    //В классе-наследнике: метод для вывода переменной из главного класса
    public void printNumber() {
        System.out.println("Число из родительского класса: " + this.getNumber());
    }

    public Child() {
        super();
    }
}
