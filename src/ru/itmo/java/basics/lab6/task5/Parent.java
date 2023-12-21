package ru.itmo.java.basics.lab6.task5;

import java.util.Scanner;

//5. Создайте главный класс.
public class Parent {
    private Integer age;
    protected Scanner scanner;

    public Parent() {
        scanner = new Scanner(System.in);
    }

    //Добавьте в него: метод для получения возраста пользователя
    public Object getInfo() {
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
        System.out.println("Возраст пользователя: " + age);
        return age;
    }
}
