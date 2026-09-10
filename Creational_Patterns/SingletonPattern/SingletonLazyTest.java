package SingletonPattern;
public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
        System.out.println("SingletonLazy instance 1 hashcode: " + instance1.hashCode());
        System.out.println("SingletonLazy instance 2 hashcode: " + instance2.hashCode());
    }
}
