package Behavioral_Patterns.CommandPattern;

public class TurnOn  implements Command {
    private Switchable switchable;

    public TurnOn(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        switchable.turnOn();
    }
}
