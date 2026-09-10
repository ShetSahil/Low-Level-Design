package Behavioral_Patterns.TemplatePattern;

public class Coffee extends Template {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring coffee in cup");
    }
}
