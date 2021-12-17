package ru.mirea.task18;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        String FIO, INN;
        System.out.println("Введите ФИО");
        Scanner scan = new Scanner(System.in);
        FIO = scan.nextLine();
        System.out.println("Введите ИНН");
        INN = scan.next();
        try {
            Integer.parseInt(INN);
            if (INN.length() != 10) System.out.println("Ошибка, неверное количество цифр");
            else System.out.println("ИНН записан");
        }catch (NumberFormatException e){
            System.out.println("Ошибка, неверный формат ИНН: " + e.getMessage());
        }
    }
}
