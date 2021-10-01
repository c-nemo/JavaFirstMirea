package ru.mirea.task5.optDog;

public abstract class Dog {

    protected String characteristic, color;
    protected int age;

    public Dog() {
        this.characteristic = "nothing special";
        this.color = "brown";
        this.age = 2;
    }

    public Dog(String characteristic, String color, int age) {
        this.characteristic = characteristic;
        this.color = color;
        this.age = age;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String toString();
}