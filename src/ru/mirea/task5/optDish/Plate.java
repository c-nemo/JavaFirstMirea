package ru.mirea.task5.optDish;

public class Plate extends Dish {
    protected int year_of_production;

    public Plate() {
        super();
        this.year_of_production = 2020;
    }

    public Plate(String shape, String material, int volume, int year_of_production) {
        super(shape, material, volume);
        this.year_of_production = year_of_production;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    @Override
    public String toString() {
        return "Plate:\n" +
                "shape=" + shape + ",\n" +
                "material=" + material + ",\n" +
                "volume=" + volume + ",\n" +
                "year of production=" + year_of_production + "\n";
    }
}