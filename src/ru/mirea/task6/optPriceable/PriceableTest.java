package ru.mirea.task6.optPriceable;

import ru.mirea.task6.optNameable.City;
import ru.mirea.task6.optNameable.Human;

public class PriceableTest {
    public static void main(String[] args) {

        House my_house = new House();
        Product my_product = new Product();

        System.out.println(my_house.getPrice());
        System.out.println(my_house.toString());

        System.out.println(my_product.getPrice());
        System.out.println(my_product.toString());
    }
}
