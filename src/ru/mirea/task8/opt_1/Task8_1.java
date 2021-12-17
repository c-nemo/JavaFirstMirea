package ru.mirea.task8.opt_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Task8_1 {
    public static void main(String args[]){
        JFrame root = new JFrame("Task8");
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel a = new JPanel();
        a.setLayout(new BorderLayout());
        int size;
        Random rand = new Random();

        for (int i=0; i<20; i++){

            size = rand.nextInt(150);

            switch ((int)(Math.random()*2)) {
                case 0:
                    System.out.println(size);
                    a.add(new ru.mirea.task8.opt_1.Rectangle(
                            rand.nextInt(200),
                            rand.nextInt(200),
                            size,
                            size,
                            new Color((int) (Math.random() * 0x1000000))
                    ));
                    break;
                case 1:
                    a.add(new ru.mirea.task8.opt_1.Circle(
                            rand.nextInt(200),
                            rand.nextInt(200),
                            size,
                            new Color((int) (Math.random() * 0x1000000))
                    ));
                    break;
                default:
                    break;
            }
        }

        a.setSize(500, 500);
        a.setVisible(true);
        root.setContentPane(a);
        root.pack();
        root.setLocationRelativeTo(null);
        root.setVisible(true);
        root.setSize(500,500);
    }
}
