package Structural_Patterns.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    
    public String getDescription(){
        return coffee.getDescription()+" with Milk";
    }
    public double getCost(){
        return coffee.getCost()+5.0;
    }

}
