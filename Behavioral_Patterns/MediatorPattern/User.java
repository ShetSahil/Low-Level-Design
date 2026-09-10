package Behavioral_Patterns.MediatorPattern;

public class User implements UserInterface{
    public String name;
    public ChatRoomInterface mediator;

    public User( String name){
        this.name=name;
    }
    public void addedInGroup(ChatRoomInterface mediator){
        this.mediator=mediator;
    }

    public void send(String message){
        System.out.println(this.name + " has sent the message : "+message);
        mediator.sendMessage(message,this);
    }

    public void receive(String message){
        System.out.println(this.name + " has received the message : "+message);
    }
}
