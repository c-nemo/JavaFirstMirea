package ru.mirea.task2;

public class DogTest {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog("Бобик", 3);
        dogs[2] = new Dog("Волк", 4);

        dogs[2].setage(4);
        dogs[2].setname("Волк");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
            System.out.print(dogs[i].getage() + " ");
            System.out.println(dogs[i].getname());
            System.out.println("Человеческий возраст: " + dogs[i].into_human_age() + "\n");
        }
    }
}