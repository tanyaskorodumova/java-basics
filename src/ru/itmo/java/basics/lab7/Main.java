package ru.itmo.java.basics.lab7;

public class Main {
    public static void main(String[] args) {
        //Создание объекта для теста
        Plane plane = new Plane(43.0, 42.0);

        System.out.println();
        //Получить информацию о крыльях самолета из класса Main
        System.out.print("Крыло 1. ");
        plane.getWing1().printWingInfo();
        System.out.print("Крыло 2. ");
        plane.getWing2().printWingInfo();
    }
}
