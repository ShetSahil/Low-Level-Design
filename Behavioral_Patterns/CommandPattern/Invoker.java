package Behavioral_Patterns.CommandPattern;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
