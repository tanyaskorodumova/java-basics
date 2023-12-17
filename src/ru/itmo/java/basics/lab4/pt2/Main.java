package ru.itmo.java.basics.lab4.pt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = getRandArray(10, 100);

        //Вызов метода из задания 1
        System.out.println(Arrays.toString(nums));
        isAscSorted(nums);
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
        isAscSorted(mergeSort(nums));

        System.out.println();

        //Вызов метода из задания 2
        getAndPrintArray();

        System.out.println();

        nums = getRandArray(10, 50);
        //Вызов метода из задания 3
        System.out.println(Arrays.toString(nums));
        firstLastSwap(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println();

        nums = getRandArray(10, 10);
        //Вызов метода из задания 4
        System.out.println(Arrays.toString(nums));
        System.out.println("Первое уникальное значение: " + firstUnique(nums));

    }

    //1. Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
    //Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”
    public static boolean isAscSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                System.out.println("Please, try again");
                return false;
            }
        }
        System.out.println("OK");
        return true;
    }

    //2. Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
    // затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов.
    public static void getAndPrintArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println("Numbers of array:");
        int i = 0;
        while (i < array.length && scanner.hasNextInt()) {
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Result: " + Arrays.toString(array));
    }

    //3. Напишите метод, который меняет местами первый и последний элемент массива.
    public static void firstLastSwap(int[] array) {
        if (array.length < 2) {
            System.out.println("Массив слишком короткий");
            return;
        }
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    //4. Дан массив чисел. Найдите первое уникальное в этом массиве число.
    public static int firstUnique(int[] array) {
        if (array.length < 2) {
            return array[0];
        }

        int resultIndex = -1;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                resultIndex = i;
                break;
            }
        }

        if (resultIndex == -1) {
            System.out.println("В массиве нет уникальных значений, возвращено первое значение.");
            return array[0];
        } else {
            return array[resultIndex];
        }
    }


    //5.Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.
    public static int[] mergeSort(int[] ints) {

        //System.out.println(Arrays.toString(ints));

        if (ints.length < 2) {
            return ints;
        }

        int mid = ints.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = ints[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    public static int[] mergeParts(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }

    //Метод для заполнения случайного массива
    public static int[] getRandArray(int maxSize, int maxVal) {
        int size = (int) (Math.random() * maxSize) + 1; //размер - случайное число от 1 до maxSize
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxVal*2 +1)) - maxVal; //заполняем массив случайными числами от -maxVal до maxVal
        }

        return array;
    }
}
