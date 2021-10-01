package ru.mirea.task6.optPriceable;

public class Product {
    String name;
    int price;

    public Product(){
        this.name = "Тетрадь";
        this.price = 200;
    }

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + "\', " +
                "price=" + price + "\n";
    }

}
