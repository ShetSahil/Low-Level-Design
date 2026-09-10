package Creational_Patterns.AbstractPattern3;

public class VictorianFurniture implements FurnitureFactory {
    public Chair createChair(){
        return new VicotrianChair();
    }
    public Sofa createSofa(){
        return new VictorianSofa();
    }
}
