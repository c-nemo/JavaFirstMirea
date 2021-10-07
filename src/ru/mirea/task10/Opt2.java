package ru.mirea.task10;

public class Opt2 {

    public Opt2() {System.out.println("\n\n№2:\n");}

    public void one_to_n(int n){
        if (n == 1) System.out.print(n);
        else {
            this.one_to_n(n - 1);
            System.out.print(" " + n);
        }
    }
}
