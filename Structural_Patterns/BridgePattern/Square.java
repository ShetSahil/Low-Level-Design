package Structural_Patterns.BridgePattern;

public class Square extends Shape{
    public Square(Color color){
        super(color);
    }

    public void displayShape(){
        System.out.print("Square ");
        color.displayColor();
    }

}
