package ru.mirea.task5.optFurniture;

public abstract class Furniture {
    int price, size;

    public Furniture(){
        price = 10000;
        size = 10;
    }

    public Furniture(int price, int depth, int width, int height){
        this.price = price;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
