package ru.itmo.java.basics.lab4.pt1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Вызов метода для задания 1
        printOdd(1, 99);

        //Вызов метода для задания 2
        printDivisible(1, 100, 3, 5);

        //Вызов метода для задания 3
        isSum();

        //Вызов метода для задания 4
        isBigger();

        //Создание массива для заданий 5 и 6
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println(Arrays.toString(array));
        //Вызов метода для задания 5
        System.out.println("3 является первым и последним числом массива: " + isFirstAndLast(array, 3));
        //Вызов метода из задания 6
        System.out.println("Массив содержит 1 или 3: " + isNumIncluded(array, 1, 3));
    }

    //1.Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
    // Каждое число печатается с новой строки.
    public static void printOdd(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //2. Напишите программу, которая выводит числа от 1 до 100,
    // которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
    public static void printDivisible(int min, int max, int divisor1, int divisor2) {
        String divisibleByDiv1 = "Делится на " + divisor1 + ": ";
        String divisibleByDiv2 = "Делится на " + divisor2 + ": ";
        String divisibleByBoth = "Делится на " + divisor1 + " и " + divisor2 + ": ";
        for (int i = min; i <= max; i++) {
            if (i % divisor1 == 0) {
                divisibleByDiv1 += i + " "; //Закомментить, если делим строго на 3 группы (убираем пересечения)
                if (i % divisor2 == 0) {
                    divisibleByBoth += i + " ";
                    divisibleByDiv2 += i + " "; //Закомментить, если делим строго на 3 группы (убираем пересечения)
                }
                //Раскомменить, если делим строго на 3 группы (убираем пересечения)
                //else {
                //    divisibleByDiv1 += i + " ";
                //}
            } else if (i % divisor2 == 0) {
                divisibleByDiv2 += i + " ";
            }
        }
        System.out.println(divisibleByDiv1);
        System.out.println(divisibleByDiv2);
        System.out.println(divisibleByBoth);
    }

    //3.Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
    // если сумма равна третьему целому числу.
    public static boolean isSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        System.out.println("Результат: " + num1 + " + " + num2 + " = " + num3 + " -" + (num1 + num2 == num3));
        return (num1 + num2 == num3);
    }

    //4.Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
    // если второе число больше первого числа, а третье число больше второго числа.
    public static boolean isBigger() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        System.out.println("Результат: " + num1 + " < " + num2 + " < " + num3 + " -" + ((num1 < num2) && (num2 < num3)));
        return ((num1 < num2) && (num2 < num3));
    }

    //5. Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
    //Длина массива должна быть больше или равна двум.
    public static boolean isFirstAndLast(int[] array, int num) {
        if (array.length < 2) {
            System.out.println("Переданный массив слишком короткий");
            return false;
        }
        if (array[0] == num && array[array.length - 1] == num) return true;
        else return false;
    }

    //6. Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
    public static boolean isNumIncluded(int[] array, int num1, int num2) {
        for (int x : array) {
            if (x == num1 || x == num2) return true;
        }
        return false;
    }
}
