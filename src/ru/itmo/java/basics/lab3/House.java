package ru.itmo.java.basics.lab3;

import java.util.Calendar;

//3. Создайте класс Дом.
public class House {
    //Добавьте в него следующие данные:
    //●	поля: количество этажей, год постройки, наименование;
    private int floors;
    private int year;
    private String name;

    //●	метод для установки всех значений;
    public void setAll(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    //●	метод для вывода всех значений;
    public void printInfo() {
        System.out.println("This house " + this.name + " was built in " + this.year + " and has " + this.floors + " floors.");
        //Или упрощенный вариант
        //System.out.println(this.toString());
    }

    //●	метод, возвращающий количество лет с момента постройки.
    public int getAge() {
        int age;
        Calendar calendar = Calendar.getInstance();
        age = calendar.get(Calendar.YEAR) - this.year;
        return age;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
