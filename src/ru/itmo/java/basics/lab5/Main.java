package ru.itmo.java.basics.lab5;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Получаем текст для теста
        String text = getText("C:\\Users\\Tatiana\\Desktop\\JavaLearning\\voyna-i-mir-tom-1.txt");

        //Вызов метода из задания 1
        System.out.println("Самое длинное слово: " + getLongestWord(text));

        //Вызов метода из задания 2
        System.out.println("Слово saippuakivikauppias является палиндромом: " + isPalindrome("saippuakivikauppias"));
        System.out.println("Слово палиндром является палиндромом: " + isPalindrome("палиндром"));

        //Вызов метода из здаания 3
        String str = "бяка kfhf...бяка лрав бякашщрнп Бякидзе лвтшбяк лвараиБЯКА! Кулебяка!";
        System.out.println(str);
        System.out.println(censorReplace(str, "бяк"));

        //Вызов метода из задания 4
        String mainStr = "Эта строка состоит из строк. Сколько в ней строк? Считаем строки.";
        String subStr = "строк";
        System.out.println("В это строке: " + mainStr);
        System.out.println(getNumberOfOcc(mainStr, subStr) + " \"" + subStr + "\"");

        //Вызов метода из задания 5
        String srcString = "This is a test string";
        System.out.println("The given string is: " + srcString);
        String revString = reverseWords(srcString);
        System.out.println("The string reversed word by word is: " + revString);
    }

    //1. Написать метод для поиска самого длинного слова в тексте.
    public static String getLongestWord(String text) {
        //String[] words = text.replaceAll("[\\W|\\d]", " ").replaceAll("[\\s]{2,}", " ").split("\\s");
        text = text.replaceAll("[^А-Яа-яA-Za-z]", " ");
        text = text.replaceAll("[\\s]{2,}", " ");
        String[] words = text.split("\\s");

        int maxLen = words[0].length();
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLen) {
                maxLen = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    //2. Написать метод, который проверяет является ли слово палиндромом.
    public static boolean isPalindrome(String word) {
        if (word.length() < 2) return true;

        word = word.toLowerCase();

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //3. Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public static String censorReplace(String text,  String badWord) {
        char[] badWordLower = badWord.toLowerCase().toCharArray();
        char[] badWordUpper = badWord.toUpperCase().toCharArray();
        String regEx = "\\b"; //берем только слова, которые начинаются на badWord
        for (int i = 0; i < badWordLower.length; i++) {
            regEx += "[" + badWordLower[i] + badWordUpper[i] + "]";
        }
        regEx += "([А-Яа-я]{0,3})\\b"; //после корня badWord до конца слова может быть максимум 3 символа - для разных окончаний
        text = text.replaceAll(regEx, "[вырезано цензурой]");
        return text;
    }

    //4. Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public static int getNumberOfOcc(String mainStr, String subStr) {
        if (mainStr.length() < subStr.length()) {
            System.out.println("Строка mainStr должна быть не меньше subStr!");
            return 0;
        }

        mainStr = mainStr.toLowerCase();
        subStr = subStr.toLowerCase();

        int number = 0;
        int index = -1;

        while (index < mainStr.length()) {
            if (mainStr.indexOf(subStr, index + 1) < 0) {
                return number;
            } else {
                number++;
                index = mainStr.indexOf(subStr, index + 1);
            }
        }

        return number;
    }

    //5. Напишите метод, который инвертирует слова в строке.
    //Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
    public static String reverseWords(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = text.split("\\s");
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                stringBuilder.append(words[i].charAt(j));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static String getText(String path) {
        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.ready()) {
                text += br.readLine() + "\n";
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return text;
    }
}
