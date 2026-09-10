package AbstractPattern2;

public class Client {
    public static void main(String[] args){
        //method 1

        // FactoryProducer factory = new FactoryProducer();
        // AbstractFactory abstractFactory = factory.getFactory("fit");
        // Person person = abstractFactory.createPerson();
        // Diet diet = abstractFactory.createDiet();
        // System.out.println(person.getPerson());
        // System.out.println(diet.getDiet());

        // abstractFactory = factory.getFactory("fat");
        // person = abstractFactory.createPerson();
        // diet = abstractFactory.createDiet();
        // System.out.println(person.getPerson());
        // System.out.println(diet.getDiet());

        //method 2

        AbstractFactory abstractFactory = FactoryProducer.getFactory("fit");
        Person person = abstractFactory.createPerson();
        Diet diet = abstractFactory.createDiet();
        System.out.println(person.getPerson());
        System.out.println(diet.getDiet());
    }
    
}
