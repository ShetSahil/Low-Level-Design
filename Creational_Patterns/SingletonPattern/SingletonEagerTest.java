package Creational_Patterns.SingletonPattern;
class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getInstance();
        SingletonEager instance2 = SingletonEager.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
        System.out.println("SingletonEager instance 1 hashcode: " + instance1.hashCode());
        System.out.println("SingletonEager instance 2 hashcode: " + instance2.hashCode());
    }
}
