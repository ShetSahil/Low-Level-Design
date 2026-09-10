package SingletonPattern;
public class SingletonThreadSafeTest {
    public static void main(String[] args) {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
        System.out.println("SingletonThreadSafe instance 1 hashcode: " + instance1.hashCode());
        System.out.println("SingletonThreadSafe instance 2 hashcode: " + instance2.hashCode());
    }
}
