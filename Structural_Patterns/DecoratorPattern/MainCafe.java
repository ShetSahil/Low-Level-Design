package Structural_Patterns.DecoratorPattern;

public class MainCafe {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() +"="+ coffee.getCost());
        
        CoffeeDecorator coffeedecorator = new MilkDecorator(coffee);
        System.out.println(coffeedecorator.getDescription()+"="+coffeedecorator.getCost());
    }
}
