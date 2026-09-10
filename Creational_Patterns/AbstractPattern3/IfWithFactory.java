package Creational_Patterns.AbstractPattern3;

public class IfWithFactory {
    public Chair createChair(String name){
        if(name.equalsIgnoreCase("modern")){
            return new ModernChair();
        }else{
            return new VicotrianChair();
        }
    }
    public Sofa createSofa(String name){
        if(name.equalsIgnoreCase("modern")){
            return new ModernSofa();
        }else{
            return new VictorianSofa();
        }
    }
}
