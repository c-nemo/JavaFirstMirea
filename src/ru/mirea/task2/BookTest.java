package ru.mirea.task2;

public class BookTest {
    public static void main(String[] args){

        Book b1 = new Book("The Three Sisters", "unknown", 0);
        System.out.println(b1.getName() + ", " + b1.getAuthor() + ", " + b1.getYear());

        b1.setAuthor("Anton Chekhov");
        b1.setYear(1901);
        System.out.println('\n');
        System.out.println(b1);
        System.out.println('\n');

        Book b2 = new Book();
        System.out.println(b2.toString());
    }
}
