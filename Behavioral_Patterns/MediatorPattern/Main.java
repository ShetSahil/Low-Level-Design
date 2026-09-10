package Behavioral_Patterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatRoom WhatsapGroup = new ChatRoom();

        User sahil = new User("Sahil");
        User karan = new User("Karan");
        User lavu = new User("Lavu");

        sahil.addedInGroup(WhatsapGroup);
        karan.addedInGroup(WhatsapGroup);
        lavu.addedInGroup(WhatsapGroup);

        WhatsapGroup.addUsers(sahil);
        WhatsapGroup.addUsers(karan);
        WhatsapGroup.addUsers(lavu);

        sahil.send("Hii Chutiyoo");
    }
}
