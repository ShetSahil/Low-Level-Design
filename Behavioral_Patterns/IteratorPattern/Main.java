package Behavioral_Patterns.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();

        MyIterator iterator = collection.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
