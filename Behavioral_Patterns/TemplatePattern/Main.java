package Behavioral_Patterns.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        Template tea = new Tea();
        tea.PrepareRecipe();
        System.out.println();
        Template coffee = new Coffee();
        coffee.PrepareRecipe();

    }
}
