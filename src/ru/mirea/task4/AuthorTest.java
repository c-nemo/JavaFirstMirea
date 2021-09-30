package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] args) {

        ru.mirea.task4.Author author = new ru.mirea.task4.Author(
                "Aleksandra K.", "sasha.kuroedova@gmail.com", 'f');

        System.out.println(author);

        author.setEmail("somebody.else@gmail.com");

        System.out.println(author + "\n");
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}