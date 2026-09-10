package Creational_Patterns.FactoryPattern;

public class PersonFactory {
    public Person getPerson(String personType) {
        if (personType == null) {
            return null;
        }
        if (personType.equalsIgnoreCase("FAT")) {
            return new Fat();
        } else if (personType.equalsIgnoreCase("FIT")) {
            return new Fit();
        } else if (personType.equalsIgnoreCase("SLIM")) {
            return new Slim();
        }
        return null;
    }
}
