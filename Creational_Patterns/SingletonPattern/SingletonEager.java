package Creational_Patterns.SingletonPattern;
class SingletonEager{
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        // private constructor to prevent instantiation
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}