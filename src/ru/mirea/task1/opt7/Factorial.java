package ru.mirea.task1.opt7;

public class Factorial {
    public static void main(String[] args){

        int a = 3;
        int ans = 1;

        for (int i=1; i<=a; i++){
            ans *= i;
        }

        System.out.println(ans);
    }
}
