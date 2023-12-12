package ru.itmo.java.basics.lab3;

//4. Создайте класс Tree.
public class Tree {
    //Добавьте в него поля: возраст, живое ли дерево и название дерева.
    private int age;
    private boolean isAlive;
    private String name;

    //Создайте три конструктора:
    //●	Конструктор, который устанавливает только возраст и название;
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //●	Конструктор, который устанавливает все переменные в классе;
    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    //●	Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
