package ru.mirea.task5.optDog;

public class Corgi extends Dog {
    protected int length;

    public Corgi() {
        super();
        this.length = 5;
        this.characteristic = "short legs";
    }

    public Corgi(String characteristic, String color, int age, int length) {
        super(characteristic, color, age);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Corgi:\n" +
                "characteristic=" + characteristic + ",\n" +
                "color=" + color + ",\n" +
                "age=" + age + ",\n" +
                "length=" + length + "\n";
    }
}
