package ru.mirea.task8.opt2;

import javax.swing.*;
//import java.awt.*;

public class InitFrame extends JFrame {

    public InitFrame(){

        Draw image = new Draw();

        setSize(275, 183);
        setVisible(true);
        add(image);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}