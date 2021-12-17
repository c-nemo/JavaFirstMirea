package ru.mirea.task8.opt_1;

import javax.swing.JComponent;
import java.awt.*;

public abstract class Shape extends JComponent{
    protected int xPos, yPos; // координаты центра окружности или левого верхнего угла прямоугольника
    private static final long serialVersionUID = 1L;
    protected Color color;
    protected int type;

    // параметры: цвет и тип фигуры
    Shape(int xPos, int yPos, Color color, int type) {
        super();
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        this.type = type;
        this.setLocation(xPos, yPos);
        this.setVisible(true);
        this.setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    };
}


class Rectangle extends Shape{
    private int xPos2, yPos2; // координаты нижнего правого угла
    Rectangle(int xPos, int yPos, int width, int length, Color color){
        super(xPos, yPos, color, 1);
        xPos2=xPos+length;
        yPos2=yPos+width;
        this.setSize(xPos2-xPos,yPos2-yPos);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // прорисовка фигуры
        this.setBounds(xPos,yPos,xPos2-xPos,xPos2-xPos);
        g.setColor(this.color);
        g.fillRect(0,0,xPos2 - xPos, yPos2-yPos);
    }
}

class Circle extends Shape{
    private int radius;

    Circle(int xPos, int yPos, int radius, Color color) {
        super(xPos, yPos, color, 0);
        this.radius=radius;
        this.setSize(radius, radius);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // прорисовка фигуры
        g.setColor(this.color);
        g.fillOval(0,0, radius, radius);
    }
}