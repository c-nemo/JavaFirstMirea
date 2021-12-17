package ru.mirea.task17;

import java.util.Scanner;

enum planets {
    MERCURY(3.3*Math.pow(10,23), 2.42*Math.pow(10,6)),
    VENUS(4.9*Math.pow(10,24), 6.10*Math.pow(10,6)),
    EARTH(6*Math.pow(10,24), 6.4*Math.pow(10,6)),
    MARS(6.4*Math.pow(10,23), 3.4*Math.pow(10,6)),
    JUPITER(1.9*Math.pow(10,27), 7.1*Math.pow(10,7)),
    SATURN(5.7*Math.pow(10,26), 6.0*Math.pow(10,7)),
    URANUS(8.7*Math.pow(10,25), 2.6*Math.pow(10,7)),
    NEPTUN(1.0*Math.pow(10,26), 2.5*Math.pow(10,7));

    public double mass, radius;
    planets(double mass, double radius){
        this.mass=mass;
        this.radius=radius;
    }

    public double getG(){
        return 6.67*Math.pow(10, -11)*this.mass/Math.pow(this.mass, 2);
    };

    @Override
    public String toString() {
        return ", info {" +
                "mass = " + mass +
                ", radius = " + radius +
                ", g = " + getG() +
                '}';
    }
}

public class PlanetsTest {
    public static void main(String[] args) {
        System.out.println("Выберите планету: ");
        int menu=-1;
        Scanner scanner = new Scanner(System.in);
        do {
            menu = scanner.nextInt();
            planets planet = getPlanet(menu);
            if (planet!=null){
                System.out.println(planet.name() + planet);
            }else{
                System.out.println("Введите число от 1 до 8 или 0 для выхода: ");
            }
        }while(menu!=0);
    }

    static planets getPlanet(int card){
        switch (card){
            case 1:
                return planets.MERCURY;
            case 2:
                return planets.VENUS;
            case 3:
                return planets.EARTH;
            case 4:
                return planets.MARS;
            case 5:
                return planets.JUPITER;
            case 6:
                return planets.SATURN;
            case 7:
                return planets.URANUS;
            case 8:
                return planets.NEPTUN;
        }
        return null;
    }
}