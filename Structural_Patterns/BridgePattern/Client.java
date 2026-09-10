package Structural_Patterns.BridgePattern;

public class Client {
    public static void main(String[] args){
        Shape redCircle = new Circle(new Red());
        Shape greenCircle = new Circle(new Green());
        Shape blueCircle = new Circle(new Blue());

        Shape redSquare = new Square(new Red());
        Shape greenSquare = new Square(new Green());
        Shape blueSquare = new Square(new Blue());

        redCircle.displayShape();
        greenCircle.displayShape();
        blueCircle.displayShape();

        redSquare.displayShape();
        greenSquare.displayShape();
        blueSquare.displayShape();
    }
}
