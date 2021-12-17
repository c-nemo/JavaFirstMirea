package ru.mirea.task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTimeTest{
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        int time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять чисел: ");
        time = scanner.nextInt();
        date.setYear(time-1900);
        calendar.set(Calendar.YEAR, time);

        time = scanner.nextInt();
        date.setMonth(time);
        calendar.set(Calendar.MONTH, time);

        time = scanner.nextInt();
        date.setDate(time);
        calendar.set(Calendar.DAY_OF_MONTH, time);

        time = scanner.nextInt();
        date.setHours(time);
        calendar.set(Calendar.HOUR_OF_DAY, time);

        time = scanner.nextInt();
        date.setMinutes(time);
        calendar.set(Calendar.MINUTE, time);

        System.out.println(date);
        System.out.println(calendar.getTime());


        System.out.println("Задание получено " + (new GregorianCalendar(2021, 11,9,18,30).getTime()));
        System.out.println("Задание сдано " + new Date());
    }
}
