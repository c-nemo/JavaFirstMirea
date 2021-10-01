package ru.mirea.task5.optDog;

public class Pug extends Dog {
    protected int weight;

    public Pug() {
        super();
        this.weight = 5;
        this.characteristic = "flat snout";
    }

    public Pug(String characteristic, String color, int age, int weight) {
        super(characteristic, color, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pug:\n" +
                "characteristic=" + characteristic + ",\n" +
                "color=" + color + ",\n" +
                "age=" + age + ",\n" +
                "weight=" + weight + "\n";
    }
}