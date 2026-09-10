package Creational_Patterns.AbstractPattern3;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurniture();
        Chair chair = modernFactory.createChair();
        chair.canSitOn();
        Sofa sofa = modernFactory.createSofa();
        sofa.canLieOn();

        // FurnitureFactory vicotiranFactory = new VictorianFurniture();
        // Sofa sofa = vicotiranFactory.createSofa();
        // sofa.canLieOn();


        //<-- Without Abstract Pattern-->>
        // IfWithFactory factory = new IfWithFactory();
        // Chair chair = factory.createChair("modern");
        // chair.canSitOn();

        // Sofa sofa = factory.createSofa("vicotrian");
        // sofa.canLieOn();
    }
}
