package AbstractPattern2;

public class FatFactory implements AbstractFactory {
    @Override
    public Person createPerson() {
        return new FatPerson();
    }

    @Override
    public Diet createDiet() {
        return new UnHealthyDiet();
    }
}
