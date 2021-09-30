package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args){

        Circle c = new Circle((float) 1.2);
        System.out.println("r = " + c.get_radius());

        c.set_radius((float) 1.3);
        System.out.println(c.toString());
    }
}