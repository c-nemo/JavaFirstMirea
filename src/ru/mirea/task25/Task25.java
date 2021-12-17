package ru.mirea.task25;

abstract class ShapeDecorator {
    Shape shape;
    ShapeDecorator(Shape shape) { this.shape = shape; }
    abstract void draw();
}

class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape shape) { super(shape); }
    @Override
    void draw() { shape.draw(); }
    void setRedBorder() { System.out.println("Red border"); }
}

interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() { System.out.println("Круг"); }
}

class Rectangle implements Shape {

    @Override
    public void draw() { System.out.println("Треугольник"); }
}

public class Task25 {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        RedShapeDecorator rsd = new RedShapeDecorator(r);
        rsd.setRedBorder();
        rsd.draw();

        System.out.println();

        Shape c = new Circle();
        RedShapeDecorator csd = new RedShapeDecorator(c);
        csd.setRedBorder();
        csd.draw();
    }
}
