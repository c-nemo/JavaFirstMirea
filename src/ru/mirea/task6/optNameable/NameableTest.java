package ru.mirea.task6.optNameable;

public class NameableTest {
    public static void main(String[] args) {

        Human person = new Human();
        City town = new City();

        System.out.println(person.getName());
        System.out.println(person.toString());

        System.out.println(town.getName());
        System.out.println(town.toString());
    }
}
