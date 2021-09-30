package ru.mirea.task2;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public Book(){
        this.name = "None";
        this.author = "None";
        this.year = 0;
    }
    @Override
    public String toString(){
        if (year == 0) return String.format("Название:  %s\nАвтор:  %s\nГод издания:  %s",
                name, author, "None");
        else  return String.format("Название:  %s\nАвтор:  %s\nГод издания:  %s",
                name, author, Integer.toString(year));
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

}
