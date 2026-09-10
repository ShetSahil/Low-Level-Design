package Behavioral_Patterns.TemplatePattern;

public class Tea  extends Template{
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void pourInCup() {
        System.out.println("Pouring tea in cup");
    }
    
}
