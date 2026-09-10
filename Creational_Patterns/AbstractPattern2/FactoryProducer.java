package AbstractPattern2;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type==null)return null;

        if(type.equalsIgnoreCase("fit")){
            return new FitFactory();
        }
        else{
            return new FatFactory();
        }
    }
    
}
