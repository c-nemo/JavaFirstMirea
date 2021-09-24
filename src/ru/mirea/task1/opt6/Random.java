package ru.mirea.task1.opt6;
import java.util.Arrays;

public class Random {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            // System.out.println(array[i]);
        }
        String s_array = Arrays.toString(array);
        System.out.println(s_array);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
