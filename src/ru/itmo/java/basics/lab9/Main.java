package ru.itmo.java.basics.lab9;

import java.io.IOException;
import java.util.*;

import static ru.itmo.java.basics.lab4.pt2.Main.getRandArray;

public class Main {

    public static void main(String[] args) {

        //Создание случаного списка целых чисел
        List<Integer> randomList = getRandIntList(30, 8);

        //Вывод исходной коллекции
        System.out.println(randomList.toString());

        //Вызов метода из задания 2
        System.out.println(removeDuplicates(randomList).toString());

        System.out.println();

        //3. Замерьте время, которое потрачено на это
        long startTime;
        long endTime;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Вызываем метод для заполнения ArrayList 1_000_000 значений от -1000 до 1000.");
        startTime = System.currentTimeMillis();
        arrayList = getBigRandList(1_000_000, "ArrayList", 1000);
        endTime = System.currentTimeMillis();
        System.out.println("На заполнение ArrayList ушло " + (endTime - startTime) + " мс.");

        System.out.println("Вызываем метод для заполнения LinkedList 1_000_000 значений от -1000 до 1000.");
        startTime = System.currentTimeMillis();
        linkedList = getBigRandList(1_000_000, "LinkedList", 1000);
        endTime = System.currentTimeMillis();
        System.out.println("На заполнение LinkedList ушло " + (endTime - startTime) + " мс.");

        System.out.println();

        System.out.println("Вызываем метод для получения случайного элемента из ArrayList 100_000 раз.");
        startTime = System.currentTimeMillis();
        getRandItemSomeTimes(arrayList, 100_000);
        endTime = System.currentTimeMillis();
        System.out.println("На получение элмементов из ArrayList ушло " + (endTime - startTime) + " мс.");

        System.out.println("Вызываем метод для получения случайного элемента из LinkedList 100_000 раз.");
        startTime = System.currentTimeMillis();
        getRandItemSomeTimes(linkedList, 1_000);
        endTime = System.currentTimeMillis();
        System.out.println("На получение элмементов из LinkedList ушло " + (endTime - startTime) + " мс.");

        System.out.println("Работа с LinkedList занимает намного больше времени, чем с ArrayList, " +
                "т.к. в основе ArrayList лежит массив, доступ к элементам которого легко получить по номеру элемента, " +
                "а для получения элементов LinkedList необходимо проходить всю цепочку разбросанных по памяти элементов до указанного номера.");

        System.out.println();

        //Заполнение множества имен
        Set<String> names = getRandSet(15, 4, 20);
        System.out.println("Доступные имена: " + names.toString());

        //Вызов метода для заполнения Map из задания 4
        Map<User, Integer> userMap = getUserMap(names, 2024);

        //Вызов метода из задания 4
        showUserPoint(userMap);

    }

    //2. Написать метод, который на входе получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
    public static Collection removeDuplicates(Collection inputCollection) {
        Set resultCollection = new HashSet();
        resultCollection.addAll(inputCollection);
        return resultCollection;
    }

    //3. Напишите метод, который добавляет 1млн элементов в ArrayList и LinkedList
    public static List getBigRandList(int size, String listType, int maxVal) {
        List<Integer> result;

        switch (listType) {
            case "LinkedList": {
                result = new LinkedList<>();
                break;
            }
            case "ArrayList": {
                result = new ArrayList<>();
                break;
            }
            default: {
                System.out.println("Введен некорректный тип списка.");
                return null;
            }
        }

        for (int i = 0; i < size; i++) {
            int randVal = (int) ((Math.random() * (maxVal * 2 + 1)) - maxVal);
            result.add(Integer.valueOf(randVal));
        }

        return result;
    }

    //3. Напишите метод, который выбирает из заполненного списка элемент наугад 100000 раз.
    public static Integer getRandItemSomeTimes(List<Integer> list, int numTimes) {
        Integer lastItem = null;

        for (int i = 0; i < numTimes; i++) {
            int randomNum = (int) (Math.random() * list.size());
            lastItem = list.get(randomNum);
        }

        return lastItem;
    }

    public static List getRandIntList(int maxSize, int maxVal) {
        List<Integer> result = new ArrayList<>();
        int[] randArray = getRandArray(maxSize, maxVal);

        for (int i: randArray) {
            result.add(Integer.valueOf(i));
        }

        return result;
    }

    //Создайте Map, в котором для каждого пользователя хранится количество очков,
    //заработанных в какой-то игре (Map<User, Integer>)
    public static Map<User, Integer> getUserMap(Set<String> names, int maxPoints) {
        Map<User, Integer> userMap = new HashMap<>();

        for (String name: names) {
            int points = (int) (Math.random() * maxPoints * 2 + 1 - maxPoints);
            userMap.put(new User(name), Integer.valueOf(points));
        }

        return userMap;
    }

    //Напишите программу, которая считывает с консоли имя и показывает, сколько очков у такого пользователя.
    public static void showUserPoint(Map<User, Integer> userMap) {

        System.out.print("Введите имя пользователя: ");

        try(Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();

            User thisUser = null;
            for (User user: userMap.keySet()) {
                if (user.getName().equals(name)) {
                    thisUser = user;
                    break;
                }
            }

            if (thisUser == null) {
                System.out.println("Указанного пользователя не существует.");
            }
            else {
                System.out.println("У пользователя " + name + " " + userMap.get(thisUser) + " очков.");
            }
        }

    }

    //Заполняем множество случайных имен
    public static Set<String> getRandSet(int size, int minLen, int maxLen) {
        Set<String> randSet = new HashSet<>();

        char[] alphaNumeric = getAlphaNumeric();

        for (int i = 0; i < size; i++) {
            String element = "";
            int len = (int) (Math.random() * (maxLen - minLen) + 1 + minLen);

            for (int j = 0; j < len; j++) {
                char newChar = alphaNumeric[(int) (Math.random() * alphaNumeric.length)];
                element = element + newChar;
            }

            randSet.add(element);
        }

        return randSet;
    }

    //Заполнение буквенно-цифрового массива
    public static char[] getAlphaNumeric() {
        char[] alphaNumeric = new char[10 + 26 + 26];

        int index = 0;

        //Заполнение цифрами
        for (int i = (int) '0'; i <= (int) '9'; i++) {
            alphaNumeric[index++] = (char) i;
        }

        //Заполнение буквенными символами
        for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
            alphaNumeric[index++] = (char) i;
            alphaNumeric[index++] = (char) (i + 32);
        }

        return alphaNumeric;
    }

}
