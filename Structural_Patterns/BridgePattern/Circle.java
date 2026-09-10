package Structural_Patterns.BridgePattern;

public class Circle extends Shape {

    public Circle(Color color){
        super(color);
    }

    public void displayShape(){
        System.out.print("Circle ");
        color.displayColor();
    }
    
}
