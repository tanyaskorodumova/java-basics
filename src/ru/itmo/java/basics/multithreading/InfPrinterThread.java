package ru.itmo.java.basics.multithreading;

public class InfPrinterThread extends Thread {

    public InfPrinterThread(String name) {
        super(name);
    }

    private int iterNumber;

    @Override
    public void run() {
        while (!isInterrupted()) {

            System.out.println("My name is " + Thread.currentThread().getName() + " (" + (iterNumber++) + ")");

            synchronized (System.out) {
                System.out.notify();
                try {
                    System.out.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
