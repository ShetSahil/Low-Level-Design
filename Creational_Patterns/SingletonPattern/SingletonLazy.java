package Creational_Patterns.SingletonPattern;
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        // private constructor to prevent instantiation
    }

    public static SingletonLazy getInstance(){
        try{
            if(instance==null){
                instance=new SingletonLazy();
            }
        } catch(Exception e){
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
        return instance;
    }
}

