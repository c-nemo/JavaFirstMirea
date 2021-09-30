package ru.mirea.task3;

public class Head {
    private String talent;

    public Head(String talent){
        this.talent = talent;
    }

    public Head(){
        talent = "think";
    }

    public String getTalent(){
        return talent;
    }

    public void setTalent(String talent){
        this.talent = talent;
    }

    public String toString(){
        return "can " + talent + " with their head";
    }
}