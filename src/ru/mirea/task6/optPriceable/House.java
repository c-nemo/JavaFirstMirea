package ru.mirea.task6.optPriceable;

public class House {
        String name;
        int price;

        public House(){
            this.name = "Избушка";
            this.price = 2000000;
        }

        public House(String name, int price){
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
            return "House: " +
                    "name='" + name + "\', " +
                    "price=" + price + "\n";
        }

}
