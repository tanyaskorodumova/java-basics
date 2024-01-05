package ru.itmo.java.basics.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Вызов метода из задания 1
        System.out.println(getListFromFile("files/Files.txt").toString());

        //Вызов метода из задания 2
        writeString("Это тестовая строка.", "files/OutputFile.txt");

        //Вызов метода из задания 3
        readAndWrite("files/Files.txt", "files/InputFile2.txt", "files/OutputFile.txt");

        //Вызов метода из задания 4
        replaceInFile("files/voyna-i-mir-tom-1.txt", "\\$", "files/voyna-i-mir-tom-1_new.txt");
    }

    //1. Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static List<String> getListFromFile(String path) {
        List<String> resultList = new ArrayList<>();

        File srcFile = new File(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(srcFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                resultList.add(line);
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return resultList;
    }

    //2. Написать метод, который записывает в файл строку, переданную параметром.
    public static void writeString(String string, String outPath) {
        File resultFile = new File(outPath);

        FileWriter fileWriter = null;
        BufferedWriter writer = null;

        try {
            fileWriter = new FileWriter(resultFile, true);
            writer = new BufferedWriter(fileWriter);

            writer.write(string + "\n");
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if (writer != null) {
                    writer.close();
                }

                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
            catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    //3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
    public static void readAndWrite(String inputPath1, String inputPath2, String outputPath) {
        List<String> strings1 = getListFromFile(inputPath1);
        List<String> strings2 = getListFromFile(inputPath2);

        List<String> biggerList;
        int minSize = 0;
        if (strings1.size() > strings2.size()) {
            biggerList = strings1;
            minSize = strings2.size();
        } else {
            biggerList = strings2;
            minSize = strings1.size();
        }

        for (int i = 0; i < minSize; i++) {
            String str1 = strings1.get(i);
            String str2 = strings2.get(i);
            writeString(str1, outputPath);
            writeString(str2, outputPath);
        }

        for (int i = minSize; i < biggerList.size(); i++) {
            writeString(biggerList.get(i), outputPath);
        }
    }

    //4. Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
    public static void replaceInFile(String path, String replacement, String newPath) {
        File file = new File(path);
        File newFile = new File(newPath);

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("[^А-Яа-яA-Za-z]", replacement);
                writer.write(line);
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
