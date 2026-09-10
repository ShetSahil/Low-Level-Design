package Structural_Patterns.ProxyPattern.ProxyPattern1;

public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("rohit45_original.png");
        // Image image2 = new RealImage("rohit45_original.png");

        image1.display();
        image1.display();
    }
}
