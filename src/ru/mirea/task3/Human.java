package ru.mirea.task3;

public class Human {
    private String name;
    private Hand hand;
    private Head head;
    private Leg leg;

    public Human(String name) {
        this.name = name;
        this.hand = new Hand();
        this.head = new Head();
        this.leg = new Leg();
    }

    public String toString () {
            return "This human "+ name + "\n" + head.toString() + ",\n" + hand.toString() + "\nand " + leg.toString() + ".";
        }
    }