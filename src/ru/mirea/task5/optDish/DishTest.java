package ru.mirea.task5.optDish;

public class DishTest {
    public static void main(String[] args) {

        Plate plate = new Plate();
        System.out.println(plate);

        plate.setYear_of_production(2000);
        plate.setMaterial("aluminum");
        System.out.println(plate);

        Pot pot = new Pot();
        System.out.println(pot);

        pot.setDepth(2);
        pot.setVolume(1);
        System.out.println(pot);
    }
}
