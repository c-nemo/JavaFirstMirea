package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame {
    static int trying;
    static int digit;
    public static void main(String[] args) {
        JFrame root = new JFrame();
        JPanel panel = new JPanel();
        root.setContentPane(panel);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        root.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel label = new JLabel("Угадайте число!");
        panel.add(label, constraints);
        replay(label);

        JTextField text = new JTextField(5);
        constraints.gridy=1;
        panel.add(text, constraints);

        JButton button = new JButton("Угадать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().isEmpty()){
                    label.setText("Вы ничего не ввели");
                }
                else if (label.getText()=="ТЫ ПОБЕДИЛ" || label.getText() =="ТЫ ПРОИГРАЛ"){
                    System.out.println("ПЕРЕИГРЫВАНИЕ");
                    System.out.println("###############################################");
                    text.setText("");
                    replay(label);
                    button.setText("Ввести");
                }
                else if (Integer.parseInt(text.getText())==digit){
                    label.setText("ТЫ ПОБЕДИЛ");
                    button.setText("Переиграть");
                }
                else if(Integer.parseInt(text.getText())>digit){
                    trying+=1;
                    label.setText("Загаданное число меньше");
                }
                else if (Integer.parseInt(text.getText())<digit){
                    trying+=1;
                    label.setText("Загаданное число больше");
                }
                if (label.getText()!="ТЫ ПОБЕДИЛ" && trying==3){
                    label.setText("ТЫ ПРОИГРАЛ");
                    button.setText("Переиграть");
                }
            }
        });
        constraints.gridy=2;
        panel.add(button, constraints);
        root.setLocationRelativeTo(null);
        root.setSize(500,500);
        root.setVisible(true);

    }

    static private void replay(JLabel label){
        digit=(int)(Math.random()*21);
        trying=0;
        label.setText("Угадайте число");
        System.out.println("Загаданное число -- " + digit);
    }
}