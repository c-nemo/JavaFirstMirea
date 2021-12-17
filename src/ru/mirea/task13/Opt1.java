package ru.mirea.task13;

import java.util.ArrayList;
import java.util.Comparator;

public class Opt1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i<10; i++){
            arr.add((int)(Math.random()*10));
        }

        System.out.println(arr.toString());
        System.out.println("Индекс элемента 1: " + arr.indexOf(1));
        System.out.println("Элемент под индексом 2: " + arr.get(2));
        System.out.println("Длина коллекции: " + arr.size());

        arr.set(3,10);
        System.out.println("Замена третьего элемента на 10: " + arr.toString());

        arr.remove(2);
        System.out.println("Удаление второго элемента: " + arr.toString());

        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("Сортировка: " + arr.toString());
    }
}