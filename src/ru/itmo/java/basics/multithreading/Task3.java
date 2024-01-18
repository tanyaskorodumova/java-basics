package ru.itmo.java.basics.multithreading;

import static ru.itmo.java.basics.multithreading.CommonMain.joinAllThreads;

//3. Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
//После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
public class Task3 {
    public static void main(String[] args) {
        threadCounter(100, 1000);
    }

    public static void threadCounter(int threadsCount, int times) {
        Counter counter = new Counter();
        for (int i = 0; i < threadsCount; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < times; j++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
            });
            thread.start();
        }

        //Ждем завершения всех созданных потоков
        joinAllThreads();

        System.out.println("count after operations: " + counter.getCount());
    }
}
