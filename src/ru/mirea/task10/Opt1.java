package ru.mirea.task10;

public class Opt1 {

    public Opt1() {System.out.println("\n\n№1:\n");}

    public void triangle(int n){
        if (n == 0) return;
        else {
            triangle(n - 1);
            for (int i = 1; i <= n; i++) System.out.print(n + " ");
            System.out.println();
        }
    }
}
