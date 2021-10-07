package ru.mirea.task10;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nНомер в списке: 18\nПерсональный вариант: 1-5");

        Opt1 o1 = new Opt1();
        o1.triangle(10);

        Opt2 o2 = new Opt2();
        o2.one_to_n(10);

        Opt3 o3 = new Opt3();
        o3.from_a_to_b(1, 10);
        o3.from_a_to_b(5, -5);

        Opt4 o4 = new Opt4();
        System.out.println(o4.how_many(4, 4));
        System.out.println(o4.how_many(4, 1));

        Opt5 o5 = new Opt5();
        System.out.println(o5.sum_of_digits(1234));

    }
}
