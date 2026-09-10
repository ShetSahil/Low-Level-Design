package Behavioral_Patterns.CommandPattern;

public class TurnOff implements Command {
    private Switchable switchable;

    public TurnOff(Switchable switchable) {
        this.switchable = switchable;
    }
    
    @Override
    public void execute() {
        switchable.turnOff();
    }
}
