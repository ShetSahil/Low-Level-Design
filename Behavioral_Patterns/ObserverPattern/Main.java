package Behavioral_Patterns.ObserverPattern;

public class Main {
    public static void main(String[] args){
        Observer ob1 = new Subscribers("Sahil");
        Observer ob2 = new Subscribers("Shreya");
        Observer ob3 = new Subscribers("Chitharanjan");
        Subject channel1 = new YoutubeChannel();
        System.out.println("New video has been uploaded:");
        channel1.subscribe(ob1);
        channel1.subscribe(ob2);
        channel1.subscribe(ob3);
        channel1.notifyObservers();
    }
}
