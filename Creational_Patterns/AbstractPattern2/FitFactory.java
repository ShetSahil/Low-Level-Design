package AbstractPattern2;

public class FitFactory implements AbstractFactory {
    @Override
    public Person createPerson(){
        return new FitPerson();
    }
    public Diet createDiet(){
        return new HealthyDiet();
    }
    
}
