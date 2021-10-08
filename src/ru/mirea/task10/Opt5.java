package ru.mirea.task10;

public class Opt5 {

    public Opt5() {System.out.println("\n\n№5:\n");}

    public int sum_of_digits(int n){
        if (n == 0) return 0;
        return n % 10 + sum_of_digits(n / 10);
    }
}
