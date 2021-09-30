package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(){
        this.name = "Шарик";
        this.age = 2;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    @Override
    public String toString(){
        return "Собака по имени: " + this.name + ", возраст: " + this.age;
    }

    public int into_human_age(){
        return age * 7;
    }
}
