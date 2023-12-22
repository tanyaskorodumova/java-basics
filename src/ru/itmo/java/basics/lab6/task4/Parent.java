package ru.itmo.java.basics.lab6.task4;

import java.util.Scanner;

//4. Создайте два класса: главный и класс-наследник.
public class Parent {
    //В главном классе: создайте поле для ввода целого числа
    private int number;

    public Parent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
