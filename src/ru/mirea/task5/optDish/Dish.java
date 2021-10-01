package ru.mirea.task5.optDish;

public abstract class Dish {

    protected String shape, material;
    protected int volume;

    public Dish(){
        this.material = "ceramic";
        this.shape = "round";
        this.volume = 3;
    }

    public Dish(String shape, String material, int volume) {
        this.shape = shape;
        this.material = material;
        this.volume = volume;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract String toString();
}

