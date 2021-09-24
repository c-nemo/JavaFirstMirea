package ru.mirea.task1.opt3;

public class Cycles {
    public static void main(String[] args){

        int[] array = { 1, 2, 3, 4, 5 };

        int summa1 = 0;
        int summa2 = 0;
        int summa3 = 0;

        // for
        for (int i = 0; i < array.length; i++){
            summa1 += array[i];
        }

        //while
        int i = 0;
        while (i < array.length){
            summa2 += array[i];
            i++;
        }

        // do while
        i = 0;
        do {
            summa3 += array[i];
            i++;
        } while (i < array.length);

        System.out.println(summa1);
        System.out.println(summa2);
        System.out.println(summa3);
    }
}
