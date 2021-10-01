package ru.mirea.task6.optNameable;

public class City implements Nameable{
    String name;
    int population;

    public City(){
        name = "Moscow";
        population = 12000000;
    }

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City: " +
                "name='" + name + "\', " +
                "population=" + population + "\n";
    }
}
