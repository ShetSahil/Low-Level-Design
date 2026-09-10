package Creational_Patterns.FactoryPattern;

public class PersonFactoryTest {
    

    static void main(String[] args) {
        PersonFactory persons = new PersonFactory();
        Person fitPerson = persons.getPerson("fit");
        Person fatPerson = persons.getPerson("fat");
        Person slimPerson = persons.getPerson("slim");
        System.out.println(fitPerson.getPerson());
        System.out.println(fatPerson.getPerson());
        System.out.println(slimPerson.getPerson());
    }
}
