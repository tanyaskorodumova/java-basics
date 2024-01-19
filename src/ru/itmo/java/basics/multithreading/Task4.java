package ru.itmo.java.basics.multithreading;

import static ru.itmo.java.basics.multithreading.CommonMain.joinAllThreads;

//4. Напишите программу, в которой создаются два потока, каждый из которых выводит
//по очереди на консоль своё имя.
public class Task4 {
    public static void main(String[] args) {
        pingPong(1000);
    }

    public static void pingPong(int time) {
        Thread ping = new InfPrinterThread("Ping");
        Thread pong = new InfPrinterThread("Pong");
        ping.start();
        pong.start();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        ping.interrupt();
        pong.interrupt();
    }
}
