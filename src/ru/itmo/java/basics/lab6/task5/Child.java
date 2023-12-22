package ru.itmo.java.basics.lab6.task5;

//Создайте класс-наследник.
public class Child extends Parent{
    private String name;

    public Child() {
        super();
    }

    //Добавьте в него: переопределенный метод для получения имени пользователя;
    @Override
    public Object getInfo() {
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.println("Имя пользователя: " + name);
        return name;
    }
}
