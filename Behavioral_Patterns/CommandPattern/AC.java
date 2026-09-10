package Behavioral_Patterns.CommandPattern;

public class AC implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("AC is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is OFF");
    }
}
