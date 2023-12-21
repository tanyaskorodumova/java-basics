package ru.itmo.java.basics.lab6;

import ru.itmo.java.basics.lab6.task3.Truck;
import ru.itmo.java.basics.lab6.task4.Child;
import ru.itmo.java.basics.lab6.tasks1and2.BankWorker;
import ru.itmo.java.basics.lab6.tasks1and2.Client;

public class Main {
    public static void main(String[] args) {

        //Тест заданий 1 и 2
        Client client = new Client("Уолтер", "Уайт", "ООО \"МахинацииКредит\"");
        BankWorker bankWorker = new BankWorker("Сол", "Гудман", "ООО \"МахинацииКредит\"");
        client.printInfo();
        bankWorker.printInfo();

        //Тест задания 3
        Truck truck = new Truck(8000, "Урал 375", 'G', 75.0f, 4, 13000);
        truck.newWheels(6);

        //Тест задания 4
        Child child = new Child();
        child.printNumber();

        //Тест задания 5
        ru.itmo.java.basics.lab6.task5.Child task5Child = new ru.itmo.java.basics.lab6.task5.Child();
        task5Child.getInfo();
    }
}
