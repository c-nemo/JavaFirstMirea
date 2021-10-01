package ru.mirea.task5.optDog;

public class DogTest {
    public static void main(String[] args) {

        Corgi corgi = new Corgi();
        System.out.println(corgi);

        corgi.setColor("yellow");
        corgi.setLength(10);
        System.out.println(corgi);

        Pug pug = new Pug();
        System.out.println(pug);

        pug.setAge(3);
        pug.setWeight(10);
        System.out.println(pug);
    }
}
