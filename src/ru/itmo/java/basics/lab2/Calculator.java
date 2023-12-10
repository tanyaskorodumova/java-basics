package ru.itmo.java.basics.lab2;

//1) Создать класс Calculator. У него должны быть методы:
//-	Сумма
//-	Деление
//-	Умножение
//-	Вычитание
//Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.
public class Calculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static long sum(long num1, long num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static long subtraction(long num1, long num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static long multiplication(long num1, long num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return (double) num1 / (double) num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double division(long num1, long num2) {
        return (double) num1 / (double) num2;
    }
}
