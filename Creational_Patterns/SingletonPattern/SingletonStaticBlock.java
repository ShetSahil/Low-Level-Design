package Creational_Patterns.SingletonPattern;
class SingletonStaticBlock{
    private static SingletonStaticBlock instance;
    
    private SingletonStaticBlock() {
        // private constructor to prevent instantiation
    }
    
    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }
    
    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}