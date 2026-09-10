package Structural_Patterns.AdapterPattern.AdapterPractice1;

public class Client {
    public static void main(String[] args){
        NewFunction newFunction= new NewFunction(50000,123456);
        AdapterInterface adapter = new Adapter();
        LegacyFunction convertedLegacyFunction = adapter.convert(newFunction);
        convertedLegacyFunction.display();
        
    }
}
