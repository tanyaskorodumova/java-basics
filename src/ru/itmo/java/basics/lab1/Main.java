package ru.itmo.java.basics.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Выведите строки в порядке
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println();

        //2.Посчитайте результат выражения
        //Вариант 1: с созданием переменных
        double result21 = (46 + 10) * (10 / 3.0);
        int result22 = (29) * (4) * (-15);
        System.out.println("Result 2.1: " + result21);
        System.out.println("Result 2.2: " + result22);
        //Вариант 2: если не было необходимости создавать переменные
        //System.out.println("(46 + 10) * (10 / 3) = " + ((46 + 10) * (10 / 3.0)));
        //System.out.println("(29) * (4) * (-15) = " + ((29) * (4) * (-15)));

        System.out.println();

        //3. В переменной number, лежит целое число 10500. В переменной result посчитайте следующее
        //выражение: (number / 10) / 10. Результат выведите на консоль.
        int number = 10500;
        //Вариант 1: использован тип int, т.к. результат - целое число
        int result3 = (number / 10) / 10;
        //Вариант 2: использован тип double ради универсальности
        //double result3 = (number / 10.0) / 10;
        System.out.println("(number / 10) / 10 = " + result3 + "\t //для number = " + number);

        System.out.println();

        //4. Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.
        double result4 = 3.6 * 4.1 * 5.9;
        System.out.println("result 4 = " + result4);
        System.out.println();

        //5. В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
        //целое число нужно печатать с новой строки.
        Scanner scanner = new Scanner(System.in);
        //Решение для 3 чисел аналогично примеру без использования циклов
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());

        System.out.println();

        //6. Для целого числа b выполните следующие условные действия:
            //● Если b нечетное, выведите “Нечетное”
            //● Если b четное, выведите “Четное”
            //● Если b четное и больше 100, выведите “Выход за пределы диапазона”
        int b = scanner.nextInt();
        if ((b % 2) != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            }
        }
    }

}
