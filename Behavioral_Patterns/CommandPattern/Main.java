package Behavioral_Patterns.CommandPattern;

public class Main {
    public static void main (String[] args) {
        Switchable light = new Light();
        Switchable ac = new AC();

        Command lightOnCommand = new TurnOn(light);
        Command acOnCommand = new TurnOn(ac);
        Command lightOffCommand = new TurnOff(light);
        Command acOffCommand = new TurnOff(ac);

        Invoker invoker = new Invoker();

        invoker.setCommand(lightOnCommand);
        invoker.pressButton();

        invoker.setCommand(acOnCommand);
        invoker.pressButton();

        invoker.setCommand(lightOffCommand);
        invoker.pressButton();

        invoker.setCommand(acOffCommand);
        invoker.pressButton();
    }
}
