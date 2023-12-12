package ru.itmo.java.basics.lab3;

//2. Создайте простой класс, который будет иметь поля: цвет, название, вес.
public class Car {
    private Color color;
    private String name;
    private double weight;

    //Также добавьте несколько конструкторов, которые будут устанавливать:
    //●	только цвет машины;
    //●	цвет и вес машины;
    //●	и пустой конструктор.
    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    //Создайте метод в классе через который можно будет вывести все эти данные.
    public void printInfo() {
        System.out.println("This car " + this.name + " is " + this.color + " and weighs " + this.weight + "kg.");
        //Упрощенный вариант:
        //System.out.println(this.toString());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
