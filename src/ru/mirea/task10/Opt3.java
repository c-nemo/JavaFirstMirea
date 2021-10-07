package ru.mirea.task10;

public class Opt3 {

    public Opt3() {System.out.println("\n\n№3:\n");}

    public void from_a_to_b(int a, int b){
        System.out.print(a + " ");
        if (a == b) System.out.println();
        if (a < b) from_a_to_b(a + 1, b);
        if (a > b) from_a_to_b(a - 1, b);

    }
}
