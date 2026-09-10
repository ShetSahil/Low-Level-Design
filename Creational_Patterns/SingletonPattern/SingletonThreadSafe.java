package Creational_Patterns.SingletonPattern;
public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){

    }

    public static SingletonThreadSafe getInstance(){
        try{
            synchronized(SingletonThreadSafe.class){
                if(instance==null){
                    instance=new SingletonThreadSafe();
                }
            }
        } catch(Exception e){
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
        return instance;
    }
}
