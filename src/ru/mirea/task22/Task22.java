package ru.mirea.task22;

public class Task22 {
    public static void main(String[] args) {
        ChairFabric CH = new ChairFabric();
        Chair chair = CH.getChair(2);
        Client client = new Client();
        client.Sit(chair);
    }
}

class Client{
    void Sit(Chair chair){
        System.out.println("Вы сели на " + chair.getName());
    }
}

interface Chair{
    String getName();
}

class VictorianChair implements Chair{

    @Override
    public String getName() {
        return "викторианский стул";
    }
}

class MultifunctionChair implements Chair{

    @Override
    public String getName() {
        return "многофункциональный стул";
    }
}

class MagicChair implements Chair{

    @Override
    public String getName() {
        return "магический стул";
    }
}

class ChairFabric{
    Chair getChair(int chair){
        switch (chair){
            case 1:
                return new VictorianChair();
            case 2:
                return new MagicChair();
            case 3:
                return new MultifunctionChair();
        }
        return null;
    }
}
