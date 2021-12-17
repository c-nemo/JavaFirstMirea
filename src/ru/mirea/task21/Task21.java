package ru.mirea.task21;

import java.util.ArrayList;

public class Task21 {
    public static void main(String[] args) {
        MetroList.PrintList(true);
        System.out.println();
        MetroList.PrintList(false);
    }
}

abstract class MetroList{
    static ArrayList<String> metroList = new ArrayList<>(16);
    static{
        metroList.add("Сокольническая");
        metroList.add("Замоскворецкая");
        metroList.add("Арбатско-Покровская");
        metroList.add("Филёвская");
        metroList.add("Кольцевая");
        metroList.add("Калужско-Рижская");
        metroList.add("Таганско-Краснопресненская");
        metroList.add("Калининская");
        metroList.add("Серпуховско-Тимирязевская");
        metroList.add("Люблинско-Дмитровская");
        metroList.add("Большая кольцевая");
        metroList.add("Бутовская");
        metroList.add("Московский монорельс");
        metroList.add("Московское центральное кольцо");
        metroList.add("Некрасовская");
        metroList.add("Рублёво-Архангельская");
    }

    static void PrintList(boolean even){
        for (int i = 0; i<metroList.size(); i++){
            if((i%2==0)==even){
                System.out.println(i + ") " + metroList.get(i));
            }
        }
    }
}