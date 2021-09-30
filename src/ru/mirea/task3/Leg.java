package ru.mirea.task3;

public class Leg {
    private String talent;

    public Leg(String talent){
        this.talent = talent;
    }

    public Leg(){
        talent = "run";
    }

    public String getTalent(){
        return talent;
    }

    public void setTalent(String talent){
        this.talent = talent;
    }

    public String toString(){
            return "can " + talent + " with their legs";
    }
}
