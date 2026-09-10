package Behavioral_Patterns.ObserverPattern;
import java.util.List;
import java.util.ArrayList;

public class YoutubeChannel implements Subject {
    private List<Observer> observers;

    public YoutubeChannel() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("New video uploaded!");
        }
    }
    
}
