package Behavioral_Patterns.ObserverPattern;

public class Subscribers implements Observer {
    private String name;
    public Subscribers(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
