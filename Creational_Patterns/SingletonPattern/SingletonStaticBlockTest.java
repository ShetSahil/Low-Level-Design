package Creational_Patterns.SingletonPattern;
class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
        System.out.println("SingletonStaticBlock instance 1 hashcode: " + instance1.hashCode());
        System.out.println("SingletonStaticBlock instance 2 hashcode: " + instance2.hashCode());
    }
}
