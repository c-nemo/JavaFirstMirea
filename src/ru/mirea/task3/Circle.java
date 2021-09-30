package ru.mirea.task3;

public class Circle {
    private float radius;
    private float diameter;
    private float area;
    private float length;

    public Circle(float radius){
        this.radius = radius;
        this.calculate();
    }

    private void calculate(){
        this.diameter = this.radius * 2;
        this.area = (float) 3.14 * (float) Math.pow(this.radius, 2) ;
        this.length = this.radius * (float) (2 * 3.14);
    }

    public void set_radius(float radius){
        this.radius = radius;
        this.calculate();
    }
    public float get_radius(){
        return this.radius;
    }
    public float get_diameter(){
        return this.diameter;
    }
    public float get_area(){
        return this.area;
    }
    public float get_length(){
        return this.length;
    }

    public String toString(){
        return "r = " + this.get_radius() +
                "\ndiam = " + this.get_diameter() +
                "\narea = " + this.get_area() +
                "\nlength = " + this.get_length();
    }
}