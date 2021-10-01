package ru.mirea.task8.opt2;

import javax.imageio.ImageIO;

import javax.swing.*;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Draw extends JPanel {

    @Override
    public void paint(Graphics g) {

        String filename = "src/ru/mirea/task8/opt2/kitten.jpg";

        Image img = new ImageIcon(filename).getImage();
        super.paint(g);

        Graphics2D g2D = (Graphics2D)g;
        g2D.drawImage(img, 0, 0, null);

    }
}
