package ru.mirea.task13;

import java.util.Arrays;
import java.util.LinkedList;

public class Opt2 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<Integer>();

        for(int i=0; i<10; i++){
            arr.addFirst((int)(Math.random()*10));
        }
        System.out.println(arr.toString());

        System.out.println("Длина коллекции: " + arr.size());
        System.out.println("Второй элемент: " + arr.get(2));

        arr.set(1,15);
        System.out.println("Изменение первого элемента на 15: " + arr.toString());

        arr.remove(arr.indexOf(15));
        System.out.println("Удаление элемента со значением 15: " + arr.toString());

        arr.removeFirst();
        arr.removeLast();
        System.out.println("Удлание первого и последнего элементов: " + arr.toString());
    }
}