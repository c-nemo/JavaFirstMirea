package ru.mirea.task26;

public class Task26 {
    public static void main(String[] args) {
        PaymentMethod pm = new creditCard();
        pm.askData();

        pm = new eWallet();
        pm.askData();
    }
}

interface PaymentStrategy{
    void askData();
}

class creditCardStrategy implements PaymentStrategy{
    @Override
    public void askData() {
        System.out.println("Введите данные карточки");
    }
}

class eWallletStrategy implements PaymentStrategy{
    @Override
    public void askData() {
        System.out.println("Введите данные своего электронного кошелька");
    }
}

class PaymentMethod {
    PaymentStrategy paymentStrategy;
    public PaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    void askData(){
        paymentStrategy.askData();
    }
}

class eWallet extends PaymentMethod {

    public eWallet() {
        super(new eWallletStrategy());
    }
}

class creditCard extends PaymentMethod {

    public creditCard() {
        super(new creditCardStrategy());
    }
}