package ru.mirea.task14;

import java.util.*;

public class Game {
    static Player first = new Player("first");
    static Player second = new Player("second");
    static int turns = 0;

    public static void main(String[] args) {
        newGame2();
        while (turns<106){
            Card firstCard = first.toReveal();
            Card secondCard = second.toReveal();
            if (Card.compare(firstCard, secondCard)==1){
                first.addCard(firstCard, secondCard);
            }else{
                second.addCard(secondCard, firstCard);
            }
            if (first.isEmpty()){
                System.out.println("second " + (turns+1));
                break;
            }
            if (second.isEmpty()){
                System.out.println("first " + (turns+1));
                break;
            }
            ++turns;
        }
        if (turns==106){
            System.out.println("botva");
        }
    }

    static void newGame2(){
        turns=0;
        first.clearHand();
        second.clearHand();
        System.out.println("Введите карты первого игрока");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            first.addCard(new Card(scanner.nextInt()));
        }
        System.out.println("Введите карты второго игрока");
        for(int i=0; i<5; i++){
            second.addCard(new Card(scanner.nextInt()));
        }
        System.out.print("Первый игрок: ");
        System.out.println(first.toString());
        System.out.print("Второй игрок: ");
        System.out.println(second.toString());
        System.out.println("Игра началась");
    }

    static void newGame(){
        turns=0;
        first.clearHand();
        second.clearHand();
        Random rand = new Random();
        ArrayList<Card> arr = new ArrayList<>();
        for (int i=0; i<10; i++){
            arr.add(new Card(i));
        }
        Player curr = first;
        for (int i=0; i<10; i++){
            Card card = arr.get(rand.nextInt(arr.size()));
            arr.remove(card);
            curr.addCard(card);
            if (curr==first){
                curr=second;
            }else{
                curr=first;
            }
        }

        System.out.print("Первый игрок: ");
        System.out.println(first.toString());
        System.out.print("Второй игрок: ");
        System.out.println(second.toString());
        System.out.println("Игра началась");
    }
}

class Card{
    int value;

    public Card(int value) {
        this.value = value;
    }

    static public int compare(Card o1, Card o2) {
        if ((o1.value==0 || o1.value==9) && (o2.value==0 || o2.value==9)){
            if (o1.value==0 && o2.value==9){
                return 1;
            }
            else if(o1.value==9 && o2.value==0){
                return -1;
            }
            else {
                return 0;
            }
        }
        else{
            if(o1.value>o2.value){
                return 1;
            }
            else if(o1.value<o2.value){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                '}';
    }
}

class Player{
    LinkedList<Card> hand = new LinkedList<Card>();
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card c1){
        hand.addLast(c1);
    }

    public void addCard(Card c1, Card c2){
        hand.addLast(c1);
        hand.addLast(c2);
    }

    public Card toReveal(){
        return hand.pollFirst();
    }

    public void clearHand(){
        if (hand.size()!=0){
            hand.clear();
        }
    }

    public boolean isEmpty(){
        return hand.isEmpty();
    }

    @Override
    public String toString() {
        return "Player{" +
                "hand=" + hand.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}