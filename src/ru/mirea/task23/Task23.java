package ru.mirea.task23;

import java.util.Objects;

public class Task23 {
    public static void main(String[] args) {
        Animal a1, a2, a3, a4, a5;
        a1 = new Dog("Альма", 10, 20);
        a2 = new Dog("Даймонд", 5, 8);
        a3 = new Cat("Барсик", 5, 8);
        a4 = new Cat("Даймонд", 5, 8);
        a5 = new Cat("Барсик", 5, 8);

        System.out.println("Сравнивание объектов с разными полями, но одинаковыми классами");
        System.out.println("Хеши: " + a1.hashCode() + " " + a2.hashCode());
        System.out.println("Объекты равны: " + a1.equals(a2) + "\n");

        System.out.println("Сравнивание объектов c одим различающимся параметром");
        System.out.println("Хеши: " + a3.hashCode() + " " + a4.hashCode());
        System.out.println("Объекты равны: " + a3.equals(a4) + "\n");

        System.out.println("Сравнивание объектов с одинаковыми полями, но разными классами");
        System.out.println("Хеши: " + a2.hashCode() + " " + a4.hashCode());
        System.out.println("Объекты равны: " + a2.equals(a4) + "\n");

        System.out.println("Сравнивание объектов с одинаковыми полями");
        System.out.println("Хеши: " + a3.hashCode() + " " + a5.hashCode());
        System.out.println("Объекты равны: " + a5.equals(a3) + "\n");
    }
}

class Animal{
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(animal.weight, weight) == 0 && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}

class Cat extends Animal{
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
}


class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
}