package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task24 {
    public static void main(String[] args) {
        String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String ex1="127.0.0.1";
        String ex2="255.255.255.0";
        String ex3="1300.6.7.8";

        System.out.println(Pattern.matches(pattern, ex1));
        System.out.println(Pattern.matches(pattern, ex2));
        System.out.println(Pattern.matches(pattern, ex3));
    }
}
