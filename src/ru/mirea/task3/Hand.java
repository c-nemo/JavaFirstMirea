package ru.mirea.task3;

public class Hand {
    private String talent;

    public Hand(String talent){
        this.talent = talent;
    }

    public Hand(){
        talent = "write";
    }

    public String getTalent(){
        return talent;
    }

    public void setTalent(String talent){
        this.talent = talent;
    }

    public String toString(){
        return "can " + talent + " with their hands";
    }
}
