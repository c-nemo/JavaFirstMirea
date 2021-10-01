package ru.mirea.task4;

public class BallTest {
    public static void main(String[] args) {

        Ball b1 = new Ball(1, 1);
        System.out.println(b1);

        b1.move(100, 200);
        b1.setX(200);
        System.out.println(b1);
    }
}