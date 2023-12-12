package ru.itmo.java.basics.lab3;

public class JavaProgram {
    public static void main(String[] args) {
        //Из задания 1. Создайте объект класса «Study».
        //В качестве значения для поля «course» установите текст: «Изучение Java - это просто!».
        //Обратитесь к методу «printCourse» для вывода значения поля «course».
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        //Из задания 2. Добавьте два объекта, установите для них значения и выведите все при помощи ранее созданного метода.
        Car car1 = new Car(Color.BLACK, 1468.0);
        Car car2 = new Car(Color.LIGHT_BLUE, 1345.0);
        car1.setName("Nissan Qashqai");
        car2.setName("Ford Focus 2");
        car1.printInfo();
        car2.printInfo();

        //Из задания 3. На основе класса создайте два объекта и пропишите для каждого характеристики.
        //Добавление характеристик реализуйте через метод класса.
        House house1 = new House();
        House house2 = new House();
        house1.setAll(14, 1961, "Khrushchevka");
        house2.setAll(2, 1418, "Tavern house");
        //Выведите информацию про каждый объект.
        house1.printInfo();
        house2.printInfo();

        //Из задания 4. Создайте три объекта на основе класса и используйте по одному конструктору на каждый.
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(87, "Old Ash");
        Tree tree3 = new Tree(24, true, "Birch");
    }
}
