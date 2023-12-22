package ru.itmo.java.basics.lab7;

//1. Создайте класс Самолет.
public class Plane {
    private Wing wing1;
    private Wing wing2;

    public Plane(double wing1Weight, double wing2Weight) {
        System.out.println("Создаем самолет.");
        //В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла, а также выведите информацию на экран.
        //Создайте два объекта и добавьте разный вес для крыльев.
        wing1 = new Wing(wing1Weight);
        wing1.printWingInfo();
        wing2 = new Wing(wing2Weight);
        wing2.printWingInfo();
        System.out.println("Новый самолет создан.");
    }

    public Wing getWing1() {
        return wing1;
    }

    public Wing getWing2() {
        return wing2;
    }

    //В классе создайте вложенный класс крыло.
    public class Wing {
        //Внутри класса Крыло реализуйте:
        //●	поле для хранения информации про вес крыла;
        private double weight;

        //●	метод, что будет показывать вес крыла
        public void printWingInfo() {
            System.out.println("Вес данного крыла: " + this.weight + " тонн.");
        }

        public Wing(double weight) {
            System.out.println("Создано крыло самолета.");
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
}
