package ru.mirea.task6.optNameable;

public class Human implements Nameable {
    String name;
    int age;

    public Human(){
        name = "Maria";
        age = 20;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human: " +
                "name='" + name + "\', " +
                "age=" + age + "\n";
    }
}
