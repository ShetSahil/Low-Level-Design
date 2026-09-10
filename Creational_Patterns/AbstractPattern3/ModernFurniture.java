package Creational_Patterns.AbstractPattern3;

public class ModernFurniture implements FurnitureFactory {
    public Chair createChair(){
        return new ModernChair();
    }

    public Sofa createSofa(){
        return new ModernSofa();
    }

}
