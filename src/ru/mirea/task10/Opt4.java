package ru.mirea.task10;

public class Opt4 {

    public boolean first_digit;
    public Opt4() {System.out.println("\n\n№4:\n");}

    public int how_many(int k, int s){
        first_digit = true;
        return recursion(k, s);
    }

    public int recursion(int k, int s){

        if (k == 1){
            return 1;
        }

        int ans = 0;

        for (int i = 0; i <= s; i++){
            if (first_digit) first_digit = false;
            else ans += recursion(k - 1, s - i);
        }
        // System.out.print(ans + " ");
        return ans;
    }
}
