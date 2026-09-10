package Behavioral_Patterns.MediatorPattern;
import java.util.*;
public class ChatRoom implements ChatRoomInterface{
    public List<User> users;
    public ChatRoom(){
        users=new ArrayList<>();
    }

    public void addUsers(User user){
        users.add(user);
    }
    public void removeUsers(User user){
        users.remove(user);
    }

    public void sendMessage(String message , User sender){
        for(User user : users){
            if(user!=sender){
                user.receive(message);
            }
        }
    }
}
