package ru.mirea.task8.opt1;

import java.awt.*;

class Circle extends Shape{

    Circle(int x, int y, Color color, int size){
        super(x, y, color, 0);
        this.size = size;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("circle " + " " + x + " " + y + " " + color);

        g.setColor(this.color);
        g.fillOval(0,0, size, size);
    }
}