package ru.mirea.task5.optDish;

public class Pot extends Dish {
    protected int depth;

    public Pot() {
        super();
        this.depth = 3;
    }

    public Pot(String shape, String material, int volume, int depth) {
        super(shape, material, volume);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int year_of_production) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Pot:\n" +
                "shape=" + shape + ",\n" +
                "material=" + material + ",\n" +
                "volume=" + volume + ",\n" +
                "depth=" + depth + "\n";
    }
}
