package Behavioral_Patterns.TemplatePattern;

abstract class Template {
     
    public void PrepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        serve();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void serve(){
        System.out.println("Serving");
    }

    abstract void brew();
    abstract void pourInCup();

}
