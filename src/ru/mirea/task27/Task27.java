package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task27 {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
    }

    static void task1(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Изюмов", "Александр");
        map.put("Бурдин", "Александр");
        map.put("Волович", "Артем");
        map.put("Киреев", "Артем");
        map.put("Сорокина", "Анна");
        map.put("Московченко", "Ксения");

        System.out.println("Словарь до коррекции");
        System.out.println(map);

        ArrayList<String> toDelete = new ArrayList<>();
        for (String surname:map.keySet()){
            String name = map.get(surname);
            for(String surname2:map.keySet()){
                boolean bool = map.get(surname2).equals(name);
                if (map.get(surname2).equals(name) && surname!=surname2){
                    toDelete.add(surname);
                }
            }
        }
        for(String surname:toDelete){
            map.remove(surname);
        }
        System.out.println(map);
    }

    static void task2(){
        City cities[] = {
                new City("Москва", "Россия"),
                new City("Санкт-Петербург", "Россия"),
                new City("Кёльн", "Германия"),
                new City("Берлин","Германия"),
                new City("Лондон", "Англия"),
                new City("Тверь","Россия")
        };
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(City city:cities){
            if (map.containsKey(city.country)) map.get(city.country).add(city.city);
            else {
                map.put(city.country, new ArrayList<String>());
                map.get(city.country).add(city.city);
            }
        }
        System.out.println(map);
    }
}

class City{
    String city;
    String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
